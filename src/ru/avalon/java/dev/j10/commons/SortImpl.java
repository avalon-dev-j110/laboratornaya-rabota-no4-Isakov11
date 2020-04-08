/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.dev.j10.commons;
import java.util.Arrays;
import java.util.Comparator;
import ru.avalon.java.dev.j10.labs.Sort;

public class SortImpl implements Sort{

    @Override
    public void sort(Object[] array) {
        if (array == null || array.length == 0){
            throw new IllegalArgumentException("Array is empty or null");            
        }
        throw new IllegalArgumentException("Objects is not comparable");        
    }

    @Override
    public void sort(Comparable[] array) {
        if (array == null || array.length == 0){
            throw new IllegalArgumentException("Array is empty or null");            
        }        
        Arrays.sort(array);

    }

    @Override
    public void sort(Object[] array, Comparator comparator) {
        if (array == null || array.length == 0){
            throw new IllegalArgumentException("Array is empty or null");            
        }
        if (comparator == null){
            throw new IllegalArgumentException("Comparator is null");            
        }        
        Arrays.sort(array,comparator);
    }
    
}
