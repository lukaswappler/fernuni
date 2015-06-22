package fernuni.obj.ea5.a1;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.LayoutManager;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;

public class Rechner extends Frame {
    
    private static final long serialVersionUID = 9025074780899407113L;
    
    private BorderLayout borderLayout1 = new BorderLayout();

    private Operator operator = null;
    private int operand = 0; 
    
    private TextField inputField = new TextField();
    
    private NumberButtonListener numberButtonListener = new NumberButtonListener();
    private OperatorListener operatorListener = new OperatorListener();
    
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
        
        
        /**
         * LAYOUT
         */
        
        /* FlowLayout fuer Ziffern- und Operatorpanel erzeugen */
        LayoutManager flowLayout = new FlowLayout();        
        /* Zifferntasten ggf. erzeugen und in Ziffernpanel einfuegen */
        Panel centerContainer = new Panel();        
        centerContainer.setLayout(flowLayout);
        /* Operatortasten ggf. erzeugen und in Operatorpanel einfuegen */
        Panel bottomContainer = new Panel();
        bottomContainer.setLayout(flowLayout);
        
        /* Objekte in Frame platzieren */
        this.add(inputField,BorderLayout.NORTH);
        this.add(centerContainer,BorderLayout.CENTER);
        this.add(bottomContainer,BorderLayout.SOUTH);
        
        
        
        /**
         * BUTTONS
         */
        createNumberButtons(centerContainer);
        createOperatorButtons(bottomContainer);
        
        /**
         * INPUT FIELD
         */
        /* Inputfeld / Textfeld erzeugen und hinzufügen*/
        //make it readonly
        inputField.setEditable(false);        
        inputField.setText("");
        numberButtonListener.setTextField(inputField);
    }

    private void createOperatorButtons(Panel bottomContainer) {
        // TODO Auto-generated method stub

        Operator[] values = Operator.values();
        for (int i = 0; i < values.length; i++) {
            Button operatorButton = new Button();
            operatorButton.setLabel(values[i].getLabel());
            operatorButton.setActionCommand(values[i].getLabel());
            operatorButton.addActionListener(operatorListener);
            bottomContainer.add(operatorButton);
        }
    }

    private void createNumberButtons(Panel centerContainer) {
        for (int i = 0; i < 10; i++) {            
            Button digitButton = new Button();
            digitButton.setLabel(String.valueOf(i));
            digitButton.setActionCommand(String.valueOf(i));

            digitButton.addActionListener(numberButtonListener);
            
            centerContainer.add(digitButton);
        }
        this.add(centerContainer,BorderLayout.CENTER);
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

    public class OperatorListener implements ActionListener {
               
        @Override
        public void actionPerformed(ActionEvent e) {
            
            Operator newOperator = Operator.labelOf(e.getActionCommand());
                        
            int inputFieldValue = 0;
            try {
            	inputFieldValue = Integer.parseInt(inputField.getText());
            } catch(NumberFormatException exception) {
            	JOptionPane.showMessageDialog(inputField, "The number was to large. The calculator is resetted completely");
            	inputField.setText("");
            	operator = null;
            	return;
            }
            
            if (operator == null || operator == Operator.EQUAL) {
                operand = inputFieldValue;
                inputField.setText("");
            } else {
                operand = operator.performOperation(operand, inputFieldValue);
                if (Operator.EQUAL.equals(newOperator)) {
                    inputField.setText(String.valueOf(operand));
                    numberButtonListener.setLastOperator(Operator.EQUAL);
                } else {
                    inputField.setText("");
                }
            }
            
            operator = newOperator;
        }
    }
}