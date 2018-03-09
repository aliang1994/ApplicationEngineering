/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.state;

import business.enterprise.EnterpriseDirectory;

/**
 *
 * @author Yizhe Liu
 */
public class State {
    private String name;
    private EnterpriseDirectory enterpriseDirectory;
    private int stateV1Quantity;
    private int stateV2Quantity;

    public int getStateV1Quantity() {
        return stateV1Quantity;
    }
    public void setStateV1Quantity(int stateV1Quantity) {
        this.stateV1Quantity = stateV1Quantity;
    }

    public int getStateV2Quantity() {
        return stateV2Quantity;
    }
    public void setStateV2Quantity(int stateV2Quantity) {
        this.stateV2Quantity = stateV2Quantity;
    }

    public State() {
       
        enterpriseDirectory = new EnterpriseDirectory();
    }
    

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
