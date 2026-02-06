package pertemuan_5;
import java.util.Scanner; 
public class DeretJumlahan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double wadah = 0; 
        double angka;
        
        do{
            System.out.print("Masukkan sebarang angka kurang dari 20 : ");
            angka = input.nextDouble();
            if(angka<0 || angka > 20){
                System.out.println("Angka yang anda masukkan tidak valid!");
                System.out.println("Masukkan angka pada interval 0 hingga 20!");
            }
        }while(angka<0 || angka>20); 
        
            for(int i = 1; i<=angka; i++){
                wadah = wadah + (double)i/(i+1);
            }
        System.out.println("Hasil penjumlahannya adalah : " + wadah);
    }
}
