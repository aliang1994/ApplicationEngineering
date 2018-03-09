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
public class ProductCatalogue {
    private List<Product> list;
    
    public ProductCatalogue(){
        list = new ArrayList<Product>();
    }  

    public List<Product> getList() {
        return list;
    }
    
    public Product addProduct(){
        Product p = new Product();
        list.add(p);
        return p;
    }
    
    public void removeProduct(Product p){
        list.remove(p);
    }
    
    public void search(){
        
    }
}