package pertemuan_6;
import java.util.Scanner; 
public class Bintang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.print("Masukkan tinggi : ");
        int tinggi = input.nextInt();
        
        outerLoop:
        for (int i = 1; i <= tinggi; i++) {
            innerLoop:
            for (int j = 1; j <= i; j++) {
                if (i % 2 == 0 && i % 3 == 0) {
                    System.out.print("halo");
                    break innerLoop; 
                }
                else if(i % 3 == 0){
                    break innerLoop;
                    
                }else if(i == 10){
                    System.out.println("Ini yang ke-10.");
                    break outerLoop; 
                }
                System.out.print("* ");
            }
            System.out.println(); // Pindah ke baris baru setelah satu baris bintang selesai
        }
    }
}