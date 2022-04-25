/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.avbravo.jmorodbcoregenesis.documentutil.controller;

import com.avbravo.jmorodbcoregenesis.documentutil.model.Persona;
import com.avbravo.jmorodbcoregenesis.documentutil.model.Order;
import com.avbravo.jmorodbcoregenesis.documentutil.model.Adress;
import com.avbravo.jmoordbcdi.configuration.JmoordbConnection;
import com.avbravo.jmoordbcoregenesis.document.DocumentUtils;
import jakarta.inject.Inject;
import java.math.BigDecimal;
import java.util.Arrays;
import org.bson.Document;

/**
 *
 * @author avbravo
 */
public class Controller {
//    @Inject
//PersonaRepository personaRepository;
@Inject
 DocumentUtils documentUtils ;
     public void process(){
        try {
              JmoordbConnection jmc = new JmoordbConnection.Builder()
                    .withSecurity(false)
                    .withDatabase("jmoordbtest")
                    .withHost("")
                    .withPort(0)
                    .withUsername("")
                    .withPassword("")
                    .build();
            
            System.out.println("Hello World!");
            Order order = new Order();
            order.setId(0L);
            order.setUserId(0L);
            order.setOrderNo("1");
            order.setAmount(new BigDecimal("0"));
            order.setCreateTime("2");
            order.setUpdateTime("3");
            
            Persona persona = Persona.builder()
                    .id("7-7")
                    .name("Aristides")
                    .build();
         //   personaRepository.save(persona);
            
            Persona persona2 = Persona.builder()
                    .id("6-9")
                    .name("Stacy")
                    .build();
         
           Adress adress = Adress.builder()
                   .id(507)
                   .adress("Panama")
                   .build();
           
           order.setAdress(adress);
            order.setPersona( Arrays.asList(persona, persona2));
                    
                    
            System.out.println("raw data" + order);

            Document document = documentUtils.toDocument(order);
            System.out.println("convert to doc_ " + document);

            Order order1 = documentUtils.toObject(document, Order.class);
            System.out.println("convert to Java" + order1);
        } catch (Exception e) {
            System.out.println(" process() " + e.getLocalizedMessage());
        }

    }
}
