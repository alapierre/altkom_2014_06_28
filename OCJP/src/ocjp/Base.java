/*
 * OCJP Łódź 2014-06-29 dla Altkom Akademia S.A.

 */
package ocjp;

/**
 *
 * @author Adrian Lapierre <adrian@soft-project.pl>
 */
public class Base {

    private final int j = 1;
    
    private static int z = 2;
    
    static {
        z = 1;
    }

    private Base() {
        System.out.println("base konstruktor");
        
    }

    public Base(int i) {
        this();
        System.out.println("base konstruktor argumentowy " + i);
    }

}
