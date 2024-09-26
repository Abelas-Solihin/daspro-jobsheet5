import java.util.Scanner;

import javax.sql.rowset.CachedRowSet;
public class PemilihanHari02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         String dayName, dayType ;

         System.out.println("Input dya name");
         dayName = sc.nextLine();

         switch (dayName.toLowerCase()) {

            case "monday" :
            case "tuesday" :
            case "wedsneday" :
            case "trhusday" :
            case "fryday" :
            
                dayType = "weekend";
                break;
            case "saturday" :
            case "sunday" :
                dayType = "weekend" ;
            break;
            default :
                dayType = "invalid day name" ;
                System.out.println( dayName + "is a " + dayType );
         }

    }
    
}
