public class Temperature{
	public static float celsius_to_fahrenheit(float t){
		if(-273.15f<=t && t<=100){
			return Math.round(((9.0f/5)*t + 32) * 100.0f)/100.0f;
		}
		return Float.NaN;
	}
	public static float celsius_to_kelvin(float t){
		if(-273.15f<=t && t<=100){
			return Math.round(((5/5)*t + 273.15f) * 100.0f)/100.0f;
		}
		return Float.NaN;
	}
	
	public static float fahrenheit_to_celsius(float t){
		if(t>=-459.67f && t<=212){
			return Math.round(((5.0f/9) * (t-32))*100.0f)/100.0f;
		}
		return Float.NaN;
	}
	
	public static float fahrenheit_to_kelvin(float t){
		if(t>=-459.67f && t<=212){
			return Math.round(((5.0f/9)*(t-32) + 273.15f)*100.0f)/100.0f;
		}
		return Float.NaN;
	}
	
	public static float kelvin_to_celsius(float t){
		if(t>=0 && t<=373.15f){
			return Math.round(((5/5)*(t-273.15f))*100.0f)/100.0f;
		}
		return Float.NaN;
	}
	
	public static float kelvin_to_fahrenheit(float t){
		if(t>=0 && t<=373.15f){
			return Math.round((((9.0f/5)*t)- 459.67f)*100.0f)/100.0f;
		}
		return Float.NaN;
	}
}