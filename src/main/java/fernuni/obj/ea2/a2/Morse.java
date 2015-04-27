package fernuni.obj.ea2.a2;

import java.util.LinkedList;

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
        
        morsealphabet.add(".-"); //A
        morsealphabet.add("-..."); //B
        morsealphabet.add("-.-."); //C
        morsealphabet.add("-.."); //D
        morsealphabet.add("."); //E
        morsealphabet.add("..-."); //F
        morsealphabet.add("--."); //G
        morsealphabet.add("...."); //H
        morsealphabet.add(".."); //I
        morsealphabet.add(".---"); //J
        morsealphabet.add("-.-"); //K
        morsealphabet.add(".-.."); //L
        morsealphabet.add("--"); //M
        morsealphabet.add("-."); //N
        morsealphabet.add("---"); //O
        morsealphabet.add(".--."); //P
        morsealphabet.add("--.-"); //Q
        morsealphabet.add(".-."); //R
        morsealphabet.add("..."); //S
        morsealphabet.add("-"); //T
        morsealphabet.add("..-"); //U
        morsealphabet.add("...-"); //V
        morsealphabet.add(".--"); //W
        morsealphabet.add("-..-"); //X
        morsealphabet.add("-.--"); //Y
        morsealphabet.add("--.."); //Z
    }
    
    public String code(char b) {
        int numericValue = (int) b;
        
//        System.out.println(b - '0'); 
//        System.out.println(b - 48); 
//        System.out.println(Character.getNumericValue(b)); 
//        System.out.println(new Integer(nString)); 
//        System.out.println(Integer.valueOf(nString)); 
//        System.out.println(Integer.parseInt(nString)); 
//        System.out.println(new BigInteger(nString)); 
        
        //cheack if its a char in the right range
        if (65 <= numericValue && numericValue <= 90)  {
            return morsealphabet.get((numericValue) - 65);
        }
            
        return "Fehler!";
    }
    
}
