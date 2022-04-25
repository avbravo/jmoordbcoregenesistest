/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.avbravo.jmorodbcoregenesis.exampleadvanced.repository;

import com.avbravo.jmorodbcoregenesis.exampleadvanced.model.Person;
import com.jmoordbcoregenesis.repository.AbstractEntityRepository;
import static jakarta.faces.component.UIInput.isEmpty;
import java.util.Date;
import java.util.List;

/**
 *
 * @author avbravo
 */
public abstract class PersonRepositoryAbstractEntityRepository extends AbstractEntityRepository<Person, Long>
{
 
    // Concrete query sample with some logic
    // Can also be done with the Criteria API
    public List<Person> findByFullNameBirtdateZip(String first, String last, Date bdate, String zip)
    {
        String jpql = "from Person p where ";
        if (!isEmpty(last))
        {
            jpql += "p.lastName = :last";
        }

        return (List<Person>) getEntityManager().createQuery(jpql);
    }
 
}
