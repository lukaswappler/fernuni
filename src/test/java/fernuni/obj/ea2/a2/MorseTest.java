package fernuni.obj.ea2.a2;

import org.junit.Test;

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
    
}
