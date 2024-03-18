
package pemrogramanobjek;
class Motor{
    String Ciri_Ciri ;
    String Merek2;
    String Bk;
    String Keterangan;
}
/**mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm
 *
 * @author mellynia
 */
public class PemrogramanObjek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Motor matic1  = new Motor();
        Motor matic2 = new Motor();
        Motor matic4 = new Motor();
         
        
        matic1.Ciri_Ciri = "Berroda dua";
        matic2.Merek2 = "Beat";
        matic2.Bk = "1614";
        matic2.Keterangan = "Alat Transpostasi Darat";
         
        
           System.out.println("Ciri_Ciri motor matic  :" +matic1.Ciri_Ciri);
           System.out.println("Merek motor            :" +matic2.Merek2);
           System.out.println("Nomor BK                :" +matic2.Bk);
           System.out.println("keterangan              :" +matic2.Keterangan);
          
    }
    
}
