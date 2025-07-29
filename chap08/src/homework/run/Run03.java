package homework.run;

import homework.model.vo.Car;
import homework.model.vo.ElectricEngine;
import homework.model.vo.GasolineEngine;

public class Run03 {
	public static void main(String[] args) {
		Car car1 = new Car(new GasolineEngine());
		Car car2 = new Car(new ElectricEngine());
		
		car1.startEngine();
		car2.startEngine();
	}
}
