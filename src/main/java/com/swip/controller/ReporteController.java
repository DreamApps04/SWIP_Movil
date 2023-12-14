package com.swip.controller;

import com.swip.service.ReporteService;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/reportes")
public class ReporteController {
    
    @Autowired
    ReporteService reporteService;
     
    @GetMapping("/principal")
    public String principal(Model model){
        return "/reportes/principal";
    }
     
    @GetMapping("/Ingresos")
    public ResponseEntity<Resource> ingresos(@RequestParam String tipo) throws IOException{
        return reporteService.generaReporte("Ingresos", null, tipo);
    }
     
    @GetMapping("/Presupuestos")
    public ResponseEntity<Resource> presupuestos(@RequestParam String tipo) throws IOException{
        return reporteService.generaReporte("Presupuestos", null, tipo);
    }
     
    @GetMapping("/Credito")
    public ResponseEntity<Resource> credito(@RequestParam String tipo) throws IOException{
        return reporteService.generaReporte("Credito", null, tipo);
    }
     
    @GetMapping("/Ahorro")
    public ResponseEntity<Resource> ahorro(@RequestParam String tipo) throws IOException{
        return reporteService.generaReporte("Ahorro", null, tipo);
    }
}
