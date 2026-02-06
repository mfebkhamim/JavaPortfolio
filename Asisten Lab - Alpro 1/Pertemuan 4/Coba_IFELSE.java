package pertemuan4;
import java.util.Scanner; 
public class Coba_IFELSE {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan skor tim A : ");
        int A = input.nextInt();
        System.out.print("Masukkan skor tim B : ");
        int B = input.nextInt(); 
        
        if(A<0 || B<0){
            System.out.println("Skor tidak valid!");
        }else{
            if(A > B){
                if((A-B) > 3){
                    System.out.println("Tim A menang telak!");
                }else{
                    System.out.println("Tim A menang lawan tim B");
                }
            }
            else if(A < B){
                if((B-A) > 3){ 
                    System.out.println("Tim B menang telak!");
                }else{
                    System.out.println("Tim B menang lawan tim A dengan skor" + A + ":" +B);
                }
            }else{
                System.out.println("Pertandingan berakhir imbang!");
            }
        }
    }
}