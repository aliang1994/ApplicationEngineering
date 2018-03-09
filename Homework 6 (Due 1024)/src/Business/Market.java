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
public class Market {
    private String marketName;
    private List<Customer> clist;
    private List<MarketOffer> olist;
    private double mktRev;
    
    public Market(){        
        clist = new ArrayList<Customer>();
        olist = new ArrayList<MarketOffer>();
    }
    
    public List<Customer> getCustomerList() {
        return clist;
    }

    public List<MarketOffer> getMarketOfferList() {
        return olist;
    }    

    public String getMarketName() {
        return marketName;
    }

    public void setMarketName(String marketName) {
        this.marketName = marketName;
    }    
    
    public Customer addCustomer()    {
        Customer c = new Customer ();
        clist.add(c);
        return c;        
    }
    
    public void deleteCustomer(Customer c){
        clist.remove(c);
    }
   
    public double calculateRev(){
        double totalRev = 0;
        for(Customer c: clist){
            ArrayList<Order> cOrderList = c.getOrderList();
            for(Order od: cOrderList){                
                double rev = od.getRevenue();
                //System.out.println(rev);
                totalRev += rev;                
            }
        }
        mktRev = totalRev;
        // System.out.println("Market class: " + mktRev);
        return mktRev;
    }
    
    public double calculateGap(){
        double totalGap = 0;
        for(Customer c: clist){
            ArrayList<Order> ordList = c.getOrderList();
            for(Order od: ordList){
                double gap = od.getGap();
                System.out.println(gap);
                totalGap += gap;
            }
        }
        return totalGap;
    }
    
    @Override
    public String toString(){
        return marketName;
    }
}