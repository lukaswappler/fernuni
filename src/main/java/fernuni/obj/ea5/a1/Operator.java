package fernuni.obj.ea5.a1;

public enum Operator {
    PLUS("+"),
    MINUS("-"),
    MULTIPLE("*"),
    EQUAL("=");
    
    String label;
    
    Operator(String label) {
        this.label = label;
    }
    
    public String getLabel() {
        return this.label;
    }
    
    public int performOperation(int operand1, int operand2) {
        if (this.equals(PLUS)) {
            return operand1 + operand2;
        } else if (this.equals(MINUS)) {
            return operand1 - operand2;
        } else if (this.equals(MULTIPLE)) {            
        	return operand1 * operand2;
        }
        
        return 0;
    }

    public static Operator labelOf(String actionCommand) {
        
        Operator[] values = values();
        for (int i = 0; i < values.length; i++) {
            if (values[i].getLabel().equals(actionCommand)) {
                return values[i];
            }
        }
        
        return null;
    }
}

