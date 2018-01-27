/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.network;

import business.state.State;
import java.util.ArrayList;

/**
 *
 * @author Yizhe Liu
 */
public class Network {

    private String name;
    private ArrayList<State> stateList;
    
    public Network(){
        this.stateList = new ArrayList<>();
    }

    public State createAndAddState() {
        State state = new State();
        stateList.add(state);
        return state;
    }

    public ArrayList<State> getStateList() {
        return stateList;
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
