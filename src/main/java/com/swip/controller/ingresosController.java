
package com.swip.controller;

import com.swip.domain.Ingreso;
import com.swip.service.IngresoService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@Slf4j
@RequestMapping("/ingreso")
public class ingresosController {
    private final IngresoService ingresoService;

    @Autowired
    public ingresosController(IngresoService ingresoService) {
        this.ingresoService = ingresoService;
    }

    @GetMapping("/listado")
    public String inicio(Model model) {
        List<Ingreso> ingresos = ingresoService.getAllIngresos();
        model.addAttribute("ingresos", ingresos);
        return "/ingreso/listado";
    }


    @GetMapping("/nuevo")
    public String ingresoNuevo(Model model) {
        model.addAttribute("ingreso", new Ingreso());
        return "/ingreso/modifica";
    }

    @PostMapping("/guardar")
    public String ingresoGuardar(@ModelAttribute Ingreso ingreso) {
        ingresoService.save(ingreso);
        return "redirect:/ingreso/listado";
    }

    @GetMapping("/eliminar/{idIngreso}")
    public String ingresoEliminar(@PathVariable long idIngreso) {
        Ingreso ingreso = new Ingreso();
        ingreso.setIdIngreso(idIngreso);
        ingresoService.delete(ingreso);
        return "redirect:/ingreso/listado";
    }

    @GetMapping("/modificar/{idIngreso}")
    public String ingresoModificar(@PathVariable long idIngreso, Model model) {
        Ingreso ingreso = new Ingreso();
        ingreso.setIdIngreso(idIngreso);
        ingreso = ingresoService.getIngreso(ingreso);
        model.addAttribute("ingreso", ingreso);
        return "/ingreso/modifica";
    }
}
