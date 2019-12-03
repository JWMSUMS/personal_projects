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
public class Wk4inclass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       product p1 = new product();
       p1.setprice(5);
        System.out.println(p1.getprice());
        
        student s1 = new student();
        s1.setgpa(3.8);
       s1.setname("Gina Harris");
        System.out.println(s1.getname()+ "has a gpa of" +s1.getgpa());
        
        debitcard d1 = new debitcard();
        System.out.println(d1.getbalance());
        d1.addbalance(1000);
        System.out.println(d1.getbalance());
    }
    
}
