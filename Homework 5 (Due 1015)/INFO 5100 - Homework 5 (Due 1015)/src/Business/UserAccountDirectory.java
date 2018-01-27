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
public class UserAccountDirectory {
    private ArrayList<UserAccount> list;
    
    
    public UserAccountDirectory(){
        this.list = new ArrayList<UserAccount>();
    }

    public ArrayList<UserAccount> getList() {
        return list;
    }
    
    public UserAccount addAccount(){
        UserAccount ua = new UserAccount();
        list.add(ua);
        return ua;
    }
    
    public void removeAccount(UserAccount ua){
        list.remove(ua);
    }   
    
    public UserAccount searchAccount(String user){
        for (UserAccount ua: list){
            if(ua.getUsername().equals(user)){
                return ua;
            }
        }
        return null;
    }
    
    public UserAccount isValidAccount(String username, String password){
        for(UserAccount ua:list){
            if(ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }            
        }
        return null;
    }
}