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
public class Flight {
    private String flightNo;
    private String from;
    private String to;
    private String departureTime;
    private String arrivalTime;    
    private String date;
    private String timeOfDay;
    
    private ArrayList<Seat> seatList;
    
            
    public Flight(){        
        seatList = new ArrayList<Seat>();   
        createSeat();
    }
    
    private void createSeat(){
        for (int i=0; i<100; i++){
            Seat s = new Seat();
            s.setAvail(true);
            seatList.add(s);
        }
    }
    
    public ArrayList<Seat> getAvailSeat(){
        ArrayList<Seat> avail = new ArrayList<Seat>();
        for(Seat s: seatList){
            if(s.isAvail()){
                avail.add(s);
            }
        }
        return avail;
    }
    
    public ArrayList<Seat> getSeatList() {
        return seatList;
    }
    
    public int countAvailSeat(){
        ArrayList<Seat> avail = new ArrayList<Seat>();
        for (Seat s: seatList){
            if(s.isAvail()){
                avail.add(s);
            }
        }
        return avail.size();
    }

    public void setDate(String date) {
        this.date = date;
    }   
        
    public String getDate() {
        return date;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    public String getTimeOfDay() {
        return timeOfDay;
    }

    public void setTimeOfDay(String timeOfDay) {
        this.timeOfDay = timeOfDay;
    }   
    
    public String toString(){
        return flightNo;
    }
}