/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.swip.controller;

import com.swip.domain.Credito;
import com.swip.domain.Ingreso;
import com.swip.domain.Presupuesto;
import com.swip.service.IngresoService;
import com.swip.service.PresupuestoService;
import com.swip.service.impl.FirebaseStorageServiceImpl;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Slf4j
@RequestMapping("/presupuesto")
public class PresupuestoController {
    
    @Autowired
    private PresupuestoService presupuestoService;

    @GetMapping("/listado")
    public String inicio(Model model) {
        List<Presupuesto> presupuesto = presupuestoService.getAllPresupuesto();
        model.addAttribute("presupuestos", presupuesto);
        return "/presupuesto/listado";
    }

    @GetMapping("/nuevo")
    public String presupuestoNuevo(Model model) {
        model.addAttribute("presupuesto", new Ingreso());
        return "/presupuesto/modifica";
    }
    
    @Autowired
    private FirebaseStorageServiceImpl firebaseStorageService; 

    @PostMapping("/guardar")
    public String presupuestoGuardar(Presupuesto presupuesto) {        
        
        presupuestoService.save(presupuesto);
        return "redirect:/presupuesto/listado";
    }


   @RequestMapping(value = "/eliminar/{id_gasto}", method = RequestMethod.POST)
public String eliminarPresupuesto(@ModelAttribute("presupuesto") Presupuesto presupuesto) {
    presupuestoService.delete(presupuesto);
    return "redirect:/presupuesto/listado";
}



    @GetMapping("/modificar/{id_gasto}")
    public String modificarIngreso(Presupuesto presupuesto, Model model) {
        presupuesto = presupuestoService.getPresupuesto(presupuesto);
        model.addAttribute("presupuesto", presupuesto);
        return "/presupuesto/modifica";
    }
    
}
