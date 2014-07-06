/*
 * OCJP Łódź 2014-06-29 dla Altkom Akademia S.A.

 */

package ocjp;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Locale;

/**
 *
 * @author Adrian Lapierre <adrian@soft-project.pl>
 */
public class DateFormatTest {
    
    public static void main(String[] args) {
        
        //Locale.setDefault(Locale.US);
        
        Date d = new Date();
        
        System.out.println(d);
        
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM");
        
        System.out.println(df.format(d));
    }
    
}
