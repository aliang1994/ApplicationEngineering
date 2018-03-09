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
public class Customer {
    private String customerName;
    private int customerID;
    private static int customerCount=0;
    private Market m;    
    private ArrayList<Order> orderList;
    
    public Customer(){
        customerCount++;
        customerID = customerCount;
        orderList = new ArrayList<Order>();
    }

    public ArrayList<Order> getOrderList() {
        System.out.println(orderList);
        return orderList;
    }

    public Market getM() {
        return m;
    }
    
    public void setMarket(Market mark){
        this.m = mark;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }    
    
    public String toString(){
        return customerName;
    }
    
    public Order addOrder(Order o){
        orderList.add(o);
        return o;
    }
}