package pertemuan_10;
import java.util.Scanner; 
public class jumlahusia {
    public static void main(String[] args) {
        int jumlah_anak = 0;
        int jumlah_remaja = 0;
        int jumlah_dewasa = 0;
        int jumlah_lansia = 0;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Buatlah daftar usia dari 10 mahasiswa yang hadir di kelas!");
        int[] usia = new int[10]; 
        for(int i = 0; i<usia.length; i++){
            System.out.print((i+1) + ". " + "Masukkan angka mahasiswa ke-"+ (i+1) + " : ");
            usia[i] = input.nextInt();
            if(usia[i]<0 || usia[i]>120){
                System.out.println("Angka yang anda masukkan tidak valid!");
                i--;
            }
        }
        System.out.println("================================");
        System.out.println("Maka diperoleh list datanya adalah : ");
        for(int i = 0; i<usia.length; i++){
            System.out.print(usia[i]);
            if(i!=(usia.length - 1)){
                System.out.print(", ");
            }else{
                System.out.println("");
            }
        }
        for(int i = 0; i<usia.length; i++){
            if(usia[i] < 12){
                jumlah_anak++;
            }else if(usia[i] < 18){
                jumlah_remaja++; 
            }else if(usia[i]<60){
                jumlah_dewasa++;
            }else{
                jumlah_lansia++; 
            }
        }
        System.out.println("=====================================");
        System.out.println("Jumlah anak-anak = " + jumlah_anak);
        System.out.println("Jumlah remaja = " + jumlah_remaja);
        System.out.println("Jumlah dewasa = " + jumlah_dewasa);
        System.out.println("Jumlah lansia = " + jumlah_lansia);
    }
    
}
