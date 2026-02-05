import javax.swing.JOptionPane;
public class GUI_suhu {
    public static void main(String[] args) {
        String Lokasi = JOptionPane.showInputDialog("Masukkan lokasi : "); 
        //Program untuk membuat user dapat menginputkan sebarang lokasi dan suhu; 
        String Suhu_celsius = JOptionPane.showInputDialog("Masukkan suhu (dalam celsius) : ");
        
        float suhu = Float.parseFloat(Suhu_celsius);
        float Suhu_Kelvin = suhu + 273; 
        float Suhu_Reamur = suhu * 4/5;
        float Suhu_Fahrenheit = (suhu * 9/5) + 32; 
        
    //Program untuk menampilkan konversi suhu
        String pesan = "Halo, suhu saat ini di " + Lokasi + " adalah " + suhu + " derajat Celsius atau setara dengan " + Suhu_Fahrenheit
                + " Fahrenheit, " + Suhu_Kelvin + " Kelvin, dan " + Suhu_Reamur + " derajat Reamur."; 
        JOptionPane.showMessageDialog(null, pesan);
    }
}