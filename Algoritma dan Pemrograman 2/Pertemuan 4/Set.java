public class Set {
	public static int[] union(int[] A, int[] B) {
		if (!isSingleSet(A) || !isSingleSet(B)) {
            throw new SetInvalid("Input set must not be multiset!");
		}
		//Program untuk menentukan panjang A irisan B
		int jumlahsama = 0; 
		for(int y = 0; y<A.length; y++){
			for(int z = 0; z<B.length; z++){
				if(A[y] == B[z]){
					jumlahsama = jumlahsama + 1; 
				}
			}
		}
		
		//Program untuk mencari gabungan dari himpunan A dan himpunan B
		int panjang = A.length + B.length - jumlahsama; 
		int[] gabungan = new int[panjang]; 
		int indeks = 0; 
		
		//meng-input semua elemen pada himpunan A
		for(int i = 0; i<A.length; i++){
			gabungan[indeks] = A[i]; 
			indeks++; 
		}
		
		//Menginput semua anggota B yang bukan anggota A
		for(int j = 0; j < B.length; j++){
			boolean ada = false; 
			for(int k = 0; k < A.length && !ada; k++){
				if(A[k] == B[j]){
					ada = true;
				}
			}
			if(!ada){
				gabungan[indeks] = B[j];
				indeks++;
			}
		}
		
		//Mengurutkan kembali gabungan
		for(int m = 0; m<panjang; m++){
			for(int n=0; n<(panjang - m - 1); n++){
				if(gabungan[n] > gabungan[n+1]){
					int wadah2 = gabungan[n];
					gabungan[n] = gabungan[n+1];
					gabungan[n+1] = wadah2;
				}
			}
		}return gabungan;
	}
	
	public static int[] intersection(int[] A, int[] B) {
		if (!isSingleSet(A) || !isSingleSet(B)) {
            throw new SetInvalid("Input set must not be multiset!");
		}
		//menentukan panjang A irisan B
		int jumlahsama = 0; 
		for(int y = 0; y<A.length; y++){
			for(int z = 0; z<B.length; z++){
				if(A[y] == B[z]){
					jumlahsama = jumlahsama + 1; 
				}
			}
		}
        
		//menentukan irisan dari dua himpunan
		int[] irisan = new int[jumlahsama];
		int indeks = 0; 
		for(int k = 0; k<A.length; k++){
			for(int l = 0; l<B.length; l++){
				if(A[k] == B[l]){
					irisan[indeks] = A[k];
					indeks++;
				}
			}
		}
		
		//Mengurutkan kembali irisan
		for(int m = 0; m<jumlahsama; m++){
			for(int n=0; n<(jumlahsama - m - 1); n++){
				if(irisan[n] > irisan[n+1]){
					int wadah2 = irisan[n];
					irisan[n] = irisan[n+1];
					irisan[n+1] = wadah2;
				}
			}
		}return irisan;
	}	
	
	private static boolean isSingleSet(int[] set) {
        for (int i = 0; i < set.length; i++) {
            for (int j = i + 1; j < set.length; j++) {
                if (set[i] == set[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean contains(int[] array, int element, int length) {
        for (int i = 0; i < length; i++) {
            if (array[i] == element) {
                return true;
            }
        }
        return false;
    }
}