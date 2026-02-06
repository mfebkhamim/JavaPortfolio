import java.text.DecimalFormat;

//Ini adalah Class Complex
public class Complex {
	
	//Class Complex punya dua member variables
	public double re;
	public double im;
	
	//Konstruktor
	public Complex (double re, double im){
		this.re = re;
		this.im = im;
	}
	
	//Member Methods
	public Complex clone(){
		return new Complex(this.re, this.im);
	}
	
	public String toString(int precision) {
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(precision);
        df.setMinimumFractionDigits(precision);
        df.setGroupingUsed(false);

        String reStr = df.format(this.re);
        String imStr = df.format(Math.abs(this.im));

        // Hapus perulangan nol setelah koma desimal
        if (reStr.indexOf(".") > 0) {
            reStr = reStr.replaceAll("0*$", "").replaceAll("\\.$", "");
        }
        if (imStr.indexOf(".") > 0) {
            imStr = imStr.replaceAll("0*$", "").replaceAll("\\.$", "");
        }

        // Tambahkan koma desimal dan nol jika presisi sama dengan nol
        if (precision == 0) {
            reStr += ".0";
            imStr += ".0";
        }
        if (imStr.equals("0")) {
            return reStr;
        } else if (this.im >= 0) {
            return reStr + " + i" + imStr;
        } else {
            // Tambahkan perulangan nol pada imStr jika dibutuhkan
            if (imStr.indexOf(".") < 0) {
                imStr += ".0";
			}
            return reStr + " - i" + imStr;
        }
    }


	public Complex negative(){
		return new Complex(-this.re, -this.im);
	}
	public Complex conjugate(){
		return new Complex(this.re, -this.im);
	}
	public double modulus(){
		return Math.sqrt(this.re * this.re + this.im * this.im);
	}
	
	//class methods
	public static Complex sum(Complex a, Complex b){
		return new Complex(a.re + b.re, a.im + b.im); 
	}
	public static Complex product(Complex a, Complex b){
		double BagianReal = a.re * b.re - a.im * b.im;
		double BagianImajiner = a.re * b.im + a.im * b.re;
		return new Complex(BagianReal, BagianImajiner);
	}
}