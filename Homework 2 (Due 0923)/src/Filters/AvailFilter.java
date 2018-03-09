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
public class AvailFilter extends Filter {
    ArrayList<Airplane> list;
    int unavail;
   
    @Override
    public ArrayList<Airplane> sort(ArrayList<Airplane> list) {
        ArrayList<Airplane> availList = new ArrayList<Airplane>();
        for(Airplane air: list){
            if(air.isIsAvailable()){
                availList.add(air);
            }
        }
        this.list = availList;
        unavail = list.size() - availList.size();
        return availList;
    }
    
    
}