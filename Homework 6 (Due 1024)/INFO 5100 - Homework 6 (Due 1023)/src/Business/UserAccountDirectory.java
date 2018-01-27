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
    private List<UserAccount> list;
    
    public UserAccountDirectory(){
        list = new ArrayList<UserAccount>();
    }

    public List<UserAccount> getList() {
        return list;
    }
    
    public UserAccount addUser(){
        UserAccount ua = new UserAccount();
        list.add(ua);
        return ua; 
    }
    
    public void deleteUser(UserAccount ua)    {
        list.remove(ua);
    }
    
    public void searchUser(){
        
    }
    
    public UserAccount isValidUser(String user, String pass){
        for(UserAccount ua:list){
            if(ua.getUserName().equals(user) && ua.getPassword().equals(pass)){
                return ua;
            }            
        }
        return null;
    }
}