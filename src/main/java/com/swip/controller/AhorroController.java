package com.swip.controller;

import com.swip.domain.Ahorro;
import com.swip.service.AhorroService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping
public class AhorroController {
    
    @Autowired
    private AhorroService ahorroService;
    
    @GetMapping("/listado")
    public String inicio(Model model){
        var ahorros = ahorroService.getAhorros();
        model.addAttribute("ahorros", ahorros);
        model.addAttribute("totalahorros", ahorros.size());
        return "/ahorro/listado";
    }
    
    @GetMapping("/nuevo")
    public String ahorroNuevo(Ahorro ahorro){
        return "/ahorro/modifica";
    }
    
    
    @PostMapping("/guardar")
    public String ahorroGuardar(Ahorro ahorro){
        ahorroService.save(ahorro);
        return "redirect:/ahorro/listado";
    }
    
    
    @GetMapping("/eliminar/{idAhorro}")
    public String ahorroEliminarr(Ahorro ahorro){
        ahorroService.delete(ahorro);
        return "redirect:/ahorro/listado";
    }
    
    @GetMapping("/modificar/{idAhorro}")
    public String ahorroModificar (Ahorro ahorro, Model model){
        ahorro = ahorroService.getAhorro(ahorro);
        model.addAttribute("ahorro", ahorro);
        return "/ahorro/modifica";
    }
}
