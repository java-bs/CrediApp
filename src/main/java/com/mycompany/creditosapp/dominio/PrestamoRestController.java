/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.creditosapp.dominio;

import java.math.BigDecimal;
import java.time.LocalDate;
import static java.util.Arrays.asList;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author leza1289
 */
@RestController
public class PrestamoRestController {
    
    @RequestMapping(method = GET, path = "/apirest/prestamos")    
    public List<Prestamo> getPrestamo() {

        
        Banco bancoSaenz = Banco.obtenerBanco();
        String codigoDelBanco = bancoSaenz.getCodigo();
        System.out.println(Banco.convertirAString());
        System.out.println("bancoSaenz : "+ bancoSaenz);        
        
        BigDecimal monto = new BigDecimal("3333.44");
        PrestamoPersonal prestamo1 = new PrestamoPersonal(bancoSaenz, monto, 18);
        prestamo1.setFechaAdjudicacion(LocalDate.of(2019, 05, 10));
        prestamo1.setFechaAcreditacion(LocalDate.of(2019, 05, 15));
        
        monto = new BigDecimal("5555.66");
        PrestamoPrendario prestamo2 = new PrestamoPrendario(bancoSaenz, monto, 24);
        prestamo2.setGarantia("Garante abrochado");
        prestamo2.setFechaAdjudicacion(LocalDate.of(2019, 8, 8));
        prestamo2.setFechaAcreditacion(LocalDate.of(2019, 8, 21));        

        monto = new BigDecimal("7777.88");
        PrestamoPrendario prestamo3 = new PrestamoPrendario(bancoSaenz, monto, 36);
        prestamo3.setGarantia("Garante seguro");
        prestamo3.setFechaAdjudicacion(LocalDate.of(2019, 11, 8));
        prestamo3.setFechaAcreditacion(LocalDate.of(2020, 05, 10)); 
        
        Prestamo[] prestamosDelCliente = {
            prestamo1,
            prestamo2,
            prestamo3
        };
        
        return asList(prestamosDelCliente);
    }

    @RequestMapping(method = GET, path = "/apirest/prestamos/{numero}")
    public Prestamo obtenerPrestamoPorNumero(@PathVariable Integer numero) {

        Banco bancoSaenz = Banco.obtenerBanco();

        BigDecimal elMonto = new BigDecimal("1550.25");
        Prestamo miPrimerPrestamo = new PrestamoPersonal(bancoSaenz, elMonto, 6);
        miPrimerPrestamo.setFechaAcreditacion(LocalDate.of(2019, 10, 20));

        miPrimerPrestamo.setNumero(numero);
        
        return miPrimerPrestamo;
    }
    
    @RequestMapping(method = POST, path = "/apirest/prestamos")
    public void crearPrestamo(@RequestBody PrestamoPersonal prestamo){
        
        //No se puede usar la clase "Prestamo" porque la conversión
        // no maneja clases abstractas
        

        
        System.out.println(prestamo);
        
    }

    
}
