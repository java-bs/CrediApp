/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.creditosapp;

import com.mycompany.creditosapp.dominio.Cliente;
import com.mycompany.creditosapp.dominio.Domicilio;
import com.mycompany.creditosapp.dominio.Prestamo;
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
        BigDecimal monto = new BigDecimal(150000);
        BigDecimal tasa = new BigDecimal(12);

        monto.setScale(5); // le decimos que va a tener 5 decimales
        monto = new BigDecimal(150000.25);

        Prestamo ahora12 = new Prestamo();
        ahora12.setCantidadCuotas(12);
        ahora12.setPlazoEnMeses(12);
        ahora12.setTasa(tasa);
        ahora12.setMonto(monto);

        monto.setScale(5); // le decimos que va a tener 5 decimales
        monto = new BigDecimal(8742.25);
        tasa  = new BigDecimal(18.05);
        
        Prestamo ahora18 = new Prestamo();
        ahora18.setCantidadCuotas(18);
        ahora18.setPlazoEnMeses(18);
        ahora18.setTasa(tasa);
        ahora18.setMonto(monto);
        
        
        Domicilio domicilio = new Domicilio();
        domicilio.setCalle("A.Villaflor");
        domicilio.setNumero(108);
        domicilio.setPiso("-");
        domicilio.setProvincia("Buenos Aires");

        Cliente cliente = new Cliente();
        cliente.setDni("23277220");
        cliente.setNombreApellido("Alexis Leza");
        cliente.setDomicilio(domicilio);

        Prestamo[] prestamos = {ahora12, ahora18}; //Creo el array
        
        cliente.setPrestamos(prestamos);   //le asigno el array

        System.out.println("El cliente " + cliente.getNombreApellido());
        
        System.out.println("El prestamo 0 tiene un monto de : " + prestamos[0].getMonto() + " Pesos");
        System.out.println("El prestamo 1 tiene un monto de : " + prestamos[1].getMonto() + " Pesos");
        
        
        for (Prestamo prestamo : prestamos) {
            System.out.println("Tiene prestamos por un valor de " + prestamo.getMonto() + " Pesos");
            
        }
        
        System.out.println("Y su domicilio es " + cliente.getDomicilio().getCalle() + " Nro. " + cliente.getDomicilio().getNumero());

        domicilio.setCalle("Cramer");
        domicilio.setNumero(110);
        cliente.cambiarDomicilio(domicilio);

        System.out.println("El nuevo domicilio de " + cliente.getNombreApellido() + " es " + cliente.getDomicilio().getCalle() + " Nro. " + cliente.getDomicilio().getNumero());

        System.out.println("Imprimo el objeto al que se le sobreescribió el metodo toString()");
        System.out.println("Prestamo creado " + ahora12);
                

    }

}
