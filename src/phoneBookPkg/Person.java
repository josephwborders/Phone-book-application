package phoneBookPkg;
/**
 * Console-operated phone book application to demonstrate core java understanding
 * as well as object oriented programming. 
 *
 * @author Joseph Borders
 *
 */
//Person is the child/sub-class of the Address class. It inherits the attributes and methods 
//of the Address class. Objects of this class are stored in the Object Array in the Methods class.

public class Person extends Address {
	
	//Attributes of the Person object:
	private String firstName;
	private String middleName;
	private String lastName;
	private String telephoneNumber;	

	// Default constructor for the Person object.
	public Person() {
		//Makes a call to the default constructor for the Address object.
		super();
	}
	
	//Parameterized constructor for the Person object using attributed inherited
	//from the Address class.
	public Person(String firstName, String middleName, String lastName, String telephoneNumber, String street, String city, String state, String zipCode) {
		super(street, city, state, zipCode);
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.telephoneNumber = telephoneNumber;
	}
	
	//Getter and setter methods for assigning values to the Person object attributes.
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}
	
	//Person class toString method returns formatted Person object attributes, and makes a call to
	//the toString method in the parent/super Address class to return those attributes as well.
	@Override
	public String toString() {
		return firstName + " " + middleName + " " + lastName + ", \n" + super.toString() + "\nTel: " + telephoneNumber;
	}

}
