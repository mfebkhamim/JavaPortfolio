package pertemuan_5;
import java.util.Scanner; 
public class CekAngkaRahasia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Angka_Rahasia = 2024; 
        int user_input; 
        int count = 1; 
        
        do {
            System.out.print("Masukkan Angka tebakan (4 digit): ");
            user_input = input.nextInt();

            if (user_input != Angka_Rahasia && count<4){
                System.out.println("Angka yang anda masukkan salah!");
            }else if(user_input != Angka_Rahasia && count ==4){
                System.out.println("Angka yang anda masukkan salah!");
                System.out.println("Kesempatan anda mencoba tinggal satu kali lagi!");
            }else if(user_input != Angka_Rahasia && count == 5){
                System.out.println("Angka yang anda masukkan salah!");
                System.out.println("Maaf, kesempatan anda telah habis!");
            }
            else{
                System.out.println("Angka yang anda masukkan benar!");
            }
            count++; 
        } while (user_input != Angka_Rahasia && count <=5);
    }
}