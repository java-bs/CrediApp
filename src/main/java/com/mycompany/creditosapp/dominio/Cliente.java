/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.creditosapp.dominio;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
/**
 *
 * @author leza1289
 */
public class Cliente implements ImprimirDatos {
    private int cuentaBancaria;
    private String dni;
    private String nombreApellido;
    private Domicilio domicilio;
    private BigDecimal ingresos;
    private DocumentoDigital dniDigitalizado;
    private Prestamo[] prestamos;

    public Cliente(String nombreNuevo){
        System.out.println("Creacion del cliente: "+ nombreNuevo);
        this.nombreApellido = nombreNuevo;
    }
    
    
    public Prestamo[] getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(Prestamo[] prestamo) {
        this.prestamos = prestamo;
    }

    public void cambiarDomicilio(Domicilio nuevoDomicilio){
        nuevoDomicilio.setCalle(nuevoDomicilio.getCalle());
        nuevoDomicilio.setNumero(nuevoDomicilio.getNumero());
    }
    public void actualizarIngresos(DocumentoDigital recibo, BigDecimal monto){
        
    }

    @Override
    public String toString() {
        return "Cliente{ DNI : "+ dni +" Nombre : "+ nombreApellido +" Con domicilio en : "+ domicilio +" prestamos :"+ Arrays.toString(prestamos)+ "}";
    }
    
    public int getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(int cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

//    public void setNombreApellido(String nombreApellido) {
//        this.nombreApellido = nombreApellido;
//    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public BigDecimal getIngresos() {
        return ingresos;
    }

    public void setIngresos(BigDecimal ingresos) {
        this.ingresos = ingresos;
    }

    public DocumentoDigital getDniDigitalizado() {
        return dniDigitalizado;
    }

    public void setDniDigitalizado(DocumentoDigital dniDigitalizado) {
        this.dniDigitalizado = dniDigitalizado;
    }

    @Override
    public void imprimirDatos() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        System.out.println("Impresion : "
                + "DNI" + dni +", ingresos = "+ ingresos
                + ". Color de impresion : "+ COLORDEFAULT
                );
        
//        ArrayList<Prestamo> arrayList = new ArrayList<Prestamo>();
//        arrayList.sort(Comparator.comparing(Prestamo::getFechaAdjudicacion));        
        
        //Arrays.asList es la manera que tengo de convertir una variable de tipo array a List
        List<Prestamo> listaDePrestamos = Arrays.asList(prestamos);        
        //listaDePrestamos.sort(Comparator.comparing(Prestamo::getFechaAdjudicacion).reversed());
        List<Prestamo> listaFiltrada = listaDePrestamos.stream()
                .filter(pres -> pres.getFechaAcreditacion()!= null)
                .filter(pres -> pres.getFechaAcreditacion().isBefore(LocalDate.now()))
                .collect(Collectors.toList());   
        
        listaFiltrada
                .sort(Comparator.comparing(Prestamo::getFechaAcreditacion));
        
        for (Prestamo prestamo : listaDePrestamos) {
            prestamo.imprimirDatos();
            
        }
    }


    
    
    
}
