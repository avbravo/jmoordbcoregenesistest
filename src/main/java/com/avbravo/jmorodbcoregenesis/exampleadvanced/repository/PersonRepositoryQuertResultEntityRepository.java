/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.avbravo.jmorodbcoregenesis.exampleadvanced.repository;

import com.jmoordbcoregenesis.annotations.QueryResult;
import com.jmoordbcoregenesis.annotations.Repository;
import com.avbravo.jmorodbcoregenesis.exampleadvanced.model.Person;

/**
 *
 * @author avbravo
 */
@Repository
public interface PersonRepositoryQuertResultEntityRepository {
    QueryResult<Person> findByAge(int age);
    QueryResult<Person> findBySSN(String ssn);
}
