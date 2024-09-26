import java.util.Scanner;

public class PemilihanHariDenganIf<NoAbsen> {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Meminta input bilangan bulat dari pengguna
        System.out.print("Masukkan bilangan bulat (1-7): ");
        int hari = sc.nextInt();

        // Menggunakan struktur if-else untuk menentukan output
        if (hari >= 1 && hari <= 5) {
            System.out.println("Weekday");
        } else if (hari == 6 || hari == 7) {
            System.out.println("Weekend");
        } else {
            System.out.println("Invalid Number");
        }
    }
}