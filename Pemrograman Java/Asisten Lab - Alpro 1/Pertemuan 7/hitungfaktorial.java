package pertemuan_7;
import java.util.Scanner; 
public class hitungfaktorial {
    public static int faktorial(int n){
        int hasil = 1; 
        if(n == 0 || n==1){
            return 1; 
        }else if(n<0){
            return 0;  
        }
        for(int i = 1; i <=n; i++){
            hasil = hasil*i; 
        }
        return hasil; 
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan sebarang bilangan n : ");
        int n = input.nextInt(); 
        if(faktorial(n) > 0){
            System.out.println("Hasil " + n + "! = " + faktorial(n));
        }else{
            System.out.println("Angka yang anda cantumkan tidak valid!");
        }
    }
}
