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
public class PrestamoPrendario extends Prestamo {
    private String garantia;

    public PrestamoPrendario(Banco banco, BigDecimal monto, int cantidadCuotas) {
        super(banco, monto, cantidadCuotas);
    }

    public String getGarantia() {
        return garantia;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }
    
    @Override
    public void imprimirDatos() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Prestamo prendario --> Garantia : "+ garantia +"\n"
        +" Fecha de Adjudicacion ... "+ this.getFechaAdjudicacion());
    }
    
}
