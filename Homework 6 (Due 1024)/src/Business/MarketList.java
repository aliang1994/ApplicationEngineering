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
public class MarketList {
    private List<Market> list;
    private HashMap<Product, Double> map;
    
    public MarketList(){
        list = new ArrayList<Market>();
    }
    
    public Market addMarket(){
        Market m = new Market();
        list.add(m);
        return m;
    }
    
    public void deleteMarket(Market m){
        list.remove(m);
    }

    public List<Market> getList() {
        return list;
    }
    
    public HashMap<Product, Double>  getMap(){
        HashMap<Product, Double> productSalesMap = new HashMap<Product, Double>();
        double totalGap = 0;
        for(Market m: list){
            for(Customer c: m.getCustomerList()){
                for(Order o: c.getOrderList()){
                    for(OrderItem oi: o.getList()){                        
                        Product p = oi.getP();
                        double gap = oi.getItemGap();                        
                        if(!productSalesMap.containsKey(p)){ 
                            productSalesMap.put(p, gap);                            
                        } 
                        else{                            
                            double gapp = productSalesMap.get(p);
                            totalGap += gapp;
                            productSalesMap.put(p, totalGap);
                        }
                    }                    
                }                
            }            
        }        
        map = productSalesMap;
        return map;
    }
}