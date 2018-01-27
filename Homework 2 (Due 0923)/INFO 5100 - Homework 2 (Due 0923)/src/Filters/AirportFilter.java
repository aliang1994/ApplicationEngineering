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
public class AirportFilter extends Filter {
    private String airport;
    @Override
    public ArrayList<Airplane> sort(ArrayList<Airplane> list) {
        ArrayList<Airplane> airportList = new ArrayList<Airplane>();
         for(Airplane air: list){                        
            if(air.getCurrentAirport().equals(airport) ){
                airportList.add(air);
            }
        }       
        return airportList;
    }
    
    public String setAirport(String s){
        this.airport = s;
        return airport;
    }
}