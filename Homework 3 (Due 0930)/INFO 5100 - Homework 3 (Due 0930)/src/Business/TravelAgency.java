package Business;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author Wenqing
 */
public class TravelAgency {
    private CustomerDirectory cd;
    private MasterSchedule ms;
    private ArrayList<Airliner> listOfAirliner;

    public CustomerDirectory getCd() {
        return cd;
    }

    public void setCd(CustomerDirectory cd) {
        this.cd = cd;
    }

    public MasterSchedule getMs() {
        return ms;
    }

    public void setMs(MasterSchedule ms) {
        this.ms = ms;
    }

    public ArrayList<Airliner> getList() {
        return listOfAirliner;
    }
    
    public void setList(ArrayList<Airliner> list) {
        this.listOfAirliner = list;
    }    
}