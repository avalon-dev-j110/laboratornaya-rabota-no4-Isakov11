/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.dev.j10.commons;
import java.util.Arrays;
import java.util.Comparator;
import ru.avalon.java.dev.j10.labs.Sort;

public class ClassSort implements Sort{

    @Override
    public void sort(Object[] array) {
        try{
            Arrays.sort(array);
        }
        catch (NullPointerException e){ }
    }

    @Override
    public void sort(Comparable[] array) {
        try{
            Arrays.sort(array);
        }
        catch (NullPointerException e){ }
    }

    @Override
    public void sort(Object[] array, Comparator comparator) {
        try{
            Arrays.sort(array,comparator);
        }
        catch (NullPointerException e){ }
    }
    
}
