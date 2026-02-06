package pertemuan_6;
import java.util.Scanner;
public class Lama_kerja {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Asumsikan seseorang pertama kali masuk kerja pada hari Senin");
        System.out.print("Masukkan lama periode kerja (dalam hari) : ");
        int total_hari = input.nextInt(); 
        int hariKerja = 0;
        int hariLibur = 0;
        
        for (int hari = 1; hari <= total_hari; hari++) {
            if (hari % 7 == 6 || hari % 7 == 0) {
                hariLibur++;  // Sabtu dan Minggu sebagai hari libur
            } else {
                hariKerja++;
            }
            
            // Jika sudah mencapai jumlah hari kerja tertentu, berhenti
            if (hariKerja == 100) {
                System.out.println("Target 100 hari kerja tercapai pada " + hari + " hari setelah pertama kali masuk.");
                break;
            }
        }
        
        System.out.println("Total hari kerja dalam periode ini: " + hariKerja);
        System.out.println("Total hari libur dalam periode ini: " + hariLibur);
    }
}