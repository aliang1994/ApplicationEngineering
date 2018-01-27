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
public class Person  {
    private String name;
    private List<Order> list;    
    private UserAccount ua;
    
    public Person(){
        list = new ArrayList<Order>();
    }

    public UserAccount getUa() {
        return ua;
    }

    public void setUa(UserAccount ua) {
        this.ua = ua;
    }

    public List<Order> getOrderList() {
        return list;
    }
    
    public Order addOrder(Order o){
        list.add(o);
        return o;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public double getTotalRevenue(){
        double totalRevenue = 0;
        for(Order o: list){
            double revenuePerOrder = o.getRevenue();
            totalRevenue += revenuePerOrder;
        }
        return totalRevenue;
    }
    
    public double getTotalGap(){
        double totalGap = 0;
        for(Order o: list){
            double gapPerOrder = o.getGap();
            totalGap += gapPerOrder;
        }        
        return totalGap;
    }
    
    public String toString(){
        return name;
    }
}