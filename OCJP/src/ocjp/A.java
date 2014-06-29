/*
 * OCJP Łódź 2014-06-29 dla Altkom Akademia S.A.

 */
package ocjp;

import java.util.*;

/**
 *
 * @author Adrian Lapierre <adrian@soft-project.pl>
 */
public class A {

    public int x = 1;

    public class B {

        public int x = 2;

        public class C {

            public int x = 3;
            
            public void m1() {
                System.out.println(this.x);
                
            }
            
        }
    }

    public static void main(String[] args) {
        
        final Date date = new Date();
        
        A a = new A();
        System.out.println(a.x);
        
        A.B b = a.new B();
        System.out.println(b.x);
              
        A.B.C c = b.new C();
        System.out.println(c.x);
        c.m1();
        
    }
    
}
