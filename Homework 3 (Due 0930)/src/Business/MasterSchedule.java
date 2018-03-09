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
public class MasterSchedule {
    private ArrayList<FlightSchedule> listOfFlights;
    
    public MasterSchedule(){
        listOfFlights = new ArrayList<FlightSchedule>();
    }

    public ArrayList<FlightSchedule> getListOfFlights() {
        return listOfFlights;
    }

    public void setListOfFlights(ArrayList<FlightSchedule> listOfFlights) {
        this.listOfFlights = listOfFlights;
    }
    
    public FlightSchedule addSchedule(){
        FlightSchedule fs = new FlightSchedule();
        listOfFlights.add(fs);
        return fs;
    }
    
}