package fernuni.obj.ea2.a3;

import org.junit.Test;

import fernuni.obj.ea2.a3.Morse;

public class MorseTest {

    
    @Test
    public void testMorse() {
        
        String[]args = new String[1];
        
        args[0] = "MORSE";

        Morse.main(args);
    }
    
    @Test
    public void testMorseWithSpaces() {
        
        String[]args = new String[1];
        
        args[0] = "M O R S E";

        Morse.main(args);
    }
    
    @Test
    public void testMorseWithSpacesLowerCase() {
        
        String[]args = new String[1];
        
        args[0] = "m o r s e";

        Morse.main(args);
    }
    
    @Test
    public void testMorseWithNoAlphaChars() {
        
        String[]args = new String[1];
        
        args[0] = "1345";

        Morse.main(args);
    }
    
}
