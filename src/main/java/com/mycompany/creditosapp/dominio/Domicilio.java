/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.creditosapp.dominio;

/**
 *
 * @author leza1289
 */
public class Domicilio {
    private String calle;
    private int numero;
    private String piso;
    private String provincia;
    
    @Override
    public String toString(){
        return "Calle "+ this.calle + " Nro. "+ this.numero +" Piso "+ this.piso + " Provincia "+ this.provincia;
    }
    

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
}
