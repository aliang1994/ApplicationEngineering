/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
import java.io.*;

/**
 *
 * @author Wenqing
 */
public class ConfigureBusiness{
    public static Business configure(String name){        
        Business b = new Business(name);
        
        //add suppliers and products
        SupplierDirectory sd = b.getSd();
        Supplier s1 = sd.addSupplier();
        s1.setSupplierName("Xerox");
        ProductCatalogue pc = s1.getPc();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Wenqing\\Desktop\\Product.csv"));   
            String line = null; 
            while((line=reader.readLine())!=null){
                String item[] = line.split(",");
                Product p = pc.addProduct();
                p.setName(item[0]);
                p.setAvailability(Integer.parseInt(item[1]));               
            }
        }
        catch (Exception e) {    
            e.printStackTrace();    
        } 
        
        //add markets and customer
        MarketList ml = b.getMl();
        Market m1 = ml.addMarket();
        m1.setMarketName("Finance");
        Customer c1 = m1.addCustomer();
        c1.setCustomerName("BOA");
        c1.setMarket(m1);
        Customer c2 = m1.addCustomer();
        c2.setCustomerName("Citizen");
        c2.setMarket(m1);
        
        Market m2 = ml.addMarket();
        m2.setMarketName("Education");
        Customer c3 = m2.addCustomer();
        c3.setCustomerName("Northeastern");
        c3.setMarket(m2);
        Customer c4 = m2.addCustomer();
        c4.setCustomerName("Boston College");
        c4.setMarket(m2);
        
        //add market offers
        MarketOfferCatalogue moc = b.getMoc();          
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Wenqing\\Desktop\\marketOfferFinance.csv"));   
            String line = null; 
            while((line=reader.readLine())!=null){
                String item[] = line.split(",");
                MarketOffer mo1 = moc.addMarketOffer();
                mo1.setM(m1);
                m1.getMarketOfferList().add(mo1);  
                for(Supplier s: sd.getList()){
                    for(Product p: s.getPc().getList()){
                        if(p.getName().toLowerCase().equals(item[0].toLowerCase())){
                            mo1.setP(p);
                        }
                    }                    
                }
                mo1.setFloorPrice(Double.parseDouble(item[1]));
                mo1.setCeilingPrice(Double.parseDouble(item[2]));
                mo1.setTargetPrice(Double.parseDouble(item[3]));                   
            }
        } 
        catch (Exception e) {    
            e.printStackTrace();    
        } 
        
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Wenqing\\Desktop\\marketOfferEducation.csv"));   
            String line = null; 
            while((line=reader.readLine())!=null){
                String item[] = line.split(",");
                MarketOffer mo1 = moc.addMarketOffer();
                mo1.setM(m2);
                m2.getMarketOfferList().add(mo1); 
                for(Supplier s: sd.getList()){
                    for(Product p: s.getPc().getList()){
                        if(p.getName().toLowerCase().equals(item[0].toLowerCase())){
                            mo1.setP(p);
                        }
                    }                    
                }
                mo1.setFloorPrice(Double.parseDouble(item[1]));
                mo1.setCeilingPrice(Double.parseDouble(item[2]));
                mo1.setTargetPrice(Double.parseDouble(item[3]));                           
            }
        } 
        catch (Exception e) {    
            e.printStackTrace();    
        } 
        
        //add person
        PersonDirectory pd = b.getPd();
        Person sales1 = pd.addPerson();
        sales1.setName("Bowei");
        Person sales2 = pd.addPerson();
        sales2.setName("Fanqi");
        Person sales3 = pd.addPerson();
        sales3.setName("Gaurang");
        Person sales4 = pd.addPerson();
        sales4.setName("Ahmad");
        Person sales5 = pd.addPerson();
        sales5.setName("Neeraj");
        Person adm = pd.addPerson();
        adm.setName("Bugara");
        System.out.println(pd.getList());
        
        //add user accounts
        UserAccountDirectory uad = b.getUad();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Wenqing\\Desktop\\UserAccount.csv"));   
            String line = null; 
            while((line=reader.readLine())!=null){
                String item[] = line.split(",");
                UserAccount ua = uad.addUser();                
                ua.setUserName(item[0]);
                ua.setPassword(item[1]);
                ua.setRole(item[2]); 
                for(Person p: pd.getList()){
                    if(p.getName().equals(item[3])){
                         ua.setP(p);
                         p.setUa(ua);
                    }
                }
            }
        } 
        catch (Exception e) {    
            e.printStackTrace();    
        }
        return b;
    }  
}