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
public class SupplierDirectory {
    private List<Supplier> list;
    
    public SupplierDirectory(){
        list = new ArrayList<Supplier>();
    }    

    public List<Supplier> getList() {
        return list;
    }
        
    public Supplier addSupplier(){
        Supplier s = new Supplier();
        list.add(s);
        return s;
    }
    
    public void removeSupplier(Supplier s){
        list.remove(s);
    }
    
    public void searchSupplier(){
        
    }
}