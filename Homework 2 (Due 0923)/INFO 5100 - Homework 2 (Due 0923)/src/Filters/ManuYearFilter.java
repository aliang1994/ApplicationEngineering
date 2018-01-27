/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Filters;

import Business.*;
import java.util.ArrayList;

/**
 *
 * @author Wenqing
 */

public class ManuYearFilter extends Filter {  
    private int year;
    @Override
    public ArrayList<Airplane> sort(ArrayList<Airplane> list) {        
        ArrayList<Airplane> yrList = new ArrayList<Airplane>();
        for(Airplane air: list){                        
            if(air.getYearManufactured()==year){
                yrList.add(air);
            }
        }
        return yrList;        
    }    
    
    public int setYear(int i){
        this.year = i;
        return year;
    }
}