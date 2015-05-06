package fernuni.obj.ea3.a5;

import org.junit.Test;

public class NettigkeitTest {
    
    
    @Test
    public void testa() {
        
        Nettigkeit.a();
       
        
    }
    
    @Test
    public void testb() {
        
        
        int[] a = new int[6];
        
        a[0] = 4;
        a[1] = 5;
        a[2] = 6;
        
        System.out.println(Nettigkeit.sum1(a));
        
        System.out.println(Nettigkeit.sum2(a));
       
        
    }
    
    @Test
    public void testc() {
        
        
        Nettigkeit.c();
        
    }
    
    @Test
    public void testd() {
        
        
        Nettigkeit.d();
        
    }
    
    
    
}

