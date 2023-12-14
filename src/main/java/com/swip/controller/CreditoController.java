package com.swip.controller;

import com.swip.domain.Credito;
import com.swip.service.CreditoService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@Slf4j
@RequestMapping("/credito")
public class CreditoController {
    
    @Autowired
    private CreditoService creditoService;

    @GetMapping("/creditos")
    public String inicio(Model model) {
        List<Credito> creditos = creditoService.getAllCreditos(); //Obtenemos todos los datos de creditos
        model.addAttribute("creditos", creditos);
        return "/credito/creditos";
    }
    
    @GetMapping("/nuevo")
    public String creditoNuevo(Model model) {
        model.addAttribute("credito", new Credito());
        return "/credito/modifica";
    }
    
    @PostMapping("/guardar")
    public String creditoGuardar(Credito credito) {        
        
        creditoService.save(credito);
        return "redirect:/credito/creditos";
    }

    @RequestMapping("/eliminar/{idCredito}")
    public String creditoEliminar(Credito credito) {
        creditoService.delete(credito);
        return "redirect:/credito/creditos";
    }

    @GetMapping("/modificar/{idCredito}")
    public String creditoModificar(Credito credito, Model model) {
        credito = creditoService.getCredito(credito);
        model.addAttribute("credito", credito);
        return "/credito/modifica";
    }
}
