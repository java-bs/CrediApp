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
import com.mycompany.creditosapp.dominio.PrestamoPersonal;
import com.mycompany.creditosapp.dominio.PrestamoPrendario;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author leza1289
 */

@SpringBootApplication
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        
        SpringApplication.run(Main.class, args);

        Banco bancoSaenz = Banco.obtenerBanco();
        String codigoDelBanco = bancoSaenz.getCodigo();
        System.out.println(Banco.convertirAString());
        System.out.println("bancoSaenz : "+ bancoSaenz);
        
        Banco bancoLorfin = Banco.obtenerBanco();
        String codigoBancoDos = bancoLorfin.getCodigo();
        System.out.println(Banco.convertirAString());
        System.out.println("bancoLorfin : "+ bancoLorfin);
                
        BigDecimal monto;
        monto = new BigDecimal("15000.66");
        
        //BigDecimal tasa = new BigDecimal(12);
        
        //monto.setScale(2); // le decimos que va a tener 5 decimales
        //monto = new BigDecimal(15000.99);

       // Prestamo prestamo1 = new Prestamo(bancoSaenz, monto, 12);
//        ahora12.setCantidadCuotas(12);
//        ahora12.setPlazoEnMeses(12);
//        ahora12.setTasa(tasa);

//        monto.setScale(5); // le decimos que va a tener 5 decimales
        monto = new BigDecimal("8742.25");
        //Prestamo prestamo2 = new Prestamo(bancoSaenz, monto, 6);
//        tasa  = new BigDecimal(18.05);
        
//        Prestamo ahora18 = new Prestamo(monto, 18);
//        ahora18.setCantidadCuotas(18);
//        ahora18.setPlazoEnMeses(18);
//        ahora18.setTasa(tasa);
        monto = new BigDecimal("3333.44");
        PrestamoPersonal prestamo3 = new PrestamoPersonal(bancoSaenz, monto, 18);
        prestamo3.setFechaAdjudicacion(LocalDate.of(2019, 05, 10));
        prestamo3.setFechaAcreditacion(LocalDate.of(2019, 05, 15));
        monto = new BigDecimal("5555.66");
        PrestamoPrendario prestamo4 = new PrestamoPrendario(bancoSaenz, monto, 24);
        prestamo4.setGarantia("Garante abrochado");
        prestamo4.setFechaAdjudicacion(LocalDate.of(2019, 8, 8));
        prestamo4.setFechaAcreditacion(LocalDate.of(2019, 8, 21));        

        monto = new BigDecimal("7777.77");
        PrestamoPrendario prestamo5 = new PrestamoPrendario(bancoSaenz, monto, 36);
        prestamo5.setGarantia("Garante seguro");
        prestamo5.setFechaAdjudicacion(LocalDate.of(2019, 11, 8));
        prestamo5.setFechaAcreditacion(LocalDate.of(2020, 05, 10));        

        
        Domicilio domicilio = new Domicilio();
        domicilio.setCalle("A.Villaflor");
        domicilio.setNumero(108);
        domicilio.setPiso("-");
        domicilio.setProvincia("Buenos Aires");

        Cliente cliente = new Cliente("John McNamara");
        cliente.setDni("23277220");
//        cliente.setNombreApellido("Alexis Leza");
        cliente.setDomicilio(domicilio);
        BigDecimal ingresos = new BigDecimal("65000");
        cliente.setIngresos(ingresos);
//prestamo1, prestamo2,
        Prestamo[] prestamos = { prestamo3, prestamo4, prestamo5}; //Creo el array
        
        cliente.setPrestamos(prestamos);   //le asigno el array

//        System.out.println("El cliente " + cliente.getNombreApellido());
        
  //      System.out.println("Prestamo creado 1 : " + prestamo1 );
   //     System.out.println("Prestamo creado 2 : " + prestamo2 );
        System.out.println("Prestamo creado 3 : " + prestamo3 );
        System.out.println("Prestamo creado 4 : " + prestamo4 );
        System.out.println("Cliente creado    : " + cliente );
//        System.out.println("El prestamo 1 tiene un monto de : " + prestamos[1].getMonto() + " Pesos");
        
        
        for (Prestamo prestamo : prestamos) {
            System.out.println("Tiene prestamos por un valor de " + prestamo.getMonto() + " Pesos");            
        }
        
        System.out.println("Se viene cliente.imprimirDatos()");
        cliente.imprimirDatos();

    }

}
