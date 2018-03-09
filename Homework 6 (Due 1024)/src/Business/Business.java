package Business;
import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wenqing
 */
public class Business {
    private String name;
    private SupplierDirectory sd;
    private MarketOfferCatalogue moc;
    private MarketList ml;
    private UserAccountDirectory uad;    
    private PersonDirectory pd;
    
    
    public Business(String n){
        this.name = n;
        sd= new SupplierDirectory();
        moc = new MarketOfferCatalogue();
        ml = new MarketList();
        uad = new UserAccountDirectory();
        pd = new PersonDirectory();
    }

    public PersonDirectory getPd() {
        return pd;
    }

    public String getName() {
        return name;
    }

    public SupplierDirectory getSd() {
        return sd;
    }

    public MarketOfferCatalogue getMoc() {
        return moc;
    }

    public MarketList getMl() {
        return ml;
    }

    public UserAccountDirectory getUad() {
        return uad;
    }
}