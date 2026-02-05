public class Sort {

  public static String[] alphabetical(String[] l, boolean ascending) {
    String[] A = l.clone(); 

    // Pengurutan ketika kondisi Ascending terpenuhi
    if (ascending) {
		for (int i = 0; i < A.length - 1; i++) {
			for (int j = 0; j < A.length - i - 1; j++) {
				if (A[j].compareToIgnoreCase(A[j + 1]) > 0) {
					String wadah = A[j];
					A[j] = A[j + 1];
					A[j + 1] = wadah;
				}
			}
		}
    } else { // Pengurutan ketika kondisi Descending terpenuhi
		for (int i = 0; i < A.length - 1; i++) {
			for (int j = 0; j < A.length - i - 1; j++) {
				if (A[j].compareToIgnoreCase(A[j + 1]) < 0) {
					String wadah = A[j];
					A[j] = A[j + 1];
					A[j + 1] = wadah;
				}
			}
		}
    }
	return A;
  }
}