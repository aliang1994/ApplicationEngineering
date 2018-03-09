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
public class AirlinerDirectory {
    private ArrayList<Airliner> airliner;
    
    
    public AirlinerDirectory(){
        airliner = new ArrayList<Airliner>();
    }

    public ArrayList<Airliner> getAirliner() {
        return airliner;
    }
    
    public Airliner addAirliner(){
        Airliner al = new Airliner();
        airliner.add(al);
        return al;
    }     
}