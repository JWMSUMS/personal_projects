/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;

/**
 *
 * @author summers15
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         {
                new NewJFrame().setVisible(true);
            }
        Scanner in = new Scanner(System.in);
      
      do{
          try{
      
      //variables
      double amount;
         double rate;
         double rate1;
         double months;
         double years;
         double part1;
         double part2;
         double monthly;
         
         
         //user inputs
         
         System.out.println("Enter loan Amount:");
         amount = Double.parseDouble(in.nextLine());
      
         System.out.printf("Enter Rate: ");
         rate = Double.parseDouble(in.nextLine());
      
         System.out.printf("Enter Years: ");
         years = Double.parseDouble(in.nextLine());
         
         //IF statement
           if(amount <= 0 | rate <=0 | years <=0)
         {
            System.out.printf("You Must Enter Positive Numeric Data!\n");
         }
           
           //Math
         rate1 = rate/100/12;
         months = years * 12;
         part1 = Math.pow(1+rate1, months );
         part2 = Math.pow(1+rate1, months)-1;
         monthly = rate1*amount* part1/part2;
        
          //display the results
         if(monthly <= 0)
         {
         System.out.printf("The Monthly Payment is: %.2f%n", monthly);
                }
        }
 catch (NumberFormatException e) {
 System.out.println ("You were supposed to enter an integer!\n");
         }
        System.out.printf("Would you like to try again (y/n):");
        }while(in.nextLine().equals("y")); 
    }
    
}
    
    

