/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Wenqing
 */
public class OrderItem {
    private int quantity;
    private double salesPrice;
    private Product p;
    private MarketOffer mo;
    
    public OrderItem(MarketOffer offer){
        this.mo = offer;
    }    
    
    public MarketOffer getOffer(){
        return mo;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(double salesPrice) {
        this.salesPrice = salesPrice;
    }

    public Product getP() {
        return p;
    }

    public void setP(Product p) {
        this.p = p;
    }
    
    public String toString(){
        return p.getName();
    }
    
    public double getItemRevenue(){
        double revenue = quantity * salesPrice;
        return revenue;
    }
    
    public double getItemGap(){
        double gap = (salesPrice-mo.getTargetPrice()) * quantity;
        return gap;
    }
}