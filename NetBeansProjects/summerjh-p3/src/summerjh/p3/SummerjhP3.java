/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package summerjh.p3;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.io.* ;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author summerjh
 */
public class SummerjhP3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create frame
   JFrame frame = new JFrame();
   
    //set window size
       frame.setSize(340, 400);
       //set the title
       frame.setTitle("An empty frame");
       //close the window when user clicks on the cross
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       //panel
       JPanel panel = new JPanel();
       panel.setSize(340, 400);
       panel.setBackground(Color.BLACK); 
       
       //buttons
       final JButton clickButton = new JButton("Cincinnati weather: Feb 2018");
       clickButton.setBackground(Color.BLUE);
       clickButton.setForeground(Color.white);
       
       
       //labels
       final JLabel textLabel = new JLabel("");
       textLabel.setForeground(Color.WHITE); //text color
       final JLabel fnameLabel = new JLabel();
       final JLabel averagemax = new JLabel();
       final JLabel snowTotal = new JLabel();
       
       
       averagemax.setForeground(Color.WHITE);
       fnameLabel.setForeground(Color.WHITE); //text color
       fnameLabel.setBackground(Color.black);
       snowTotal.setForeground(Color.white);
       //month.setForeground(Color.yellow);
      
       
       //make it visible
        panel.add(clickButton);
       panel.add(textLabel);
       panel.add(fnameLabel);
       panel.add(averagemax);
       panel.add(snowTotal);
        
       
       
       
          //add panel to frame and make it visible
       frame.add(panel);
       frame.setVisible(true);
       fnameLabel.setOpaque(true);
       


       
       class ButtonTotalListener implements ActionListener
        {
            public void actionPerformed(ActionEvent event)
            {        
       if(event.getSource()==clickButton){
           double snow = 0;
           double max = 0;
           double min = 0;
           double total = 0;
           double total1 = 0;
           double t = 0;
           double t1 = 0;
           double ts = 0;
           
       String line = "";
       String T = "T";
       
       
        try{    
            String countries = "";
            File inputFile = new File("feb18_cincinnati_weather.txt");
            Scanner in2 = new Scanner(inputFile);
            try{ 
                in2.nextLine();
		 while(in2.hasNextLine()){
	                line = in2.nextLine();
	                System.out.println(line);
                        String[] lineContent = line.split("\t");
                       System.out.println("ARRAY: " + Arrays.toString(lineContent));
                        System.out.println(lineContent[1] + " "+ lineContent[2]);
                        System.out.println("");
                        //average max
                        max = Double.parseDouble(lineContent[1]);
                        total = (total + max);
                        //
                        //average min
                        min = Double.parseDouble(lineContent[2]);
                        t = t + min;
                        //
                        
                        //total snow
                        if(lineContent[5].equals(T)){
                             
                             snow = 0;
                        }
                          else 
                             snow = Double.parseDouble(lineContent[5]);
                              ts = ts + snow;
                             System.out.println(ts);
                       
                          
                                           
                       
                 }
                 
                 //do the average calc here
                      t1 = t / 28;
                 total1 = total / 28;
                 String x = String.format("%.2f",t1);
                 String y = String.format("%.2f", total1);
            
                 textLabel.setText("<html>"+"<br>"+"<br>"+"February 2018" +"<br>"+ "average MIN:"+x+"<br>"+"average max:"+y+"<br>"+"Total Snow:"+ts+"<html>");
                        
                 
                }
            finally{
		in2.close();
            }
        }
        catch(IOException exception) {
            System.out.println(exception.toString());
            System.out.println(exception.getMessage());
            }//catch
       
       }//if
    
    }//action performed
}//button listener
       ActionListener listener1 = new ButtonTotalListener();
       clickButton.addActionListener(listener1); 
    }
}
