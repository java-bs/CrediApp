/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.creditosapp.dominio;

import java.util.Date;

/**
 *
 * @author leza1289
 */
public class DocumentoDigital {
    private String nombre;
    private Date fechaDeCarga;
    private Byte imagen;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaDeCarga() {
        return fechaDeCarga;
    }

    public void setFechaDeCarga(Date fechaDeCarga) {
        this.fechaDeCarga = fechaDeCarga;
    }

    public Byte getImagen() {
        return imagen;
    }

    public void setImagen(Byte imagen) {
        this.imagen = imagen;
    }
}
