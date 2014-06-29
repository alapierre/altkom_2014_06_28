/*
 * OCJP Łódź 2014-06-29 dla Altkom Akademia S.A.

 */

package ocjp;

/**
 *
 * @author Adrian Lapierre <adrian@soft-project.pl>
 */
public class StaticTest extends BaseStatic {
 
    public static void m1() {
        
    }
    
    public static void main(String[] args) {
        
        BaseStatic t = new StaticTest();
        
        t.m1();
    }
    
}

class BaseStatic {
    
    public static void m1() {
        
    }
    
}
