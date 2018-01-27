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
    private ArrayList<Person> cd;
    
    public CustomerDirectory(){
        cd = new ArrayList<Person>();
    }

    public ArrayList<Person> getCd() {
        return cd;
    }

    public void setCd(ArrayList<Person> cd) {
        this.cd = cd;
    }
    
    public Person addCustomer(){
        Person p = new Person();
        cd.add(p);
        return p;
    }    
    
    public void removeCustomer(Person p){
        cd.remove(p);
    }
            
}
