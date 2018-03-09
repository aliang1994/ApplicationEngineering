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
public class VitalSignsHistory {
    private ArrayList<VitalSigns> vsHistory;
    public VitalSignsHistory(){
        vsHistory = new ArrayList<VitalSigns>();
    }

    public ArrayList<VitalSigns> getVsHistory() {
        return vsHistory;
    }

    public void setVsHistory(ArrayList<VitalSigns> vsHistory) {
        this.vsHistory = vsHistory;
    }
    
    public VitalSigns addVitals(){
        VitalSigns vs = new VitalSigns();
        vsHistory.add(vs);
        return vs;
    }
    
    public void deleteVitals(VitalSigns v){
        vsHistory.remove(v);
    }
}
