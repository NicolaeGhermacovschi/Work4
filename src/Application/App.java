package Application;
import Circle.CircleCircle;
import Temperature.TemperatureConverter;
import edu.tekwill.academy.*;
import edu.tekwill.academy.computer.*;

public class App {

	public static void main(String[] args) {
	
		System.out.println("=========== EX 1 ================\n");
		Computer comp = new Computer();
		
		comp.addComponents();
		
		System.out.println("=========== EX 2 ================\n");
		CircleCircle circle = new CircleCircle(9.5);
		
		circle.calculateArea();
		
		System.out.println("=========== EX 3 ================\n");
		TemperatureConverter tConverter = new TemperatureConverter();
		
		tConverter.toCelsius(15);
		tConverter.toFahrenheit(18);
		
	}

}
