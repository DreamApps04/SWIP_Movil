package com.swip.service;

import java.io.IOException;
import java.util.Map;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;

public interface ReporteService {
    
    public ResponseEntity<Resource> generaReporte(
    String reporte, //El nombre del archivo llamado .jasper
            Map<String, Object> parametros, //Se pasan los parametros del archivo de jasper
                    String tipo) throws IOException; //El tipo de reporte que el usuario va a ver o descargar(csv, pdf, excel)
}
