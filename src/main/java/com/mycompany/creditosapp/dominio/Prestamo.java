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
public class Prestamo {
    private BigDecimal monto;
    private int plazoEnMeses;
    private int cantidadCuotas;
    private BigDecimal tasa;
    private DocumentoDigital documentos;

    public Boolean cancelarCuota(int cantidad){
        Boolean cancelo = true;
        
        return cancelo;
    }
    public void cancelarPrestamo(){
        
    }
    
    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public int getPlazoEnMeses() {
        return plazoEnMeses;
    }

    public void setPlazoEnMeses(int plazoEnMeses) {
        this.plazoEnMeses = plazoEnMeses;
    }

    public int getCantidadCuotas() {
        return cantidadCuotas;
    }

    public void setCantidadCuotas(int cantidadCuotas) {
        this.cantidadCuotas = cantidadCuotas;
    }

    public BigDecimal getTasa() {
        return tasa;
    }

    public void setTasa(BigDecimal tasa) {
        this.tasa = tasa;
    }

    public DocumentoDigital getDocumentos() {
        return documentos;
    }

    public void setDocumentos(DocumentoDigital documentos) {
        this.documentos = documentos;
    }
    
}