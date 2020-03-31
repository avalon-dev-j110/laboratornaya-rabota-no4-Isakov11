/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.dev.j10.commons;
import java.util.Date;
import ru.avalon.java.dev.j10.labs.Person;

public class ClassPerson implements Person {
    
    private String name;
    private Date birthDate;

    public ClassPerson(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }
    
    @Override
    public String getName() {
        return name;
    }

    @Override
    public Date getBirthDate() {
        return birthDate;
    }
    
    @Override
    public int compareTo(Person o) {
        try{
            int result = this.name.compareTo(o.getName());
            if (result == 0) {
                result = this.birthDate.compareTo(o.getBirthDate());
            }
            return result;
        }
        catch (NullPointerException e){return 0;}
    }
}
