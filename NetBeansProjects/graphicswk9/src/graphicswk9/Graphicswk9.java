package graphicswk9;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Graphicswk9 {

    public static void main(String[] args) {
        //set up the frame
        JFrame frame = new JFrame();
        frame.setSize(1008, 630);
        frame.setTitle("An empty frame");  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //create the background color of the drawing
        Container con = frame.getContentPane();
        con.setBackground(Color.LIGHT_GRAY); 
        
        //create the component to draw and add it to the frame
        DrawingComponent component = new DrawingComponent();
        frame.add(component); 
        
        frame.setVisible(true);
    }
    
}



