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
public class Airliner {
    private String name;
    private FlightSchedule fs;
    private Date dateCreated;
    
    public Airliner(){
        
        dateCreated = new Date();
    }
    
    public void setFs(FlightSchedule sch){
        fs = sch;
    }

    public FlightSchedule getFs() {
        return fs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Date getDateCreated() {
        return dateCreated;
    }
    
    @Override
    public String toString(){
        return name;
    }   
}