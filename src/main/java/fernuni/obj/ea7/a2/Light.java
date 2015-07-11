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
    
    public Light(int x, int y, float radius, Color color)
    {
        this.x = x;
        this.y = y;
        
        ballRadius = radius;
        ballColor = color;
    }

    public void paint(Graphics g)   
    {        
        g.setColor(ballColor);
        g.fillOval(x,y,(int)ballRadius,(int)ballRadius);
        
//        this.g = g;
    }
    
    public void turnOn() {        
        this.getGraphics().setColor(Color.BLACK);   
        this.getGraphics().fillOval(x,y,(int)ballRadius,(int)ballRadius);
        this.doLayout();
        //        g.setColor(Color.BLACK);
//        g.fillOval(x,y,(int)ballRadius,(int)ballRadius);        
    }
    
    public void turnOff() {
//        g.setColor(Color.BLACK);
//        g.fillOval(x,y,(int)ballRadius,(int)ballRadius);
        
        this.getGraphics().setColor(Color.BLACK);   
        this.getGraphics().fillOval(x,y,(int)ballRadius,(int)ballRadius);
        
        this.doLayout();
    }
    
}