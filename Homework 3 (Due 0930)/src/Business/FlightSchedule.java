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
    
    public FlightSchedule(){
        fs = new ArrayList<Flight>();
    }

    public ArrayList<Flight> getFs() {
        return fs;
    }

    public void setFs(ArrayList<Flight> fs) {
        this.fs = fs;
    }
    
    public Flight addFlight(){
        Flight f = new Flight();
        fs.add(f);
        return f;
    }
    
    public void deleteFlight(Flight f){
        fs.remove(f);
    }    
}