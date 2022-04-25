/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.avbravo.jmorodbcoregenesis.documentutil.model;

import com.avbravo.jmoordbcdi.annotations.Entity;
import com.avbravo.jmoordbcdi.annotations.Id;
import lombok.Builder;
import lombok.Data;

/**
 *
 * @author avbravo
 */
@Data
@Builder
@Entity
public class Adress {
    @Id
    private Integer id;
    private String adress;

    public Adress() {
    }

    
    
    public Adress(Integer id, String adress) {
        this.id = id;
        this.adress = adress;
    }
    
    
}
