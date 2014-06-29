/*
 * OCJP Łódź 2014-06-29 dla Altkom Akademia S.A.

 */

package ocjp;

/**
 *
 * @author Adrian Lapierre <adrian@soft-project.pl>
 */
public enum PoryRoku {
    
    WIOSNA(1), LATO(2), JESIEN(3), ZIMA(4),;
    
    private int dni;

    PoryRoku(int dni) {
        this.dni = dni;
    }
    
    public int ileDni() {
        return dni;
    }
    
}
