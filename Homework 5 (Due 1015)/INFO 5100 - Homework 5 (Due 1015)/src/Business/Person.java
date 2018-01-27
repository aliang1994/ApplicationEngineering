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
public class Person {
    private String firstN;
    private String lastN;
    private int age;
    private ArrayList<UserAccount> list;
    
    public Person(){
        list = new ArrayList<UserAccount>();
    }

    public String getFirstN() {
        return firstN;
    }

    public void setFirstN(String firstN) {
        this.firstN = firstN;
    }

    public String getLastN() {
        return lastN;
    }

    public void setLastN(String lastN) {
        this.lastN = lastN;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<UserAccount> getList() {
        return list;
    }   
    
    public void addAccount(){
        
    }
    
    @Override
    public String toString(){
        return firstN + " " + lastN;
    }    
}