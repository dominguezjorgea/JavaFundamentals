package dom.principles.polymorphism;

//Process in which a function call is resolved at runtime. This type of polymorphism 
//is achieved by method overriding

/*
public class Parent {
	void print() {
		System.out.println("Parent Class - Super Class");
	}
}

public class SubClass1 extends Parent{
	void print() {
		System.out.println("Subclass 1");
	}
}

public class SubClass2 extends Parent {
	void print() {
		System.out.println("SubClass 2");
	}
}
*/

//Super class has it own definition for the method print(). 
//SubClass1 and Subclasss2 extend superclass Parent. Nevertheless each one implements 
//the method print() with its own definition

public class PolymorphismDynamic {

	public static void main(String[] args) {
		Parent parent;
		
		parent = new SubClass1();
		parent.print();
		
		parent = new SubClass2();
		parent.print();

	}

}
