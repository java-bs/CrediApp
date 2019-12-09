/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.creditosapp;

import com.mycompany.creditosapp.dominio.Banco;
import com.mycompany.creditosapp.dominio.Cliente;
import com.mycompany.creditosapp.dominio.Domicilio;
import com.mycompany.creditosapp.dominio.Prestamo;
import java.math.BigDecimal;
import java.math.RoundingMode;

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

        Banco bancoSaenz = Banco.obtenerBanco();
        String codigoDelBanco = bancoSaenz.getCodigo();
        System.out.println(Banco.convertirAString());
        System.out.println("bancoSaenz : "+ bancoSaenz);
        
        Banco bancoLorfin = Banco.obtenerBanco();
        String codigoBancoDos = bancoLorfin.getCodigo();
        System.out.println(Banco.convertirAString());
        System.out.println("bancoLorfin : "+ bancoLorfin);
                
        BigDecimal monto;
        monto = new BigDecimal(15000.66);
        
        //BigDecimal tasa = new BigDecimal(12);
        
        //monto.setScale(2); // le decimos que va a tener 5 decimales
        //monto = new BigDecimal(15000.99);

        Prestamo prestamo1 = new Prestamo(bancoSaenz, monto, 12);
//        ahora12.setCantidadCuotas(12);
//        ahora12.setPlazoEnMeses(12);
//        ahora12.setTasa(tasa);

//        monto.setScale(5); // le decimos que va a tener 5 decimales
        monto = new BigDecimal(8742.25);
        Prestamo prestamo2 = new Prestamo(bancoSaenz, monto, 6);
//        tasa  = new BigDecimal(18.05);
        
//        Prestamo ahora18 = new Prestamo(monto, 18);
//        ahora18.setCantidadCuotas(18);
//        ahora18.setPlazoEnMeses(18);
//        ahora18.setTasa(tasa);
        
        
        Domicilio domicilio = new Domicilio();
        domicilio.setCalle("A.Villaflor");
        domicilio.setNumero(108);
        domicilio.setPiso("-");
        domicilio.setProvincia("Buenos Aires");

        Cliente cliente = new Cliente("John McNamara");
        cliente.setDni("23277220");
//        cliente.setNombreApellido("Alexis Leza");
        cliente.setDomicilio(domicilio);

        Prestamo[] prestamos = {prestamo1, prestamo2}; //Creo el array
        
        cliente.setPrestamos(prestamos);   //le asigno el array

//        System.out.println("El cliente " + cliente.getNombreApellido());
        
        System.out.println("Prestamo creado : " + prestamo1 );
        System.out.println("Prestamo creado : " + prestamo2 );
        System.out.println("Cliente creado  : " + cliente );
//        System.out.println("El prestamo 1 tiene un monto de : " + prestamos[1].getMonto() + " Pesos");
        
        
        for (Prestamo prestamo : prestamos) {
            System.out.println("Tiene prestamos por un valor de " + prestamo.getMonto() + " Pesos");            
        }

    }

}
