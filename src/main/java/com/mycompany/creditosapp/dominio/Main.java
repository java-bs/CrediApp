/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.creditosapp.dominio;

import java.math.BigDecimal;

/**
 *
 * @author leza1289
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        Prestamo ahora12 = new Prestamo();
        ahora12.setCantidadCuotas(12);
        ahora12.setPlazoEnMeses(12);
        ahora12.setTasa(BigDecimal.valueOf(12.5));
        ahora12.setMonto(BigDecimal.valueOf(150000));
        
        Domicilio domicilio = new Domicilio();
        domicilio.setCalle("A.Villaflor");
        domicilio.setNumero(108);
        domicilio.setPiso("-");
        domicilio.setProvincia("Buenos Aires");
        
        Cliente cliente = new Cliente();
        cliente.setDni("23277220");
        cliente.setNombreApellido("Alexis Leza");
        cliente.setDomicilio(domicilio);
        
        cliente.setPrestamo(ahora12);                   
        
        System.out.println("El cliente "+ cliente.getNombreApellido());
        System.out.println("Tiene un prestamo por un valor de "+ cliente.getPrestamo().getMonto()+" Pesos");
        System.out.println("Y su domicilio es "+cliente.getDomicilio().getCalle()+" Nro. " +cliente.getDomicilio().getNumero());
        
        domicilio.setCalle("Cramer");
        domicilio.setNumero(110);
        cliente.cambiarDomicilio(domicilio);
        
        System.out.println("El nuevo domicilio de "+ cliente.getNombreApellido()+ " es "+ cliente.getDomicilio().getCalle()+" Nro. "+cliente.getDomicilio().getNumero());
        
        
        
    }
    
}
