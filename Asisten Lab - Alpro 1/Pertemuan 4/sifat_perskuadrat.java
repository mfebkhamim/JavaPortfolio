package pertemuan4;
import java.util.Scanner;
public class sifat_perskuadrat {
    public static void main(String[] args) {
        Scanner Khamim = new Scanner(System.in);
        int a, b, c; 
        System.out.print("Masukkan koefisien dari x^2: ");
        a = Khamim.nextInt();
        System.out.print("Masukkan koefisien dari x : ");
        b = Khamim.nextInt(); 
        System.out.print("Masukkan konstanta (c) : ");
        c = Khamim.nextInt(); 
        
        int D = b*b - 4*a*c;
        int Tibal = a*b; 
        
        if (a == 0) {
            System.out.println("Persamaan yang anda input bukan persamaan kuadrat.");
        } else {
            String arahGrafik; 
                if(a>0){
                    arahGrafik = "menghadap ke atas"; 
                } else{
                    arahGrafik = "menghadap ke bawah"; 
                }
                
            String letakTitikBalik;
            if (Tibal > 0) {
                letakTitikBalik = "di kiri sumbu-y";
            } else if (Tibal < 0) {
                letakTitikBalik = "di kanan sumbu-y";
            } else {
                letakTitikBalik = "tepat pada sumbu-y";
            }
            
            // Menentukan jenis grafik berdasarkan determinan
            if (D > 0) {
                System.out.println("Persamaan kuadrat : " + a + "x^2 + " + b + "x + " + c + " = 0 memiliki ciri:");
                System.out.println("1. Grafik kuadrat yang " + arahGrafik);
                System.out.println("2. Grafik kuadrat yang memotong sumbu-x di dua titik");
                System.out.println("3. Grafik kuadrat dengan titik balik " + letakTitikBalik);
            } else if (D == 0) {
                System.out.println("Persamaan kuadrat : " + a + "x^2 + " + b + "x + " + c + " = 0 memiliki ciri:");
                System.out.println("1. Grafik kuadrat yang " + arahGrafik);
                System.out.println("2. Grafik kuadrat yang memotong sumbu-x di satu titik");
                System.out.println("3. Grafik kuadrat dengan titik balik " + letakTitikBalik);
            } else {
                System.out.println("Persamaan kuadrat : " + a + "x^2 + " + b + "x + " + c + " = 0 memiliki ciri:");
                System.out.println("1. Grafik kuadrat yang " + arahGrafik);
                System.out.println("2. Grafik kuadrat tidak memotong sumbu-x");
                System.out.println("3. Grafik kuadrat dengan titik balik " + letakTitikBalik);
            }
        }
    }
}