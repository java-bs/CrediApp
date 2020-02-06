/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.creditosapp.dominio;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author leza1289
 */
@RestController
public class DomicilioRestContoller {

    @Autowired
    DomicilioRepository domicilioRepository;

    @RequestMapping(method = GET, path = "/apirest/domicilios")

    public List<Domicilio> obtenerTodos() {

        List<Domicilio> domicilios = domicilioRepository.findAll();

        return domicilios;

    }
}
