package dom.principles.abstraction;

class test {

	public static void main(String[] args) {
		
		Shape shape1 = new Circle("Blue", 3.5);
		Shape shape2 = new Rectangle("Yellow", 3, 6);
		
		System.out.println(shape1.toString());
		System.out.println(shape2.toString());

	}

}
