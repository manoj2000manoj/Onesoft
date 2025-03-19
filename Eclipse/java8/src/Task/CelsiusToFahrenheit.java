package Task;

public class CelsiusToFahrenheit {
	public static void main(String[] args) {
		CelsiusToFahrenheit s=new CelsiusToFahrenheit();
		float celsius=9.5F;
		System.out.println(s.Fahrenheit(celsius));
	}
	public float Fahrenheit(float celsius) {
		float fahrenheit=(celsius*9/5)+32;
		return fahrenheit;
	}

}
