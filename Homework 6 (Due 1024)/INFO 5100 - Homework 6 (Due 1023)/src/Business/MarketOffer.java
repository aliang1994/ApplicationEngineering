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
public class MarketOffer {
    private double ceilingPrice;
    private double floorPrice;
    private double targetPrice;
    private Product p;
    private Market m;

    public Product getP() {
        return p;
    }

    public void setP(Product p) {
        this.p = p;
    }

    public Market getM() {
        return m;
    }

    public void setM(Market m) {
        this.m = m;
    }   

    public double getCeilingPrice() {
        return ceilingPrice;
    }

    public void setCeilingPrice(double ceilingPrice) {
        this.ceilingPrice = ceilingPrice;
    }

    public double getFloorPrice() {
        return floorPrice;
    }

    public void setFloorPrice(double floorPrice) {
        this.floorPrice = floorPrice;
    }

    public double getTargetPrice() {
        return targetPrice;
    }

    public void setTargetPrice(double targetPrice) {
        this.targetPrice = targetPrice;
    }    
    
    public String toString(){
        return p.getName();
    }
}