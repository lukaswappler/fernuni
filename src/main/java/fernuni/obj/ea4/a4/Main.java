package fernuni.obj.ea4.a4;

import java.io.IOException;

interface CharEingabeStrom {
    int read() throws IOException;
}

class StringLeser implements CharEingabeStrom {
    private char[] dieZeichen;
    private int index = 0;

    public StringLeser(String s) {
        dieZeichen = s.toCharArray();
    }

    public int read() {
        if (index == dieZeichen.length)
            return -1;
        else
            return dieZeichen[index++];
    }
}

class GrossBuchstabenFilter implements CharEingabeStrom {
    private CharEingabeStrom eingabeStrom;

    public GrossBuchstabenFilter(CharEingabeStrom cs) {
        eingabeStrom = cs;
    }

    public int read() throws IOException {
        int z = eingabeStrom.read();
        if (z == -1)
            return -1;
        else
            return Character.toUpperCase((char) z);
    }
}

class UmlautSzFilter implements CharEingabeStrom {
    private CharEingabeStrom eingabeStrom;
    private int naechstesZ = -1;

    public UmlautSzFilter(CharEingabeStrom cs) {
        eingabeStrom = cs;
    }

    public int read() throws IOException {
        if (naechstesZ != -1) {
            int z = naechstesZ;
            naechstesZ = -1;
            return z;
        } else {
            int z = eingabeStrom.read();
            if (z == -1)
                return -1;
            switch ((char) z) {
            case '\u00C4':
                naechstesZ = 'e';
                return 'A';
            case '\u00D6':
                naechstesZ = 'e';
                return 'O';
            case '\u00DC':
                naechstesZ = 'e';
                return 'U';
            case '\u00E4':
                naechstesZ = 'e';
                return 'a';
            case '\u00F6':
                naechstesZ = 'e';
                return 'o';
            case '\u00FC':
                naechstesZ = 'e';
                return 'u';
            case '\u00DF':
                naechstesZ = 's';
                return 's';
            default:
                return z;
            }
        }
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        String s = new String("f\u00DF\u00D6");
        CharEingabeStrom cs;

        cs = new StringLeser(s);
        cs = new UmlautSzFilter(cs);
        cs = new GrossBuchstabenFilter(cs);
        int z = cs.read();
        while (z != -1) {
            System.out.print((char) z);
            z = cs.read();
        }
        System.out.println("");
    }
}