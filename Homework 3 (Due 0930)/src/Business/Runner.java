/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author Wenqing
 */

public class Runner {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {                
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        
        Fleet f = new Fleet();
        FlightSchedule fs = new FlightSchedule();
        CustomerDirectory cd = new CustomerDirectory();
        
        String airplaneCSV = "C:/Users/Wenqing/Desktop/Airplane.csv";
        String flightCSV = "C:/Users/Wenqing/Desktop/Flight.csv";
        String customerCSV = "C:/Users/Wenqing/Desktop/Customer.csv";
        
        try {
            br = new BufferedReader(new FileReader(airplaneCSV));
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] airplaneElement = line.split(cvsSplitBy);
                
                Airplane airplane = f.addAirplane();
                
                String manufacturer = airplaneElement[0];
                String modelNumber = airplaneElement[1];
                int numSeat = Integer.parseInt(airplaneElement[2]);
                
                airplane.setManufacturer(manufacturer);
                airplane.setModelNo(modelNumber);
                airplane.setNumSeats(numSeat);
            }
            /*
            int i=1;
            for (Airplane a : f.getAirplane()) {
                System.out.println(i+"\tModel-->"+a.getModelNo()+"\tManufacturer-->"+a.getManufacturer());
                i++;     
            }
            */
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        
        
        
        try {
            br = new BufferedReader(new FileReader(flightCSV));
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] flightElement = line.split(cvsSplitBy);
                
                Flight fl = fs.addFlight();
                
                String depLoc = flightElement[0];
                String arrLoc = flightElement[1];
                String depTime = flightElement[2];
                String arrTime = flightElement[3];
                
                fl.setArrivalAirport(arrLoc);
                fl.setDepartureAirport(depLoc);
                fl.setArrivalTime(arrTime);
                fl.setDepartureTime(depTime);
            }
            int i=1;
            /*
            for (Flight fl: fs.getFs()) {
                System.out.println(i+"\tDepAirport-->"+fl.getDepartureAirport()+"\tArrAirport-->"+fl.getArrivalAirport());
                i++;     
            }
            */

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }        
        
        
        try {
            br = new BufferedReader(new FileReader(customerCSV));
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] customerElement = line.split(cvsSplitBy);
                
                Person p = cd.addCustomer();
                
                String name = customerElement[0];
                String id = customerElement[1];                
                
                p.setLegalName(name);
                p.setPassportNo(id);
                
            }
            int i=1;
            /*
            for (Person p: cd.getCd()) {
                System.out.println(i+"\tName-->"+p.getLegalName()+"\tPassportNo-->"+p.getPassportNo());
                i++;     
            }            
            */
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        
        double revenueAirliner = 0;
        for(Flight flight: fs.getFs()){           
            Seat[][] matrix = flight.createAssignment();                     
            for (int row=0; row<=12; row++){
                for (int col=0; col<=5; col++){
                    Seat s = flight.addAssignment(col, row);
                    s.setPrice(1500);
                }              
            }         
            for(int row=12; row<=24; row++){
                for (int col=0; col<=5; col++){
                    Seat s = flight.addAssignment(col, row);
                    s.setPrice(950);
                }                
            }
            double d = flight.getRevenue();
            System.out.println("total revenue for this flight is: " + d);  
            revenueAirliner += d;
        }        
        System.out.println("total revenue for this airliner is:" + revenueAirliner);
        
        
        MasterSchedule ms = new MasterSchedule();
        ms.addSchedule();
    }
      
   
}