package fernuni.obj.ea7.a1;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class CountFrame extends Frame {
    Button bDec = new Button("<");
    Button bInc = new Button(">");
    Button bQuit = new Button("quit");
    TextField tCounter = new TextField(3);
    CounterInterface c = null;

    public CountFrame() throws RemoteException, MalformedURLException, NotBoundException {

        final CounterInterface c = (CounterInterface) Naming.lookup("//localhost/Counter");

        tCounter.setEditable(false);
        tCounter.setText(c.getValue());
        // geeignete Beobachter registrieren
        bDec.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    c.decr();
                    tCounter.setText(c.getValue());
                } catch (RemoteException e2) {
                    e2.printStackTrace();
                }
            }
        });
        bInc.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    c.incr();
                    tCounter.setText(c.getValue());
                } catch (RemoteException e1) {
                    e1.printStackTrace();
                }
            }
        });
        bQuit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    c.resetCounter();
                    tCounter.setText(c.getValue());
                } catch (RemoteException e1) {
                    e1.printStackTrace();
                }
            }
        });
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        // Komponenten in richtiger Reihenfolge in Panel einfuegen
        Panel p = new Panel(new FlowLayout());
        p.add(bDec);
        p.add(tCounter);
        p.add(bInc);
        // Komponenten in Hauptfenster einfuegen
        add(p, BorderLayout.CENTER);
        add(bQuit, BorderLayout.SOUTH);
        // Fenstergroesse festlegen
        setSize(120, 100);
    }

    public static void main(String[] args) throws RemoteException, MalformedURLException, NotBoundException {
        CountFrame countFrame = new CountFrame();
        countFrame.setVisible(true);
    }
}