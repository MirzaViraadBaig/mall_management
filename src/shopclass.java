/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Viraad
 */
public class shopclass {
    
    String shopName;
    String ownerName;
    int floor;
    int shopID;
    
    //double totalRent;
    String shopCategory; //this will define the category of the shop (floor wise)
    double rent;
    
    public shopclass(){};
    public shopclass(String shopName, String ownerName,String shopCategory, int floor){
        this.shopName = shopName;
        this.ownerName = ownerName;
        this.shopCategory = shopCategory;
        this.floor = floor;
        this.rent = rent;
        setRent();
        
    }
    public void setRent(){
    if ("Platinum".equals(shopCategory) && floor == 1){
        rent = 600000.234;
    }
    else if ("Gold".equals(shopCategory) && floor==1){
        rent = 550000.242;
    }
    else if ("Silver".equals(shopCategory) && floor==1){
        rent = 50000.2452;
    }else if ("Platinum".equals(shopCategory) && floor==2){
        rent = 550000.242;
    }
    else if ("Gold".equals(shopCategory) && floor==2){
        rent = 50000.2452;}
    else if ("Silver".equals(shopCategory) && floor==2){
        rent = 48000.241;
    }
    else if ("Platinum".equals(shopCategory) && floor==3){
        rent = 50000.242;
    }
    else if ("Gold".equals(shopCategory) && floor==3){
        rent = 480000.2452;
    }
    else if ("Silver".equals(shopCategory) && floor==3){
        rent = 40000.1320;
    }
    }
   
    public String getName(){
        return shopName;
    }
    
    public void setID(int i){
        shopID = i;
    }
    public void setName(String n){
        shopName = n;
    }
    public void setOwnerName(String o){
        ownerName = o;
    }
    public String getOwnerName(){
        return ownerName;
    }
   
    public double getShopRent(){
        return rent;
    }
    public void setShopCategory(String c){
        shopCategory = c;
        
    }
    public void setFloor(int f){
        floor = f;
    }
    public int getFloor(){
        return floor;
    }
    public double getRent(){
        return rent;
    }
    
    
    
}
