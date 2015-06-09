package fernuni.obj.ea5.a1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OperatorListener implements ActionListener {
    
    private char[] operators;
    private int[] values; 
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        System.out.println(e.getActionCommand());
        
        
        //add the value from the pressed button to the field
        /*String text = textField.getText();        
        text = text + e.getActionCommand();        
        textField.setText(text);*/
        if (e.getActionCommand().equals("+")) {
            
        }
    }

    public char[] getOperators() {
        return operators;
    }

    public void setOperators(char[] operators) {
        this.operators = operators;
    }

    public int[] getValues() {
        return values;
    }

    public void setValues(int[] values) {
        this.values = values;
    }
    
    

}
