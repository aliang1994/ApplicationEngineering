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
public class Order {
    private List<OrderItem> list;
    private int orderNumber;
    private static int countOrder = 0;
    private Customer customer;
    double totalPrice;
    
    public Order(){
        list = new ArrayList<OrderItem>();        
        countOrder ++;
        orderNumber = countOrder;        
    }    

    public List<OrderItem> getList() {
        return list;
    }

    public int getOrderNumber() {
        return orderNumber;
    }
   
    public double getRevenue(){
        double totalRev = 0;
        for(OrderItem oi:list){
            double price = oi.getSalesPrice();
            int quantity = oi.getQuantity();
            double revenue = price * quantity;
            totalRev += revenue;
        }
        // System.out.println("Order class: " + totalRev);
        return totalRev;
    }
    
    public double getGap(){
        double totalGap = 0;
        for(OrderItem oi:list){
            int quant = oi.getQuantity();
            double soldPrice = oi.getSalesPrice();
            double targetPrice = oi.getOffer().getTargetPrice();
            double gap = (soldPrice - targetPrice)* quant;
            totalGap += gap;            
        }
        System.out.println("Order Class: " + totalGap);
        return totalGap;
    }
    
    public OrderItem addItem(OrderItem oi){       
        list.add(oi);
        return oi;
    }
    
    public void deleteItem(OrderItem item){
        list.remove(item);
    }
    
    public String toString(){
        return Integer.toString(orderNumber);
    }

    //added    
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}