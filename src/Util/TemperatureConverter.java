package Util;

public class TemperatureConverter {
	
	public static double CelsiusFahrenheit(double Celsius) {
		return (Celsius * 9/5 + 32);
	}
	
	public static double FahrenheitCelsius(double Fahrenheit) {
		return(Fahrenheit -32) * 5/9;
	}
	public static double CelsiusKelvin(double Celsius) {
		return Celsius + 273.15;
	}

	 

}
