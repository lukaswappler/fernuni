package fernuni.obj.ea2.a3;


public class Morse {
    
    private LinkedList<String> morsealphabet;

    public static void main( String[] args )
    {   
        String stringToTranslate = args[0];
        
        Morse morse = new Morse();
        
        char[] charsToTranslate = new char[stringToTranslate.length()];
        stringToTranslate.getChars(0, stringToTranslate.length(), charsToTranslate, 0);
        
        for (char c : charsToTranslate) {
            if (c != ' ') {
                System.out.println(morse.code(c));
            }
        }
    }
    
    public Morse() {
        morsealphabet = new LinkedList<String>();
        
        morsealphabet.addLast(".-"); //A
        morsealphabet.addLast("-..."); //B
        morsealphabet.addLast("-.-."); //C
        morsealphabet.addLast("-.."); //D
        morsealphabet.addLast("."); //E
        morsealphabet.addLast("..-."); //F
        morsealphabet.addLast("--."); //G
        morsealphabet.addLast("...."); //H
        morsealphabet.addLast(".."); //I
        morsealphabet.addLast(".---"); //J
        morsealphabet.addLast("-.-"); //K
        morsealphabet.addLast(".-.."); //L
        morsealphabet.addLast("--"); //M
        morsealphabet.addLast("-."); //N
        morsealphabet.addLast("---"); //O
        morsealphabet.addLast(".--."); //P
        morsealphabet.addLast("--.-"); //Q
        morsealphabet.addLast(".-."); //R
        morsealphabet.addLast("..."); //S
        morsealphabet.addLast("-"); //T
        morsealphabet.addLast("..-"); //U
        morsealphabet.addLast("...-"); //V
        morsealphabet.addLast(".--"); //W
        morsealphabet.addLast("-..-"); //X
        morsealphabet.addLast("-.--"); //Y
        morsealphabet.addLast("--.."); //Z
    }
    
    public String code(char b) {
    	//check for lowercase  chars
        char ucChar = Character.toUpperCase(b);
    	
    	int numericValue = (int) ucChar;        
        
    	numericValue -= 65;
    	
    	LinkedList<String>.ListIterator listIterator = morsealphabet.listIterator();
    	String foundValue = "Fehler!";
    	for (int i = 0; i < numericValue + 1; i++) {
    		foundValue = "Fehler!";
    		if (listIterator.hasNext()) {
    			foundValue = listIterator.next();
        	}
		}

   		return foundValue;    	
    }
    
}
