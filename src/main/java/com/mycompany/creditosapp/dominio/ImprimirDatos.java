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
public interface ImprimirDatos {
    // los atributos en una interfaz se llaman fields, son public, static y final, son constantes
    // por convención, se escriben en mayúsculas
    String COLORDEFAULT = "negro";
    String COLORSECUNDARIO = "azul";

    // los métodos en una interfaz son, por default, abstract y public, no tengo que especificarlo
    // no podemos implementar métodos dentro de interfaces, sólo declararlos
    void imprimirDatos();    
}
