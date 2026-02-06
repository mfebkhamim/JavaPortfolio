public class Circumcircle{
	
	public static float radius(float ax, float ay, float bx, float by, float cx, float cy){
		
		//mencari panjang tiap sisi segiitiga
		double sisi1 = Math.sqrt((bx - ax)*(bx - ax) + (by - ay)*(by-ay));
		double sisi2 = Math.sqrt((cx - ax)*(cx - ax) + (cy - ay)*(cy - ay)); 
		double sisi3 = Math.sqrt((cx - bx)*(cx - bx) + (cy - by)*(cy - by)); 
		
		//mencari gradien
		double gradien1 = (by-ay)/(bx-ax);
		double gradien2 = (cy-ay)/(cx-ax);
		double gradien3 = (cy-by)/(cx-bx);
		
		//Uji Kolinear
		if(gradien1 == gradien2 && gradien2 == gradien3){
			return Float.NaN; 
		}else{
			double E = Math.pow (10.0, 6.0);
			double S = 0.5 * (sisi1 + sisi2 + sisi3); 
			double Luas = Math.sqrt(S*(S-sisi1)*(S-sisi2)*(S-sisi3));
			double r = (Math.round((sisi1 * sisi2 * sisi3)/(4*Luas)*E)/E); 
			
			return (float)r;
		}
	}
	public static float circumference(float ax, float ay, float bx, float by, float cx, float cy){
		double E = Math.pow (10.0, 2.0);
		float r = radius(ax, ay, bx, by, cx, cy);
		float Keliling = (float)(Math.round(2.0 * Math.PI * r *E)/E); 
			if(Float.isNaN(r)){
				return Float.NaN; 
			}
			else{
				return Keliling;
			}
	}
		
	public static float area(float ax, float ay, float bx, float by, float cx, float cy){
		double E = Math.pow (10.0, 2.0);
		float r = radius(ax, ay, bx, by, cx, cy); 
		
		if(Float.isNaN(r)){
			return Float.NaN; 
		}else{
			float Luas = (float)(Math.round(Math.PI * r * r * E)/E);
			return Luas; 
		}
	}
}