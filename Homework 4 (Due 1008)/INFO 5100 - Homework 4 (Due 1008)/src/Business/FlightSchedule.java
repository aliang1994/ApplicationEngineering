/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
import java.util.*;
/**
 *
 * @author Wenqing
 */
public class FlightSchedule {
    private ArrayList<Flight> fs;
    private String airlinername;   
    
    public FlightSchedule(){
        fs = new ArrayList<Flight>();
    }
    
    public int numFlights(){
        return fs.size();
    }
    
    
    public String getAirlinername() {
        return airlinername;
    }

    public void setAirlinername(String airlinername) {
        this.airlinername = airlinername;
    }
    
    public ArrayList<Flight> getSchedule(){
        return fs;
    }
    
    public Flight addFlight(){
        Flight f = new Flight();
        fs.add(f);
        return f;
    }
    
    public void deleteFlight(Flight f){
        fs.remove(f);
    }
    
    public ArrayList<Flight> searchFlight(String from, String to, String timeOfDay){
        ArrayList<Flight> result = new ArrayList<Flight>();
        for(Flight f: fs){
            if (f.getFrom().equals(from)  && f.getTo().equals(to) && f.getTimeOfDay().equals(timeOfDay)){
                result.add(f);
            }            
        }
        return result;
    }
}
