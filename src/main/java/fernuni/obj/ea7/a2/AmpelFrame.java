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
    
    public AmpelFrame() {
        
        
        
        
        
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - FRAME_WIDTH) / 2);
        int y = (int) ((dimension.getHeight() - FRAME_HEIGHT) / 2);
        
        this.setBounds(x, y, FRAME_WIDTH, FRAME_HEIGHT);
        
        //Canvas redLight = new Canvas();
        this.setLayout(layout);
        
        Light redLight = new Light(10, 10, 100, Color.RED);
        Light yellowLight = new Light(10, 10, 100, Color.YELLOW);
        Light greenLight = new Light(10, 10, 100, Color.GREEN);
        
        
        LayoutManager flowLayout = new FlowLayout();        
        /* Zifferntasten ggf. erzeugen und in Ziffernpanel einfuegen */
        //Panel centerContainer = new Panel();        
        //centerContainer.setLayout(flowLayout);
        
        //centerContainer.add(light);
        
        //this.add(light);
        this.add(redLight);
        this.add(yellowLight);
        this.add(greenLight);
        
        
        
        
        //redLight.
        //redLight.
        
        addWindowListener(new WindowAdapter() {
          public void windowClosing(WindowEvent e) {
              System.exit(0);
          }
      });
        
    }
    
    //Button bDec = new Button("<");
    //Button bInc = new Button(">");
    //Button bQuit = new Button("quit");
    //TextField tCounter = new TextField(3);
//    CounterInterface c = null;
//
//    public CountFrame() throws RemoteException, MalformedURLException, NotBoundException {
//
//        final CounterInterface c = (CounterInterface) Naming.lookup("//localhost/Counter");
//
//        tCounter.setEditable(false);
//        tCounter.setText(c.getValue());
//        // geeignete Beobachter registrieren
//        bDec.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                try {
//                    c.decr();
//                    tCounter.setText(c.getValue());
//                } catch (RemoteException e2) {
//                    e2.printStackTrace();
//                }
//            }
//        });
//        bInc.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                try {
//                    c.incr();
//                    tCounter.setText(c.getValue());
//                } catch (RemoteException e1) {
//                    e1.printStackTrace();
//                }
//            }
//        });
//        bQuit.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                try {
//                    c.resetCounter();
//                    tCounter.setText(c.getValue());
//                } catch (RemoteException e1) {
//                    e1.printStackTrace();
//                }
//            }
//        });
//        addWindowListener(new WindowAdapter() {
//            public void windowClosing(WindowEvent e) {
//                System.exit(0);
//            }
//        });
//        // Komponenten in richtiger Reihenfolge in Panel einfuegen
//        Panel p = new Panel(new FlowLayout());
//        p.add(bDec);
//        p.add(tCounter);
//        p.add(bInc);
//        // Komponenten in Hauptfenster einfuegen
//        add(p, BorderLayout.CENTER);
//        add(bQuit, BorderLayout.SOUTH);
//        // Fenstergroesse festlegen
//        setSize(120, 100);
//    }

    public static void main(String[] args) throws RemoteException, MalformedURLException, NotBoundException {
        AmpelFrame ampel = new AmpelFrame();
        ampel.setVisible(true);
    }
}