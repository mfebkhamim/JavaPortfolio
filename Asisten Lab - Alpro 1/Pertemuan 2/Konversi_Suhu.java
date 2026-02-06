package pertemuankedua;
import java.util.Scanner; 

public class Konversi_Suhu {
    public static void main(String[] args) {
    Scanner Khamim = new Scanner(System.in);
    
    //Program untuk membuat user dapat menginputkan sebarang panjang inch
        System.out.print("Masukkan Suhu (dalam Celsius) : ");
        int Suhu_Celsius = Khamim.nextInt();
        
        int Suhu_Kelvin = Suhu_Celsius + 273; 
        double Suhu_Reamur = Suhu_Celsius * 4/5;
        double Suhu_Fahrenheit = (Suhu_Celsius * 9/5) + 32; 
        
    //Program untuk menampilkan konversi suhu
        System.out.println("Suhu dalam kelvin adalah : " + Suhu_Kelvin);
        System.out.println("Suhu dalam reamur adalah : " + Suhu_Reamur);
        System.out.println("Suhu dalam Farenheit adalah : " + Suhu_Fahrenheit);
    }
}
