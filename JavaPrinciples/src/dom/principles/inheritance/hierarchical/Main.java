package dom.principles.inheritance.hierarchical;

import dom.principles.inheritance.simple.Two;

public class Main {

	public static void main(String[] args) {
		Two two = new Two();
		Three three = new Three();
		two.printOne();
		two.printTwo();
		three.printOne();
		three.printThree();
	}
}
