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
public class PersonDirectory {
    private ArrayList<Person> list;
    
    public PersonDirectory(){
        this.list = new ArrayList<Person>();
    }

    public ArrayList<Person> getList() {
        return list;
    }
    
    public Person addPerson(){
        Person p = new Person();
        list.add(p);
        return p;
    }
    
    public void deletePerson(Person p){
        list.remove(p);
    }
}