/*
 * OCJP Łódź 2014-06-29 dla Altkom Akademia S.A.

 */
package ocjp;

/**
 *
 * @author Adrian Lapierre <adrian@soft-project.pl>
 */
public class AssertDemo {

    public static void main(String[] args) {
        
        boolean assertEnabled = false;

        assert assertEnabled = true;

        System.out.println("Assertions are "
                + (assertEnabled ? "enabled" : "disabled"));
    }

}
