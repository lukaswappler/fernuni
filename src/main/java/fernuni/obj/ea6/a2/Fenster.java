package fernuni.obj.ea6.a2;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Fenster extends Frame implements ActionListener {
    boolean state = false;

    Fenster() {
        setSize(300, 100);
        setLocation(100, 100);
        Button b = new Button("Kick me!");
        b.addActionListener(this);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent ev) {
                System.exit(0);
            }
        });
        add(b, BorderLayout.CENTER);
        actionPerformed(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (!state)
            setTitle("Da staunt ihr ...");
        else
            setTitle("... nicht schlecht.");
        state = !state;
    }

    public static void main(String[] args) {
        new Fenster();
        System.out.println("Also ich bin hier jetzt fertig.");
    }
}