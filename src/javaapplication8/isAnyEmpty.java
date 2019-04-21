/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

/**
 *
 * @author MZJ
 */
public class isAnyEmpty {
    
    public boolean isAnyEmpty(String... strArr){
    for(String s : strArr){
        if(s.equals("")) return true;
    }
    return false; 
}
}
