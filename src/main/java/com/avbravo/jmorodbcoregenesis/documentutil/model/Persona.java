/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.avbravo.jmorodbcoregenesis.documentutil.model;

import com.jmoordbcoregenesis.annotations.entity.Id;
import lombok.Builder;
import lombok.Data;

/**
 *
 * @author avbravo
 */
@Data
@Builder
public class Persona {
    @Id
    private String id;
    private String name;

    public Persona() {
    }

    public Persona(String id, String name) {
        this.id = id;
        this.name = name;
    }
    
    
}
