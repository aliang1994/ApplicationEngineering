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
public class Supplier {
    private ProductCatalogue pc;
    private String supplierName;
    private double supplierRev;
    
    public Supplier (){
        pc = new ProductCatalogue();
    }

    public double getSupplierRev() {
        return supplierRev;
    }

    public void setSupplierRev(double supplierRev) {
        this.supplierRev = supplierRev;
    }
    
    

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }  

    public ProductCatalogue getPc() {
        return pc;
    }   
    
    public String toString(){
        return supplierName;
    }
}