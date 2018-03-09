/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.time.LocalDateTime;
import java.util.*;

/**
 *
 * @author Wenqing
 */
public class FleetCatalogue {
    private String recentUpdateTime;
    private ArrayList<Airplane> catalogue;
    
    public FleetCatalogue(){
        catalogue = new ArrayList<Airplane>();
    }

    public String getRecentUpdateTime() {
        return recentUpdateTime;
    }

    public void setRecentUpdateTime(String time) {
        this.recentUpdateTime = time ;
    }

    public ArrayList<Airplane> getCatalogue() {
        return catalogue;
    }

    public void setCatalogue(ArrayList<Airplane> Catalogue) {
        this.catalogue = Catalogue;
    }
    
    public Airplane addAirplane(){
        Airplane air = new Airplane();
        catalogue.add(air);
        return air;
    }
    public Airplane deleteAirplane(Airplane air){
        catalogue.remove(air);
        return air;
    }
}
