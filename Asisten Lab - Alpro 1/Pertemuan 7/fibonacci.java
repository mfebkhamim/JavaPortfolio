package pertemuan_7;
import java.util.Scanner; 
public class fibonacci {
    public static int fibonacci(int n){
 
        if(n<=0){
            return 0; 
        }else if(n == 1||n == 2){
            return 1; 
        }else{
            int hasil_1 = 1;
            int hasil_2 = 1;
            int hasil = 0;
            for(int i = 3; i<=n; i++){
                hasil = hasil_1 + hasil_2; 
                hasil_1 = hasil_2; 
                hasil_2 = hasil; 
            }
            return hasil; 
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan sebarang n : ");
        int n = input.nextInt();
        if(fibonacci(n) == 0){
            System.out.println("Input yang anda masukkan adalah tidak valid!");
        }else{
            System.out.println("Jumlah suku ke-" +n+ " dari deret Fibonacci : " + fibonacci(n));        
        }
    }
}
