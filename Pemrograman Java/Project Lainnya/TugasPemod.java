package tugaspemod;
public class TugasPemod {
    public static void main(String[] args) {
        double hasil = 80000;
        int bulan = 0; 
        
        for(int i = 1; ; i++){
            System.out.println("Iterasi ke-"+i);
            if((hasil + hasil*0.01 - 880.87) < 0){
                System.out.println("Anda tidak perlu membayar sebanyak bulan sebelumnya");
                break;
            }else{
                hasil = hasil + hasil*0.01 - 880.87;
                System.out.println("Hasilnya adalah : " + hasil);
                bulan++;
            }
            
        }System.out.println("Maka akan terbayar lunas setelah : " + bulan + " bulan");
    }
}
