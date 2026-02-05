import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class Statistics {

    	public static float mean(float[] X) {
			float total = 0; 
			for(int i = 0; i < X.length; i++){
				total = total + X[i]; 
			}
			return Math.round((total / X.length) * 100.0f) / 100.0f;
		}
	
	    public static float mode(float [] X){ 
			float NilaiMaks = 0, TotalMaks = 0;
 
			for (int i = 0; i < X.length; ++i) {
				int hitung = 0;
				for (int j = 0; j < X.length; ++j) {
					if (X[j] == X[i])
						++hitung;
					}
				if (hitung > TotalMaks) {
					TotalMaks = hitung;
					NilaiMaks = X[i];
				}
			}
			return NilaiMaks;
		}
	
	public static float median(float[] X) {
        float[] urut = new float[X.length]; 
        int a = X.length; 
        for(int i = 0; i<a; i++){
            for(int j=0; j<(a - i - 1); j++){
                if(X[j] > X[j+1]){
					urut[i] = X[j];
					X[j] = X[j+1];
					X[j+1] = urut[i];
                }
            }
        }
		if (a % 2 == 0) {
            return Math.round(((X[a/2 - 1] + X[a/2]) / 2.0f) * 100.0f) / 100.0f; 
        }else {
            return Math.round(X[a/2] * 100.0f) / 100.0f;
        }
    }

    public static float q1(float[] X) {
        float[] urut = new float[X.length]; 
        int a = X.length; 
        for(int i = 0; i<X.length; i++){
            for(int j=0; j<(X.length - i - 1); j++){
                if(X[j] > X[j+1]){
					urut[i] = X[j];
					X[j] = X[j+1];
					X[j+1] = urut[i];
                }
            }
        }if (a % 2 == 0) {
            return median(Arrays.copyOfRange(X, 0, a / 2));
        }else {
            return median(Arrays.copyOfRange(X, 0, a / 2));
        }
    }

    public static float q3(float[] X) {
        float[] urut = new float[X.length]; 
        int a = X.length; 
        for(int i = 0; i<X.length; i++){
            for(int j=0; j<(X.length - i - 1); j++){
                if(X[j] > X[j+1]){
					urut[i] = X[j];
					X[j] = X[j+1];
					X[j+1] = urut[i];
                }
            }
        }
		if (a % 2 == 0) {
            return median(Arrays.copyOfRange(X, a / 2, a));
        }else {
            return median(Arrays.copyOfRange(X, a / 2 + 1, a));
        }
    }
}