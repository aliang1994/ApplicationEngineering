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
public class MarketOfferCatalogue {
    private List<MarketOffer> list;
    
    public MarketOfferCatalogue(){
        list = new ArrayList<MarketOffer>();
    }   

    public List<MarketOffer> getList() {
        return list;
    }    
    
    public MarketOffer addMarketOffer(){
        MarketOffer mo = new MarketOffer();
        list.add(mo);
        return mo;
    }
    
    public void deleteMarketOffer(MarketOffer mo){
        list.remove(mo);
    }
    
    public void searchOffer(){
        
    }
}