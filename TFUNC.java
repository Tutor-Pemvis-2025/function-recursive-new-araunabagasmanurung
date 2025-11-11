//12S25026 - Andre Bonaran Situngkir
//12S25056 - Arauna Bagas Manurung
import java.util.*;
import java.lang.Math;

public class TFUNC {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, hasil;

        n = Integer.parseInt(input.nextLine());
        hasil = hitungRekursif(n);
        System.out.println("Bilangan yang dimasukkan (N): " + n);
        System.out.println("Hasil perhitungan rekursif (1+2+...+" + n + "): " + hasil);
    }
    
    public static int hitungRekursif(int angka) {
        int result;

        if (angka == 1) {
            result = 1;
        } else {
            result = angka + hitungRekursif(angka - 1);
        }
        
        return result;
    }
}
