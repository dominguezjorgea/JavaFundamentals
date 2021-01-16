package dom.principles.encapsulation;

public class TestEncapsulation {
	
	public static void main(String[] args) {
		
		Encapsulate encapsulation = new Encapsulate();
		
		//The encapsulation allows to set the variables values only through the setters methods
		encapsulation.setName("George");
		encapsulation.setLastName("Harrison");
		encapsulation.setAge(25);
		
		//The access to the class attributes are only possible through the getters methods
		//Direct access to the class attributes is not possible 
		System.out.println("Name: " + encapsulation.getName());
		System.out.println("Last name: " + encapsulation.getLastName());
		System.out.println("Age: " + encapsulation.getAge());
	}

}
