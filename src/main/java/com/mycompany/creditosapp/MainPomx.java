/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.creditosapp;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import org.apache.commons.text.WordUtils;

/**
 *
 * @author leza1289
 */
public class MainPomx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws EmailException {
        // TODO code application logic here
        String texto = ("hola que tal como estas");
        String textoModif = WordUtils.capitalize(texto);
        System.out.println(textoModif);
        String textoMin = WordUtils.uncapitalize(textoModif);
        System.out.println(textoMin);
        
        Email email = new SimpleEmail();
        
        try{
        email.setHostName("smtp.googlemail.com");
        email.setSmtpPort(465);
        email.setAuthenticator(
                new DefaultAuthenticator("info@customdomain.app", "APPLICATION_SPECIFIC_PASSWORD"));
        email.setSSLOnConnect(true);
        email.setFrom("info@customdomain.app");
        email.setSubject("Prueba desde Java");
        email.setMsg("Keep trying ....");
        email.addTo("alexis.leza@gmail.com");
        email.send();
        }catch(EmailException ee) {
            ee.printStackTrace();
        }
        
    }
    
}
