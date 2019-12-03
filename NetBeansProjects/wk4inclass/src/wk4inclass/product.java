/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wk4inclass;

/**
 *
 * @author summerjh
 */
public class product {

  private double price;
   
  public double getprice(){
      return price;
  }
  
  public void setprice(double p){
     if(p > 0){
      price = p; 
     }
     else
         price = 0; //
  }
   
        
        
        
    
}
