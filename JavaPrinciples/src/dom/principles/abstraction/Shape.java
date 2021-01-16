/**
 * 
 */
package dom.principles.abstraction;

/**
 * @author domjor01
 *
 */

//Abstract classes can have abstract methods and concrete methods.
//Abstract classes cannot be directly instantiated.
//Any Class containing an abstract method must also be declared as abstract.
abstract class Shape {
	
	//Abstract class can have a constructor
	public Shape(String color) {
		System.out.println("Shape constructor invoked");
		this.color = color;
		
	}
	String color;
	
	//Abstract methods: Abstract methods must be implemented by all its subclasses
	//Abstract are not implemented in the abstract class
	abstract double area();
	public abstract String toString();
	
	//Concrete methods: method that has a definition. The definition is inherited by its subclases
	public String getColor() {
		return color;
	}

}
