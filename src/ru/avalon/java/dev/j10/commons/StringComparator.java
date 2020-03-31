/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.dev.j10.commons;
import java.util.Comparator;

public class StringComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        try{
            return o1.compareTo(o2);
        }
        catch (NullPointerException e){return 0;}
    }

    @Override
    public Comparator reversed() {        
        return Comparator.super.reversed();
    }
    
}
