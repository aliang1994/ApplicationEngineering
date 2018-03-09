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
public class AccountDirectory {
    private ArrayList<Account> ad;
    
    public AccountDirectory(){
        ad = new ArrayList<Account>();
    }

    public ArrayList<Account> getAd() {
        return ad;
    }

    public void setAd(ArrayList<Account> ad) {
        this.ad = ad;
    }
    
    public Account addAccount(){
        Account acc = new Account();
        ad.add(acc);
        return acc;        
    }
    
    public void deleteAcccount(Account acc){
        ad.remove(acc);
    } 
    
    public Account searchAccount(String accNo){
        for(Account acc: ad){
            if(acc.getAccountNo().equals(accNo)){
                return acc;
            }
        }
        return null;
    }
            

    

 
    
    
}
