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
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 *
 * @author leza1289
 */
@Controller
public class PaginasController {
    
    @RequestMapping(method = GET, path = "/prestamos")
    public String paginaPrestamos(Model model){
        
        Banco bancoSaenz = Banco.obtenerBanco();
        
        BigDecimal monto = new BigDecimal("3333.44");
        PrestamoPersonal prestamoWeb = new PrestamoPersonal(bancoSaenz, monto, 18);
        prestamoWeb.setFechaAdjudicacion(LocalDate.of(2019, 05, 10));
        prestamoWeb.setFechaAcreditacion(LocalDate.of(2019, 05, 15));
        prestamoWeb.setNumero(1);
        
        monto = new BigDecimal("5555.66");
        PrestamoPrendario prestamoLocal = new PrestamoPrendario(bancoSaenz, monto, 24);
        prestamoLocal.setGarantia("Garante abrochado");
        prestamoLocal.setFechaAdjudicacion(LocalDate.of(2019, 8, 8));
        prestamoLocal.setFechaAcreditacion(LocalDate.of(2019, 8, 21));        
        prestamoLocal.setNumero(2);

        monto = new BigDecimal("7777.77");
        PrestamoPrendario prestamoTelef = new PrestamoPrendario(bancoSaenz, monto, 36);
        prestamoTelef.setGarantia("Garante seguro");
        prestamoTelef.setFechaAdjudicacion(LocalDate.of(2019, 11, 8));
        prestamoTelef.setFechaAcreditacion(LocalDate.of(2020, 05, 10));         
        prestamoTelef.setNumero(3);
        
        Prestamo[] prestamosCliente = {
            prestamoWeb,
            prestamoLocal,
            prestamoTelef        
        };
        
        List<Prestamo> prestamosList = asList(prestamosCliente);
        
        model.addAttribute("prestamos", prestamosList);
        model.addAttribute("otroPrestamo", prestamoTelef);
        return "prestamos-pagina";
    }
    
    @RequestMapping(method = GET, path = "/clientes")
    public String paginaClientes(Model model){
        
        Domicilio domicilio1 = new Domicilio();
        domicilio1.setCalle("A.Villaflor");
        domicilio1.setNumero(108);
        domicilio1.setPiso("-");
        domicilio1.setProvincia("Buenos Aires");

        Cliente cliente1 = new Cliente("Alexis Leza");
        cliente1.setDni("23277220");
        cliente1.setDomicilio(domicilio1);
        BigDecimal ingresos = new BigDecimal("65000");
        cliente1.setIngresos(ingresos);
        
        Domicilio domicilio2 = new Domicilio();
        domicilio2.setCalle("Av. Mitre");
        domicilio2.setNumero(2142);
        domicilio2.setPiso("-");
        domicilio2.setProvincia("Sarandi");

        Cliente cliente2 = new Cliente("John McNamara");
        cliente2.setDni("9840521");
        cliente2.setDomicilio(domicilio2);
        BigDecimal ingresos2 = new BigDecimal("2650000");
        cliente1.setIngresos(ingresos2);        
        
        Cliente[] totalClientes = {
            cliente1,
            cliente2
        };

        List<Cliente> clientesList = asList(totalClientes);
        
        model.addAttribute("clientes", clientesList);

        
        return "clientes";
    }
    
}
