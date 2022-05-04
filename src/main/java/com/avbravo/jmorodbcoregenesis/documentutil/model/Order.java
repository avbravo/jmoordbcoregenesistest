/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.avbravo.jmorodbcoregenesis.documentutil.model;

import com.avbravo.jmoordbcdi.annotations.Embedded;
import com.jmoordbcoregenesis.annotations.entity.Id;
import com.avbravo.jmoordbcdi.annotations.Referenced;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import lombok.Builder;
import lombok.Data;


/**
 *
 * @author avbravo
 */
@Data
@Builder
public class Order {
    @Id
    private Long id;
    private Long userId;
    private String orderNo;
    private BigDecimal amount;
    private String createTime;
    private String updateTime;
    @Embedded
    List<Persona> persona = new ArrayList<>();
    
    @Referenced(collection = "Institution",
            field = "idinstitution", javatype = "Integer", lazy = false,
            repository = "com.avbravo.autentificacion.repository.InstitutionRepository")
    private Adress adress;
    

    public Order() {
    }

    public Order(Long id, Long userId, String orderNo, BigDecimal amount, String createTime, String updateTime, List<Persona> persona,Adress adress) {
        this.id = id;
        this.userId = userId;
        this.orderNo = orderNo;
        this.amount = amount;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.persona = persona;
        this.adress = adress;
    }

   
    
}
