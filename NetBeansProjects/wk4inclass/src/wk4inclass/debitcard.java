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
public class debitcard {
    
    
   // private double balance1 = 0;
     private double balance;
    //private double balance2 = balance + balance1;
    
    public void addbalance(double b){
        balance = balance + b;
    }
    
     public double getbalance(){
       return balance;
     }
}
