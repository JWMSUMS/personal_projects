package graphicswk9;

import java.awt.*;
import javax.swing.*;

public class DrawingComponent extends JComponent{
       
   //overriding an inherited method
   //this method automatically gets called when an object is created from this class
   @Override
   public void paintComponent(Graphics g) {
       //Create the 2D graphics object
        Graphics2D myDrawing = (Graphics2D) g;
        //three x,y pairs of co-ordinates for drawing a triangle
        int[] x_co = {214,541,825};
        int[] y_co = {416,200,417};  
        
        //set the drawing color
        myDrawing.setColor(Color.GREEN);
        //draw a rectangle
        myDrawing.drawRect(315, 414, 341, 613);
        myDrawing.setColor(Color.GREEN);
        myDrawing.fillRect(315,414,341,613);
        //change the drawing color
	myDrawing.setColor(Color.YELLOW);
        //draw a polygon
        myDrawing.fillPolygon(x_co, y_co, 3); 
        myDrawing.fillOval(15, 15, 100, 100);

        
    }
}
