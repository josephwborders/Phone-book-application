package phoneBookPkg;

//Address is the parent/super class of the Person class. Its attributes and methods will
//be inherited by the Person class.

//Define class as abstract. Address objects will not be created on their own; only in 
//conjunction with Person objects. These methods an attributes are only accessible when
//creating/viewing/modifying Person objects.
abstract class Address {

	private String street;
	private String city;
	private String state;
	private String zipCode;

	//Default constructor.
	public Address() {
	}

	//Parameterized constructor.
	public Address(String street, String city, String state, String zipCode) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}

	//Getter and setter methods for assigning values to Person object address attributes.
	public String getStreet() {
		return street;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	//Parent/super class toString method is inherited by the child/sub class "Person",
	//and provides formatted output of Address attribute values.
	@Override
	public String toString() {
		return street + ", \n" + city + ", " + state + ", " + zipCode;
	}

}
