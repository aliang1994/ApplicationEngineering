/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Filters;

import Business.Airplane;
import java.util.ArrayList;

/**
 *
 * @author Wenqing
 */
public class ManufacturerFilter extends Filter {
 
    @Override
    public ArrayList<Airplane> sort(ArrayList<Airplane> list){        
        ArrayList<Airplane> manufacturerList = new ArrayList<Airplane>();
        for (Airplane air:list){
            if(air.getManufacturer().equals("Boeing")){
                manufacturerList.add(air);
            }                    
        }
        return manufacturerList;         
    }    
}