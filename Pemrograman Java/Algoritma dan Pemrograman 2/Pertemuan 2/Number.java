public class Number{
		public static boolean perfect(int n){
		 if (n <= 1) {
            return false;
        }

        int sum = 1; // Bilangan 1 pasti selalu membagi bilangan tersebut
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                sum += i;
                if (i * i != n) {
                    sum += n / i;
                }
            }
        }

        return sum == n;
	}
}