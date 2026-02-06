package pertemuan_6;
import java.util.Scanner; 
public class biseksi {

    private static String x_baru;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Anggap terdapat fungsi f(x) = ax^2 + bx + c = 0");
        System.out.print("Masukkan a : ");
        int a = input.nextInt(); 
        System.out.print("Masukkan b : ");
        int b = input.nextInt(); 
        System.out.print("Masukkan c : ");
        int c = input.nextInt(); 
        System.out.print("Masukkan nilai taksiran bawah (x_l) : ");
        double x_l = input.nextDouble(); 
        System.out.print("Masukkan nilai taksiran atas (x_u) : ");
        double x_u = input.nextDouble(); 
        System.out.print("Masukkan nilai toleransi : ");
        double toleransi = input.nextDouble(); 
        
        //menentukan nilai x_r
        int iterasi = 1; 
        while(iterasi > 0){
            double x_baru = (x_l + x_u)/2; 
            double fx_l = a*(Math.pow(x_l,2)) + b*x_l + c;
            double fx_r = a*(Math.pow(x_baru,2)) + b*x_baru + c;
            System.out.println("Iterasi ke-" +iterasi);
            if(fx_l * fx_r < 0){
                x_u = x_baru;
                System.out.println("Nilai x_baru saat ini adalah : " + x_baru);
            }else if(fx_l * fx_r > 0){
                x_l = x_baru;
                System.out.println("Nilai x_baru saat ini adalah : " + x_baru);
            }else if(fx_l * fx_r == 0){
                System.out.println("Nilai x_baru saat ini adalah : " + x_baru);
                break; 
            }else if(fx_r < toleransi){
                System.out.println("Nilai x_baru saat ini adalah : " + x_baru);
                break;
            }
        iterasi++; 
        }
    }
}
