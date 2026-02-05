package pertemuan_7;
public class tanpa_return {
    public static void main(String[] args) {
        nilai_mahasiswa("Kevin Diks", 90); 
        System.out.println(" ");
        nilai_mahasiswa("Ernando Ari", 60); 
        System.out.println(" ");
        nilai_mahasiswa("Kylian Mbappe", 96); 
    }
    
    public static void nilai_mahasiswa(String nama, int nilai){
        System.out.println("Nama : " + nama);
        System.out.println("Nilai : " + nilai);
    }
    /*public static void main(String[] args) {
        String nama1 = "Kevin Diks";
        int nilai1 = 90; 
        String nama2 = "Ernando Ari";
        int nilai2 = 60; 
        String nama3 = "Kylian Mbappe";
        int nilai3 = 96;
        
        System.out.println("Nama : " + nama1);
        System.out.println("Nilai : " + nilai1);
        System.out.println(" ");
        System.out.println("Nama : " + nama2);
        System.out.println("Nilai : " + nilai2);
        System.out.println(" ");
        System.out.println("Nama : " + nama3);
        System.out.println("Nilai : " + nilai3);
    }
} 
