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
public class SerialFilter extends Filter{
    private String serial;
    @Override
    public ArrayList<Airplane> sort(ArrayList<Airplane> list) {
        ArrayList<Airplane> modelList = new ArrayList<Airplane>();
        for (Airplane air:list){
            if(air.getSerialNo().equals(serial)){
                modelList.add(air);
            }                    
        }
        return modelList;   
    }    
    
    public String setSerial (String s){
        this.serial = s;
        return serial;
    }
}