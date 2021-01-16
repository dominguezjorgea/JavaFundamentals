package dom.principles.inheritance.hierarchical;

import dom.principles.inheritance.simple.One;

//A <- B
//A <- C
//B Inherits from A and C inherits from A
//Hierarchical Inheritance

public class Three extends One {
	
	public void printThree() {
		System.out.println("for Three achieving hierachical Inheritance");
	}

}
