import java.util.Scanner;
public class Pemilihanbilangan02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Masukkan angka: ");
        int angka = sc.nextInt();

        if ( angka % 2 == 0) {
            System.out.println("Angka " + angka + " termasuk bilangan " + (angka % 2 == 0 ? "genap" : "ganjil"));

        }
        else {
            System.out.println("Angka" + angka + "termasuk bilangan ganjil");
        }
        
    }
    
}
// System.out.println("Angka" + angka + "termasuk bilangan genap");

