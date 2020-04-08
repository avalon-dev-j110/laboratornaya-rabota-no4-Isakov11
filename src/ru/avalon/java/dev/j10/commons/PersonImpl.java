/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.dev.j10.commons;
import java.time.*;
import ru.avalon.java.dev.j10.labs.Person;

public class PersonImpl implements Person {
    
    private String name;
    private LocalDate birthDate;

    public PersonImpl(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }
    
    @Override
    public String getName() {
        return name;
    }

    @Override 
    public LocalDate getBirthDate() {
        return birthDate;
    }
    
    @Override
    public int compareTo(Person o) {
        int result = this.name.compareTo(o.getName());
        if (result == 0) {
            result = this.birthDate.compareTo(o.getBirthDate());
        }
        return result;   
    }
}