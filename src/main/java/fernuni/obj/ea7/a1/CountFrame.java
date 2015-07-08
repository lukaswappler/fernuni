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

public class CountFrame extends Frame {
	Button bDec = new Button("<");
	Button bInc = new Button(">");
	Button bQuit = new Button("quit");
	TextField tCounter = new TextField(3);
	Counter c = new Counter(50);

	public CountFrame() {
		tCounter.setEditable(false);
		tCounter.setText(c.toString());
		// geeignete Beobachter registrieren
		bDec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c.decr();
				tCounter.setText(c.toString());
			}
		});
		bInc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c.incr();
				tCounter.setText(c.toString());
			}
		});
		bQuit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c.resetCounter();
				tCounter.setText(c.toString());
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

	public static void main(String[] args) {
		CountFrame countFrame = new CountFrame();
		countFrame.setVisible(true);
	}
}