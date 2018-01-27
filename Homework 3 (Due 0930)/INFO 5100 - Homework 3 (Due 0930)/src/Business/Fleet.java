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
import java.util.*;
public class Fleet {
    private ArrayList<Airplane> air;
    
    public Fleet(){
        air = new ArrayList<Airplane>();
    }
    
    public Airplane addAirplane(){
        Airplane a = new Airplane();
        air.add(a);
        return a;
    }
}
