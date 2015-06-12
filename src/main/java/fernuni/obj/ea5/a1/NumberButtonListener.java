package fernuni.obj.ea5.a1;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumberButtonListener implements ActionListener {

    private TextField textField;
    
    private Operator operator;

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (Operator.EQUAL.equals(operator)) {
            textField.setText("");
            operator = null;
        }
        
        //add the value from the pressed button to the field
        String text = textField.getText();        
        text = text + e.getActionCommand();        
        textField.setText(text);
    }
    
    public TextField getTextField() {
        return textField;
    }

    public void setTextField(TextField textField) {
        this.textField = textField;
    }
    
    public void setLastOperator(Operator operator) {
        this.operator = operator;
    }

}
