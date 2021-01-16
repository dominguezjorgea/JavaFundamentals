package dom.principles.polymorphism;

//Multiple functions with the same name but different parameters
//Functions can be overloaded by changing the number of arguments and/or changing
//the type of parameters

//Method overloading with the same number of parameters but different type
//Compile-time Polymorphism 
class PolymorphismStatic {
	
	static int multiply (int a, int b) {
		return a*b;
	}
	
	static double multiply (double a, double b) {
		return a*b;
	}
	
	public static void main(String[] args) {
		System.out.println(PolymorphismStatic.multiply(3, 5));
		System.out.println(PolymorphismStatic.multiply(3.3, 9.2));
	}
}

