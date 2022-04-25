/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.avbravo.jmorodbcoregenesis.exampleadvanced.model;

import lombok.Builder;
import lombok.Data;

/**
 *
 * @author avbravo
 */
@Data
@Builder
public class Person {
    private String id;
    private String name;
}
