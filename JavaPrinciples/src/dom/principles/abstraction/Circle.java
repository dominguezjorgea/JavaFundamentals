package dom.principles.abstraction;

class Circle extends Shape {
	
	double radious;
	
	public Circle(String color, double radious) {
		super(color);
		System.out.println("Circle constructor invoked");
		this.radious = radious;
	}

	//must be defined as this is an abstract method in the super class Shape
	@Override
	double area() {
		return Math.PI * Math.pow(this.radious, 2);
	}

	@Override
	public String toString() {
		return "Circle color is " + super.color + " and its area is: " + this.area();
	}

}
