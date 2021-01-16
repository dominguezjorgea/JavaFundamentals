package dom.principles.abstraction;

class Rectangle extends Shape {
	double with;
	double length;

	public Rectangle(String color, double with, double length) {
		super(color);
		System.out.println("Rectangle constructor invoked");
		this.with = with;
		this.length = length;
	}

	@Override
	double area() {
		return length*with;
	}

	@Override
	public String toString() {
		return "Rectangle color is " + super.color + " and area is: " + area();
	}

}
