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
public class Business {
    private String name;
    private PersonDirectory pd;
    private UserAccountDirectory uad;
    
    public Business(String n){
        this.name=n;
        this.pd = new PersonDirectory();
        this.uad =  new UserAccountDirectory();
    }

    public String getName() {
        return name;
    }    

    public PersonDirectory getPd() {
        return pd;
    }

    public void setPd(PersonDirectory pd) {
        this.pd = pd;
    }

    public UserAccountDirectory getUad() {
        return uad;
    }

    public void setUad(UserAccountDirectory uad) {
        this.uad = uad;
    }
}