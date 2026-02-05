package pertemuan_7;
import java.util.Scanner;
public class luaslingkaran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("INI ADALAH PROGRAM MENGHITUNG LUAS LINGKARAN");
        System.out.print("Masukkan panjang jari-jari lingkaran : ");
        int r = input.nextInt(); 
        System.out.println("Luas lingkaran dengan jari-jari " + r + " satuan adalah : " + luas_lingkaran(r) + " satuan luas.");
    }
    
    public static double luas_lingkaran(int r){
        double luas = 3.14159 * r * r; 
        
        return luas; 
    }
}