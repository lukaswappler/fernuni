package fernuni.obj.ea7.a2;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class Light extends Canvas
{
    private static final long serialVersionUID = 4367565159572636730L;
    
    int x;
    int y;
    float ballRadius;
    Color ballColor;
     
    Graphics g;
    
    boolean isTurnedOn = false;
    
    public Light(int x, int y, float radius, Color color)
    {
        this.x = x;
        this.y = y;
        
        ballRadius = radius;
        ballColor = color;
    }

    public void paint(Graphics g)   
    {        
        if (isTurnedOn) {
        	g.setColor(ballColor);	
        } else {
        	g.setColor(Color.BLACK);
        }
         
        g.fillOval(x,y,(int)ballRadius,(int)ballRadius);
    }
    
    public void turnOn() {        
        
    	isTurnedOn = true;

        this.repaint();        
    }
    
    public void turnOff() {
    	isTurnedOn = false;
        
        this.repaint();
    }
}