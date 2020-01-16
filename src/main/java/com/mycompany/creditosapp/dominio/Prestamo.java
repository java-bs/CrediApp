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
import java.time.LocalDate;
public abstract class Prestamo implements ImprimirDatos{
    private Banco banco;
    private BigDecimal monto;
    private int plazoEnMeses;
    private int cantidadCuotas;
    private BigDecimal tasa;
    private DocumentoDigital[] documentosDigitales;
    private LocalDate fechaAdjudicacion;
    private LocalDate fechaAcreditacion;
    

    public LocalDate getFechaAdjudicacion() {
        return fechaAdjudicacion;
    }

    public void setFechaAdjudicacion(LocalDate fechaAdjudicacion) {
        this.fechaAdjudicacion = fechaAdjudicacion;
    }

    public LocalDate getFechaAcreditacion() {
        return fechaAcreditacion;
    }

    public void setFechaAcreditacion(LocalDate fechaAcreditacion) {
        this.fechaAcreditacion = fechaAcreditacion;
    }
  
    
    public Prestamo(Banco banco, BigDecimal monto, int cantidadCuotas){
        this.banco = banco;
        this.monto = monto;
        this.cantidadCuotas = cantidadCuotas;        
    }
    

    public Boolean cancelarCuota(int cantidad){
        Boolean cancelo = true;
        
        return cancelo;
    }
    public void cancelarPrestamo(){
        
    }
    
    @Override
    public String toString(){
        return "Monto = "+ this.monto + " cantidad de cuotas "+ this.cantidadCuotas;        
    }
    
    public BigDecimal getMonto() {
        return monto;
    }
    
    /*
    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }*/

    public int getPlazoEnMeses() {
        return plazoEnMeses;
    }

    public void setPlazoEnMeses(int plazoEnMeses) {
        this.plazoEnMeses = plazoEnMeses;
    }

    public int getCantidadCuotas() {
        return cantidadCuotas;
    }

//    public void setCantidadCuotas(int cantidadCuotas) {
//        this.cantidadCuotas = cantidadCuotas;
//    }

    public BigDecimal getTasa() {
        return tasa;
    }

    public void setTasa(BigDecimal tasa) {
        this.tasa = tasa;
    }

    public DocumentoDigital[] getDocumentos() {
        return documentosDigitales;
    }

    public void setDocumentos(DocumentoDigital[] documentos) {
        this.documentosDigitales     = documentos;
    }

    @Override
    public void imprimirDatos() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Prestamo JAVA cantidad de cuotas : "+ cantidadCuotas + " del banco : "+ banco + "\n"+
                " Fecha de adjudicacion : "+ fechaAdjudicacion + "\n"+ "Fecha acreditacion : "+ fechaAcreditacion);
    }
    
}
