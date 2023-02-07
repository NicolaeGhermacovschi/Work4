package Temperature;

public class TemperatureConverter {
	
	private double temp;
	
	public void setTemp(double temp) {
		this.temp = temp;
	}
	public double getTemp() {
		return temp;
	}
	
	public TemperatureConverter() {	
	}
 
	
	public TemperatureConverter(double temp) {

		this.temp = temp;
	}
	
	
	public void toCelsius(double temp){
		double C = (5 * (temp - 32)) / 9;
		
		System.out.println(temp +  " F -> " + C + " C " );
	}

	
	public void toFahrenheit(double temp){
		double F = (9 * temp + (32 * 5)) / 5;
		
		
		System.out.println(temp +  " C -> " + F + " F " );
	}

}
