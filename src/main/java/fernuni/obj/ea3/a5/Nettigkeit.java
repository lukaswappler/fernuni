package fernuni.obj.ea3.a5;

public class Nettigkeit {

    public static void a() {
        int i = 10;
        System.out.println(i = i + 1);
        System.out.println(i);
        int j = 10;
        System.out.println(j += 1);
        System.out.println(j);
        int k = 10;
        System.out.println(++k);
        System.out.println(k);
        int l = 10;
        System.out.println(l++);
        System.out.println(l);
    }

    public static void c() {
        int a = 9;
        int b = 8;
                
        System.out.println(a & b);
        System.out.println((true && false));
    }
    
    public static void d() {
        int x = 256;
        long y = (x - 255.59) * 15 < 0 ? 12000L : x - 12256L;
        int i = 5 + (i = 3) / 6 + 2 * i + 3;
        boolean b = ((long) i % 3 >= 2) ^ (x / 2 * 2 > 100);
        
        System.out.println(x);
        System.out.println(y);
        System.out.println(i);
        System.out.println(b);
        
    }

    public static int sum1(int[] a) {
        int s = 0, i = 0;
        while (i < a.length) {
            i++;
            s = s + a[i];
        }
        return s;
    }

    public static int sum2(int[] a) {
        int s = 0, i = 0;
        while (i < a.length)
            s = s + a[i++];
        return s;
    }
}
