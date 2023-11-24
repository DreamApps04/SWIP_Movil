
package com.swip.controller;

import com.swip.domain.Ingreso;
import com.swip.service.IngresoService;
import com.swip.service.impl.FirebaseStorageServiceImpl;
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
@RequestMapping("/ingreso")
public class ingresosController {

    @Autowired
    private IngresoService ingresoService;

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
    
    @Autowired
    private FirebaseStorageServiceImpl firebaseStorageService; 

    @PostMapping("/guardar")
    public String ingresoGuardar(@ModelAttribute Ingreso ingreso, @RequestParam("icono") String icono) {
        ingreso.setIcono(icono);
        ingresoService.save(ingreso);
        return "redirect:/ingreso/listado";
    }


   @RequestMapping(value = "/eliminar/{idIngreso}", method = RequestMethod.POST)
public String eliminarIngreso(@ModelAttribute("ingreso") Ingreso ingreso) {
    ingresoService.delete(ingreso);
    return "redirect:/ingreso/listado";
}



    @GetMapping("/modificar/{idIngreso}")
    public String modificarIngreso(Ingreso ingreso, Model model) {
        ingreso = ingresoService.getIngreso(ingreso);
        model.addAttribute("ingreso", ingreso);
        return "/ingreso/modifica";
    }
}

