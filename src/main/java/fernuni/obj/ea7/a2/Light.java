package fernuni.obj.ea7.a2;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class Light extends Canvas
{
    int x;
    int y;
    float ballRadius;
    Color ballColor;
     
 
     
    public Light(int x, int y, float radius, Color color)
    {
        this.x = x;
        this.y = y;
        
        ballRadius = radius;
        ballColor = color;
 
    }
 
         
    public void paint(Graphics g)   
    {
 
        //super.paint(g);
        //g.setClip(x,y,(int)ballRadius,(int)ballRadius);
        g.setColor(ballColor);
        g.fillOval(x,y,(int)ballRadius,(int)ballRadius);
 
     
    }
     
 
}