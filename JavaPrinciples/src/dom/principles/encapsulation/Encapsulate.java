package dom.principles.encapsulation;

//Encapsulation is wrapping data.
//Protective shield that prevents data to be accessed by code outside of this shield
//Encapsulation can be achieved by declaring all the variables in the class as private
// and declaring public methods 
//Direct access of the variables of the class in not possible due to encapsulation
public class Encapsulate {

	//Declaration of private variables
	private String name;
	private String lastName;
	private int age;
	
	//Public methods to access the variables
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
}
