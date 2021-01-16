package dom.principles.inheritance;

//Important Pillar of Object Oriented Programming
//Mechanism in Java by which one class inherits features (attributes and methods)from another class.

//Super Class: Class whose attributes are inherited is known as super class
//Sub Class: Class inherits from the supper class is known as the sub class
//Reusability: Inheritance support the concept of reusability. When a class is needed and there is 
//already a class that includes some of the code needed, then new class can derive from the existing class.

//Base class or Super Class
public class Bicycle {
	
	protected int gear;
	protected int speed;
	
	public Bicycle(int gear, int speed) {
		this.gear = gear;
		this.speed = speed;
	}
	
	public void applyBreak(int decrement) {
		speed -= decrement;
	}
	
	public void speedUp(int increment) {
		speed += increment;
	}
	
	public String toString() {
		return ("Number of gears are " + gear
				+"\n"
				+"speed of bicycle is " + speed);
	}
	
	

}
