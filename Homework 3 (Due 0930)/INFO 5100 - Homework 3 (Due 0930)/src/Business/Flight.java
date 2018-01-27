/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
/**
 *
 * @author Wenqing
 */
public class Flight {
    private Seat[][] assignment;
    private Airplane plane;
    
    private String departureAirport;
    private String arrivalAirport;
    private String departureTime;
    private String arrivalTime;
   
    private double revenue;

    public Seat[][] createAssignment() {
        assignment = new Seat[6][25];   
        return assignment;
    }    
    
    public Seat addAssignment(int col, int row){
        Seat s = assignment[col][row] = new Seat();
        return s;
    }
    
    public Airplane getPlane() {
        return plane;
    }

    public void setPlane(Airplane plane) {
        this.plane = plane;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public void setArrivalAirport(String arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
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
    

        
    public double getRevenue(){
        double currTotal = 0;
        for(Seat[] arr: assignment){
            for(Seat s: arr){
                double price = s.getPrice();
                currTotal += price;
            }
        }
        revenue = currTotal;
        return revenue;
    }
}