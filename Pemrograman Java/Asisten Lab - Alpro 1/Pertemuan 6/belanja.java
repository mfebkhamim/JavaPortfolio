package pertemuan_6;
import java.util.Scanner; 
public class belanja {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ini adalah sistem penjumlahan belanjaan!");
        System.out.println("Anggap harga dalam satuan rupiah");
        int total_harga = 0; 
        
        for(int i = 1; i>0; i++){
            System.out.print("Masukkan harga barang ke-" + i + " : ");
            int harga = input.nextInt();
            total_harga = total_harga + harga; 
            System.out.println("Total harga belanjaan anda saat ini sebesar : " + total_harga);
            
            if(total_harga>200000){ 
                System.out.println("Total harga belanjaan anda telah lebih dari 200000");
                System.out.println("Barang tak bisa ditambahkan karena uang anda tidak mencukupi!");
                total_harga = total_harga - harga; 
                break;
            }
        }
        System.out.println("Anda harus membayar belanjaan sebesar : " + total_harga);
    }
}