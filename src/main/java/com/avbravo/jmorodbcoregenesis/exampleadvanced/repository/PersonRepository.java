/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.avbravo.jmorodbcoregenesis.exampleadvanced.repository;

import com.jmoordbcoregenesis.annotations.FirstResult;
import com.jmoordbcoregenesis.annotations.MaxResults;
import com.jmoordbcoregenesis.annotations.Modifying;
import com.jmoordbcoregenesis.annotations.Query;
import com.jmoordbcoregenesis.annotations.QueryParam;
import com.jmoordbcoregenesis.annotations.Repository;
import com.avbravo.jmorodbcoregenesis.exampleadvanced.model.Person;
import jakarta.persistence.LockModeType;
import java.util.Date;
import java.util.List;

/**
 *
 * @author avbravo
 */
@Repository(forEntity = Person.class)
public interface PersonRepository {
   // Method expression with ordering
    List<Person> findByLastNameLikeAndBirthdateAndAddress_ZipOrderByLastNameAsc(String lastName, Date birthdate, String zip);
 
    // JPQL Query with indexed parameters
    @Query("from Person p where p.firstName = ?1 and p.lastName = ?2")
    Person findByFullName(String first, String last);
 
    // JPQL Query with named parameters - @QueryParam optional with Java 8
    // Lock mode for update
    @Query(value = "from Person p where p.age >= :minAge", lockMode = LockModeType.PESSIMISTIC_WRITE)
    List<Person> findAllAdultsForUpdate(@QueryParam("minAge") int minAge);
 
    // Named Query with indexed parameter
    @Query(named = "Person.findBySSN")
    Person findBySSN(String ssn);
 
    // Native SQL
    @Query(value = "SELECT * FROM PERSON_TABLE p WHERE p.AGE > ?1", isNative = true)
    List<Person> findOlderThan(int age); 
    
      // Static limit
    @Query(max = 10)
    List<Person> findByAge(int age);
 
    // Paged queries
    @Query("from Person p where p.lastName like ?2") 
    List<Person> findByLastNameLike(String last, @FirstResult int from, @MaxResults int max);
    
    
    @Modifying
    @Query("update Person as p set p.classifyer = ?1 where p.classifyer = ?2")
    int updateClassifyer(String current);
 
}
