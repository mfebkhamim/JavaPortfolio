public class Circumcircle {
    public static float radius(float ax, float ay, float bx, float by, float cx, float cy) {
       
		//mencari panjang tiap sisi segiitiga
		double sisi1 = Math.sqrt((bx - ax)*(bx - ax) + (by - ay)*(by-ay));
		double sisi2 = Math.sqrt((cx - ax)*(cx - ax) + (cy - ay)*(cy - ay)); 
		double sisi3 = Math.sqrt((cx - bx)*(cx - bx) + (cy - by)*(cy - by)); 
		
		//mencari gradien
		double gradien1 = (by-ay)/(bx-ax);
		double gradien2 = (cy-ay)/(cx-ax);
		double gradien3 = (cy-by)/(cx-bx);
		
        if (gradien1 == gradien2 && gradien2 == gradien3) {
            throw new CircumcircleDegenerateConstruct("The three points must not be colinear!");
        } else {
			double S = 0.5 * (sisi1 + sisi2 + sisi3); 
			double Luas = Math.sqrt(S*(S-sisi1)*(S-sisi2)*(S-sisi3));
			double r = (sisi1*sisi2*sisi3) / (4*Luas); 
			return Math.round(r * 1e6f) / 1e6f;  
        }
    }

    public static float circumference(float ax, float ay, float bx, float by, float cx, float cy) {
        float r = radius(ax, ay, bx, by, cx, cy);
        return Math.round(2 * Math.PI * r * 1e2f) / 1e2f; 
    }

    public static float area(float ax, float ay, float bx, float by, float cx, float cy) {
        float r = radius(ax, ay, bx, by, cx, cy);
        return Math.round(Math.PI * r * r * 1e2f) / 1e2f;
    }
}