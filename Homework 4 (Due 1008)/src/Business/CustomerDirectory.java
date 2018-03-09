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
public class CustomerDirectory {
    private ArrayList<Customer> cd;
    
    public CustomerDirectory (){
        cd = new ArrayList<Customer>();
    }

    public ArrayList<Customer> getCd() {
        return cd;
    }   
    
}
