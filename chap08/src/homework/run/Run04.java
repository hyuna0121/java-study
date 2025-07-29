package homework.run;

import homework.model.vo.GalaxyS24;
import homework.model.vo.Iphone15;
import homework.model.vo.SmartPhone;

public class Run04 {
	public static void main(String[] args) {
		SmartPhone[] smartPhones = new SmartPhone[2];
		smartPhones[0] = new GalaxyS24();
		smartPhones[1] = new Iphone15();
		
		for (SmartPhone smartPhone : smartPhones) {
			smartPhone.makeCall();
			smartPhone.takeCall();
			smartPhone.picture();
			smartPhone.charge();
			smartPhone.touch();
			smartPhone.printMaker();
		}
	}
}
