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
public class PrestamoPersonal extends Prestamo {
    private String situacionVeraz;

    public PrestamoPersonal(BigDecimal monto, int cantidadCuotas) {
        super(monto, cantidadCuotas);
    }

    public String getSituacionVeraz() {
        return situacionVeraz;
    }

    public void setSituacionVeraz(String situacionVeraz) {
        this.situacionVeraz = situacionVeraz;
    }
    
}
