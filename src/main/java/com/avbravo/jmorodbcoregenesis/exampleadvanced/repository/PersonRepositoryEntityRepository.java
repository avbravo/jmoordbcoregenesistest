/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.avbravo.jmorodbcoregenesis.exampleadvanced.repository;

import com.jmoordbcoregenesis.annotations.Repository;
import com.avbravo.jmorodbcoregenesis.exampleadvanced.model.Person;
import com.jmoordbcoregenesis.repository.EntityRepository;

/**
 *
 * @author avbravo
 */
@Repository // caution, NOT inherited
public interface PersonRepositoryEntityRepository extends EntityRepository<Person, Long>{
    
}
