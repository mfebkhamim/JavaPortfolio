package pertemuan_5;
import java.util.Scanner; 
public class kelipatan_3_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.print("Masukkan batas bawah : ");
        int batas_bawah = input.nextInt(); 
        System.out.print("Masukkan batas atas : ");
        int batas_atas = input.nextInt(); 
        int wadah = 0; 
        
        System.out.println("=================================");
        System.out.println("Maka, bilangannya adalah : ");
        
        while(batas_bawah <= batas_atas){
            if(batas_bawah%3 == 0 || batas_bawah%5 == 0){
                System.out.print(batas_bawah + "  ");
                wadah = wadah + batas_bawah; 
                batas_bawah++; 
            }else{
                batas_bawah++; 
            }
        }
        System.out.println(" ");
        System.out.println("Penjumlahan dari angka-angka tersebut adalah : " + wadah);
    }
}
