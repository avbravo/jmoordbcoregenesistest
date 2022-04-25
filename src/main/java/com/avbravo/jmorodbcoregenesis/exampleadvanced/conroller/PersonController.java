/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.avbravo.jmorodbcoregenesis.exampleadvanced.conroller;

import com.jmoordbcoregenesis.annotations.QueryResult;
import com.avbravo.jmorodbcoregenesis.exampleadvanced.model.Person;
import com.avbravo.jmorodbcoregenesis.exampleadvanced.repository.PersonRepositoryQuertResultEntityRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

/**
 *
 * @author avbravo
 */
@ApplicationScoped
@Named
public class PersonController {
//    @Inject
    PersonRepositoryQuertResultEntityRepository personRepository;
    private Integer age;
    
    public void procesar(){
        // Sorting
//personRepository.findByAge(age)
//    .sortAsc(Person_.lastName)
//    .getResultList();
// 
//QueryResult<Person> result = personRepository.findByAge(age)
//    .sortDesc("lastName");
//result.changeOrder(Person_.lastName)
//    .getResultList();
 
// Dynamic Query Options
//personRepository.findBySSN(ssn)
//    .lockMode(LockModeType.WRITE)
//    .hint("org.hibernate.timeout", Integer.valueOf(10))
//    .getSingleResult();
 
// Count
long total = personRepository.findByAge(age).count();
 
// Pagination
// Query API style
QueryResult<Person> paged = personRepository.findByAge(age)
    .maxResults(10)
    .firstResult(50);
 
// or paging style
//QueryResult<Person> paged = personRepository.findByAge(age)
//    .withPageSize(10) // equivalent to maxResults
//    .toPage(5);
 
int totalPages = paged.countPages();
        
    }
}
