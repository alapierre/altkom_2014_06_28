/*
 * OCJP Łódź 2014-06-29 dla Altkom Akademia S.A.

 */

package ocjp;

/**
 *
 * @author Adrian Lapierre <adrian@soft-project.pl>
 */
public class StaticA {

    public static int x = 1;
    
    public static class B {
    
        public static int x = 2;
        
        public static class C {
        
            public static int x = 3;
        
            public static void m1() {
                System.out.println(StaticA.x);
            }
            
        }
        
    }
    
    public static void main(String[] args) {
        
        StaticA a = new StaticA();
        
        B b = new B();
        B.C c = new B.C();
        
        B.C c2 = new B.C();
        
        System.out.println(c2 == c);
        
        System.out.println(StaticA.x);
        System.out.println(B.x);
        System.out.println(B.C.x);
        
    }
    
}
