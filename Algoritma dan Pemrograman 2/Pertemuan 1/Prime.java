public class Prime{
	
	public static boolean prima(int angka) {
        if (angka <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(angka); i++) {
            if (angka % i == 0) {
                return false;
            }
        }
        return true;
    }
	public static int count(int l, int u){
		int count = 0; 
		for(int i = l; i<=u; i++){
			if(prima(i)){
				count = count+1;
			}
		}return count;
	}
}	