package pertemuan_6;
import java.util.Scanner; 
public class newton_raphson {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.println("Anggap terdapat fungsi f(x) = ax^2 + bx + c = 0");
        System.out.print("Masukkan a : ");
        int a = input.nextInt(); 
        System.out.print("Masukkan b : ");
        int b = input.nextInt(); 
        System.out.print("Masukkan c : ");
        int c = input.nextInt(); 
        System.out.print("Masukkan nilai taksiran : ");
        double x = input.nextDouble(); 
        System.out.print("Masukkan nilai toleransi : ");
        double tolerance = input.nextDouble(); 
       
        //anggap turunan berbentu dx + e
        int d = 2 * a;
        int e = b; 
        int iterasi = 1;
        
        while (iterasi >= 1){
        //Hitung delta
            System.out.println("Iterasi ke-" + iterasi);
            double fx = a*Math.pow(x,2) + b*x + c; 
            double f_x = d*x + e; 
            double delta = fx/f_x; 
            x = x - delta;
            System.out.println("Nilai x saat ini : " + x);
            
            if(Math.abs(delta) < tolerance){
                break;
            }
            
        iterasi++;
        }
        System.out.println("Akar persamaan mendekati : " + x);
    }
}