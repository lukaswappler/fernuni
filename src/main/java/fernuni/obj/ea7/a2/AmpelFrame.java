package fernuni.obj.ea7.a2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class AmpelFrame extends Frame {
    private static final long serialVersionUID = -6023926227935950215L;
    
    
    private GridLayout layout = new GridLayout(3,1);
    
    public static final int FRAME_HEIGHT = 400;
    public static final int FRAME_WIDTH = 120;
    
    public static Light redLight = new Light(10, 10, 100, Color.RED);
    
    public AmpelFrame() {
        
        
        
        
        
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - FRAME_WIDTH) / 2);
        int y = (int) ((dimension.getHeight() - FRAME_HEIGHT) / 2);
        
        this.setBounds(x, y, FRAME_WIDTH, FRAME_HEIGHT);
        
        //Canvas redLight = new Canvas();
        this.setLayout(layout);
        
        
        Light yellowLight = new Light(10, 10, 100, Color.YELLOW);
        Light greenLight = new Light(10, 10, 100, Color.GREEN);
        
        
        LayoutManager flowLayout = new FlowLayout();        
                
        this.add(redLight);
        this.add(yellowLight);
        this.add(greenLight);
        
        
        addWindowListener(new WindowAdapter() {
          public void windowClosing(WindowEvent e) {
              System.exit(0);
          }
      });
        
    }

    public static void main(String[] args) throws RemoteException, MalformedURLException, NotBoundException, InterruptedException {
        AmpelFrame ampel = new AmpelFrame();
        ampel.setVisible(true);
        
        Thread.sleep(1000);
        
        redLight.turnOff();
        
    }
}