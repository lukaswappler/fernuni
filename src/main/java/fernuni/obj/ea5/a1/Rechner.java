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

public class Rechner extends Frame {
    
    private static final long serialVersionUID = 9025074780899407113L;
    
    private BorderLayout borderLayout1 = new BorderLayout();

    private Operator operator = null;
    private int operand = 0; 
    
    private TextField inputField = new TextField();
    
    private NumberButtonListener numberButtonListener = new NumberButtonListener();
    
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
        
        
        /* FlowLayout fuer Ziffern- und Operatorpanel erzeugen */
        LayoutManager flowLayout = new FlowLayout();
        
        /* Zifferntasten ggf. erzeugen und in Ziffernpanel einfuegen */
        Panel centerContainer = new Panel();        
        
        
        OperatorListener operatorListener = new OperatorListener();
        
        
        centerContainer.setLayout(flowLayout);
        for (int i = 0; i < 10; i++) {            
            Button digitButton = new Button();
            digitButton.setLabel(String.valueOf(i));
            digitButton.setActionCommand(String.valueOf(i));

            digitButton.addActionListener(numberButtonListener);
            
            
            centerContainer.add(digitButton);
            
        }
        this.add(centerContainer,BorderLayout.CENTER);
        
        
        /* Operatortasten ggf. erzeugen und in Operatorpanel einfuegen */
        Panel bottomContainer = new Panel();
        bottomContainer.setLayout(flowLayout);
        
        Button plusButton = new Button();
        plusButton.setLabel(Operator.PLUS.getLabel());
        plusButton.setActionCommand(Operator.PLUS.getLabel());
        plusButton.addActionListener(operatorListener);
        bottomContainer.add(plusButton);
        
        Button minusButton = new Button();
        minusButton.setLabel(Operator.MINUS.getLabel());
        minusButton.setActionCommand(Operator.MINUS.getLabel());
        minusButton.addActionListener(operatorListener);
        bottomContainer.add(minusButton);
        
        Button multipleButton = new Button();
        multipleButton.setLabel(Operator.MULTIPLE.getLabel());
        multipleButton.setActionCommand(Operator.MULTIPLE.getLabel());
        multipleButton.addActionListener(operatorListener);
        bottomContainer.add(multipleButton);
        
        Button equalButton = new Button();
        equalButton.setLabel("=");
        equalButton.setActionCommand("=");
        
        //
        //equalButton.addActionListener(operatorListener);
        equalButton.addActionListener(operatorListener);
        bottomContainer.add(equalButton);
        
        /* Inputfeld / Textfeld erzeugen und hinzufügen*/
        
        //make it readonly
        inputField.setEditable(false);        
        inputField.setText("");
        numberButtonListener.setTextField(inputField);
        
        
        
        /* Objekte in Frame platzieren */
        this.add(inputField,BorderLayout.NORTH);
        this.add(centerContainer,BorderLayout.CENTER);
        this.add(bottomContainer,BorderLayout.SOUTH);
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
            
            System.out.println(e.getActionCommand());
            
            int inputFieldValue = Integer.parseInt(inputField.getText()); 
            if (operator == null || operator == Operator.EQUAL) {
                operand = inputFieldValue;
                inputField.setText("");
            } else {
                operand = operator.performOperation(operand, inputFieldValue);
                if (Operator.EQUAL.getLabel().equals(e.getActionCommand())) {
                    inputField.setText(String.valueOf(operand));
                    numberButtonListener.setLastOperator(Operator.EQUAL);
                } else {
                    inputField.setText("");
                }
            }
            
            //add the value from the pressed button to the field
            if (Operator.PLUS.getLabel().equals(e.getActionCommand())) {
                operator = Operator.PLUS;
            } else if (Operator.MINUS.getLabel().equals(e.getActionCommand())) {
                operator = Operator.MINUS;
            } else if (Operator.MULTIPLE.getLabel().equals(e.getActionCommand())) {
                operator = Operator.MULTIPLE;
            } else if (Operator.EQUAL.getLabel().equals(e.getActionCommand())) {
                operator = Operator.EQUAL;
            }
            
            
            
        }
    }
}