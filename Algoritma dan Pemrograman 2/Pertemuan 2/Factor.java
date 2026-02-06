public class Factor {

    public static int gcd(int n, int m) {
        while (m != 0) {
			if(m > 0 && n > 0){
				int baru = m;
				m = n % m;
				n = baru;
			}else if(m<0 && n<0){
				int baru = m; 
				m = n%m;
				n = -baru; 
			}else if(m>0 && n<0){
				int baru = m; 
				m = n%m; 
				n = baru; 
			}else if(n>0 && m<0){
				int baru = m; 
				m = n%m; 
				n=-baru; 
			}else if(n == 0 && m < 0){
				int baru = m; 
				m = n%m; 
				n = -baru; 
			}else{
				int baru = m; 
				m = n%m; 
				n = baru; 
			}
		}
        return n; 
    }

    public static long lcm(int n, int m) {
        if (n == 0 || m == 0) {
            return 0; 
        }
        return Math.abs(((long) n * (long) m) / gcd(n, m)); 
    } 
}