package dom.principles.inheritance.multilevel;

import dom.principles.inheritance.simple.Two;

//A <- B <- C
//C Inherits from B and B inherits from A
//Multilevel Inheritance

public class Three extends Two {
	
	public void printThree() {
		System.out.println("and Two Serves for Three, achieving Multilevel Inheritance");
	}

}
