package com.swip.controller;

import com.swip.domain.Ahorro;
import com.swip.service.AhorroService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;


@Controller
@Slf4j
@RequestMapping("/ahorro")
public class AhorroController {

    @Autowired
    private AhorroService ahorroService;

    @GetMapping("/listado")
    public String inicio(Model model) {
        List<Ahorro> ahorros = ahorroService.getAllAhorros();
        model.addAttribute("ahorros", ahorros);
        return "/ahorro/listado";
    }

    @GetMapping("/nuevo")
    public String ahorroNuevo(Model model) {
        model.addAttribute("ahorro", new Ahorro());
        return "/ahorro/modifica";
    }
     

    @PostMapping("/guardar")
    public String ahorroGuardar(@ModelAttribute Ahorro ahorro, @RequestParam("icono") String icono) {
        ahorro.setIcono(icono);
        ahorroService.save(ahorro);
        return "redirect:/ahorro/listado";
    }


   @RequestMapping("/eliminar/{idAhorro}")
public String eliminarAhorro(@ModelAttribute("ahorro") Ahorro ahorro) {
    ahorroService.delete(ahorro);
    return "redirect:/ahorro/listado";
}



    @GetMapping("/modificar/{idAhorro}")
    public String modificarAhorro(Ahorro ahorro, Model model) {
        ahorro = ahorroService.getAhorro(ahorro);
        model.addAttribute("ahorro", ahorro);
        return "/ahorro/modifica";
    }
}