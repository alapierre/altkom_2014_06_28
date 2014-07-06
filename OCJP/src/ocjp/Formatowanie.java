/*
 * OCJP Łódź 2014-06-29 dla Altkom Akademia S.A.

 */

package ocjp;

/**
 *
 * @author Adrian Lapierre <adrian@soft-project.pl>
 */
public class Formatowanie {
 
    public static void main(String[] args) {
        
        System.out.printf("%(f%n", -123.34);
        System.out.printf("%f%n", -123.34);
    }
    
}
