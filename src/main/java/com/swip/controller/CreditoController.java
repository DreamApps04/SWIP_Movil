package com.swip.controller;

import com.swip.domain.Credito;
import com.swip.service.CreditoService;
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
        var credito = creditoService.getCreditos(0);
        model.addAttribute("credito", credito);
        model.addAttribute("totalCreditos", credito.size());
        return "/credito/creditos";
    }
    
    @GetMapping("/nuevo")
    public String creditoNuevo(Credito credito) {
        return "/credito/modifica";
    }
    
    @PostMapping("/guardar")
    public String creditoGuardar(Credito credito,
            @RequestParam("imagenFile") MultipartFile imagenFile) {        
        if (!imagenFile.isEmpty()) {
            creditoService.save(credito);
        }
        creditoService.save(credito);
        return "redirect:/credito/creditos";
    }

    @GetMapping("/eliminar/{idCredito}")
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
