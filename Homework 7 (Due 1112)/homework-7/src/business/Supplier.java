/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.ArrayList;

/**
 *
 * @author Yizhe Liu
 */
public class Supplier {
    private static Supplier supplier;
    private ArrayList<Disease> diseaseList;
    private ArrayList<Vaccine> vaccineList;
    
    public Supplier(){
        this.diseaseList = new ArrayList<>();
        this.vaccineList = new ArrayList<>();
    }
    
    public static Supplier getInstance() {
        if (supplier == null) {
            supplier = new Supplier();
        }
        return supplier;
    }

    public ArrayList<Disease> getDiseaseList() {
        return diseaseList;
    }
    public void setDiseaseList(ArrayList<Disease> diseaseList) {
        this.diseaseList = diseaseList;
    }

    public ArrayList<Vaccine> getVaccineList() {
        return vaccineList;
    }
    public void setVaccineList(ArrayList<Vaccine> vaccineList) {
        this.vaccineList = vaccineList;
    }
    
    
}
