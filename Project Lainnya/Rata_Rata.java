package pertemuan_10;
import java.util.Scanner; 
public class Rata_Rata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.print("Masukkan banyak angka : ");
        int jumlah = input.nextInt(); 
        
        int[] angka = new int[jumlah]; 
        for(int i = 0; i < angka.length; i++){
            System.out.print("Masukkan angka ke-" + (i+1) + " : ");
            angka[i] = input.nextInt(); 
        }
        
        double wadah = 0; 
        for(int j = 0; j < angka.length; j++){
            wadah = wadah + angka[j]; 
        }
        System.out.println("Maka, rata-ratanya adalah : " + wadah/jumlah);
        
        int max = 0, min = angka[0];
        for(int k = 0; k < angka.length; k++){
            if(max < angka[k]){
                max = angka[k]; 
            }else if(min>angka[k]){
                min = angka[k]; 
            }
        }
        System.out.println("Nilai maksimal dari Array tersebut adalah : " + max);
        System.out.println("Nilai minimal dari Array tersebut adalah : " + min);
    }
}
