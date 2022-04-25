/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.avbravo.jmorodbcoregenesis.documentutil;

import com.avbravo.jmorodbcoregenesis.documentutil.controller.Controller;

/**
 *
 * @author avbravo
 */
public class Jmorodbtest {

    public static void main(String[] args) {
        try {
             Controller controller = new Controller(); 
            
            System.out.println("Hello World!");
           controller.process();
        } catch (Exception e) {
            System.out.println("main() " + e.getLocalizedMessage());
        }

    }
}
