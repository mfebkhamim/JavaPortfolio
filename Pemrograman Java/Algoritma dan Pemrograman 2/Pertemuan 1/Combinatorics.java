public class Combinatorics{
	
	public static long faktorial(int n){
		if(n==0 || n==1){
			return 1;
		}
		return n*faktorial(n-1);
	}
	
	public static long combination(int n, int r){
		if(n>=r && r>=0){
			return faktorial(n)/(faktorial(n-r) * faktorial(r));
		}
		return 0;
	}
	
	public static long permutation (int n, int r){
		if(n>=r){
			return faktorial(n)/faktorial(n-r);
		}
		return 0;
	}
}