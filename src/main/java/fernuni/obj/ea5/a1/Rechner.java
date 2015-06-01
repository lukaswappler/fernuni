package fernuni.obj.ea5.a1;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Rechner extends Frame {
    
    private static final long serialVersionUID = 9025074780899407113L;
    
    private BorderLayout borderLayout1 = new BorderLayout();

    /*
     * AWT-Komponenten fuer Eingabetextfeld, Zifferntasten, Operatortasten sowie Ziffernpanel und Operatorpanel deklarieren und soweit moeglich bereits zugehoerige Objekte erzeugen
     */
    public Rechner() {
        /* Ggf. lokale Variablen deklarieren */
        /* Layout fuer Frame festlegen */
        this.setLayout(borderLayout1);
        this.setSize(150, 200);
        this.setLocation(100, 100);
        this.setBackground(Color.gray);
        /* FlowLayout fuer Ziffern- und Operatorpanel setzen */
        
        FlowLayout flowLayout = new FlowLayout();
        
        Button button = new Button();
        //button.size(50, 50);
        
        button.setLabel("1QWE2");
        button.setVisible(true);

        
        Button button2 = new Button();
        //button.size(50, 50);
        
        button2.setLabel("1QWE2");
        button2.setVisible(true);

        this.add(button,BorderLayout.NORTH);
        this.add(button2, BorderLayout.WEST);
        
        Container container = new Container();
        //container.setLayout(mgr);

        
        //borderLayout1.
        //borderLayout1.addLayoutComponent("btn", button);
        
        //borderLayout1.addLayoutComponent(flowLayout, null);
        
        //flowLayout.addLayoutComponent("button", button);
        
        
        
        //this.setLayout(flowLayout);
        
        
        /* Zifferntasten ggf. erzeugen und in Ziffernpanel einfuegen */
        /* Operatortasten ggf. erzeugen und in Operatorpanel einfuegen */
        /* Objekte in Frame plazieren */
        //this.add(...);
        /* ... */
    }

    /* ... */
    public static void main(String argv[]) {
        Rechner rechner = new Rechner();
        rechner.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        rechner.setVisible(true);
    }
}