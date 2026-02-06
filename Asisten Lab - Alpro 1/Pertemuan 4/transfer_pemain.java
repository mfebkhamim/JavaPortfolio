package pertemuan4;
import java.util.Scanner; 
public class transfer_pemain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.print("Masukkan besaran biaya yang anda miliki (dalam Juta Euro) : ");
        int biaya = input.nextInt();
        System.out.print("Masukkan jumlah pemain yang ingin dibeli : ");
        int jumlah_pemain = input.nextInt();
        System.out.print("Masukkan posisi pemain yang anda inginkan : ");
        String posisi = input.next();
        
        if(biaya>20){
            if(jumlah_pemain > 1){
                System.out.println("Selamat, anda mendapatkan diskon 30%");
            }
            else if(jumlah_pemain==1){
                if(posisi == "Kiper"){
                    System.out.println("Selamat, anda mendapatkan diskon sebesar 20%");
                }
                else if(posisi == "Bek"){
                    System.out.println("Selamat, anda mendapatkan diskon sebesar 23%");
                }
                else if(posisi == "Gelandang"){
                    System.out.println("Selamat, anda mendapatkan diskon sebesar 16%");
                }
                else if(posisi == "Penyerang"){
                    System.out.println("Selamat, anda mendapatkan diskon sebesar 10%");
                }
                else{
                    System.out.println("Mohon maaf, pastikan input yang kalian masukkan menggunakan kapital pada awal kalimat!");
                }
            }
            else{
                System.out.println("Jumlah pemain yang anda masukkan tidak valid!");
            }
        }
        else if(biaya > 0 && biaya < 20){
            System.out.println("Mohon maaf, biaya yang anda miliki tidak cukup!");
        }
        else{
            System.out.println("Biaya yang anda masukkan tidak valid!");
        }
    }
}