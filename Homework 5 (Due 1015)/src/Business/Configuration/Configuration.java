/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Configuration;
import Business.*;

/**
 *
 * @author Wenqing
 */
public class Configuration {
    
    public static Business initializeBusiness(String name){ 
        Business b = new Business(name);
        
        PersonDirectory pd = b.getPd();
        
        Person p = pd.addPerson();
        p.setFirstN("Alice");
        p.setLastN("Liang");
        p.setAge(23);
        
        UserAccountDirectory uad = b.getUad();
        
        UserAccount ua1 = uad.addAccount();
        ua1.setUsername("aliang");
        ua1.setPassword("o516");
        ua1.setP(p);
        ua1.setRole("Admin");
        
        
        Person p2 = pd.addPerson();
        p2.setFirstN("Joe");
        p2.setLastN("Bruin");
        p2.setAge(18);
        
        UserAccount ua2 = uad.addAccount();
        ua2.setUsername("lol");
        ua2.setPassword("o60313");
        ua2.setP(p2);
        ua2.setRole("HR");
        
        return b;
    }    
}