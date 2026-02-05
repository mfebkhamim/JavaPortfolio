public class Temperature {
    public static float celsius_to_fahrenheit(float t) {
        if (t < -40.0) {
            throw new TemperatureConversionFailed("Temperature cannot be below absolute zero!");
        } else
            return Math.round(((9.0f/5)*t + 32) * 100.0f)/100.0f;
    }

    public static float celsius_to_kelvin(float t) {
        if (t < -273.15f) {
            throw new TemperatureConversionFailed("Temperature cannot be below absolute zero!");
        } else
            return Math.round(((5/5)*t + 273.15f) * 100.0f)/100.0f;
    }

    public static float fahrenheit_to_celsius(float t) {
        if (t < -40.0) {
            throw new TemperatureConversionFailed("Temperature cannot be below absolute zero!");
        } else
            return Math.round(((5.0f/9) * (t-32))*100.0f)/100.0f;
    }

    public static float fahrenheit_to_kelvin(float t) {
        if (t < -459.67) {
            throw new TemperatureConversionFailed("Temperature cannot be below absolute zero!");
        } else
            return Math.round(((5.0f/9)*(t-32) + 273.15f)*100.0f)/100.0f;
    }

    public static float kelvin_to_celsius(float t) {
        if (t < 0.0) {
            throw new TemperatureConversionFailed("Temperature cannot be below absolute zero!");
        } else
            return Math.round(((5/5)*(t-273.15f))*100.0f)/100.0f;
    }

    public static float kelvin_to_fahrenheit(float t) {
        if (t < 0.1) {
            throw new TemperatureConversionFailed("Temperature cannot be below absolute zero!");
        } else
            return Math.round((((9.0f/5)*t)- 459.67f)*100.0f)/100.0f;
    }
}