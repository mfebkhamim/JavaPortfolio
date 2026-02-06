package pemrograman.java;
import java.util.Scanner; 
public class luas_lingkaran {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double pi = 3.14; 
        double jari_jari, luas; 
        
        System.out.println("Menghitung Luas Lingkaran");
        System.out.print("Masukkan nilai dari jari-jari : " );
        jari_jari = sc.nextDouble();
        
        luas = pi*jari_jari*jari_jari; 
        
        System.out.println("Maka, luas lingkarannya adalah : " + luas);
    }
}