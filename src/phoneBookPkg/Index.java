package phoneBookPkg;

import java.util.Scanner;
/**
 * Console-operated phone book application to demonstrate core java understanding
 * as well as object oriented programming. 
 *
 * @author Joseph Borders
 *
 */
public class Index {

	// Declare global object array to store person entries. Array is declared in the
	// Index class for easy visibility.
	public static Person[] phoneBookArray = new Person[3];
	public static Scanner in = new Scanner(System.in);

	public static void addTestCases() {
		// Create test case object 1 and set attributes with the default Person object
		// constructor.
		Person entry0 = new Person();
		entry0.setFirstName("John");
		entry0.setMiddleName("(none)");
		entry0.setLastName("Doe");
		entry0.setTelephoneNumber("(636) 643-5698");
		entry0.setStreet("114 Market St");
		entry0.setCity("St Louis");
		entry0.setState("MO");
		entry0.setZipCode("63403");

		// Create test case objects 2 and 3; set attributes with the parameterized
		// Person object constructor.
		Person entry1 = new Person("John", "E", "Doe", "(847) 539-0126", "324 Main St", "St Charles", "MO", "63303");
		Person entry2 = new Person("John", "Michael", "West Doe", "(562) 859-2375", "574 Pole Ave", "St Peters", "MO",
				"63333");

		// Add Person object entries to the phone book array.
		Index.phoneBookArray[0] = entry0;
		Index.phoneBookArray[1] = entry1;
		Index.phoneBookArray[2] = entry2;
		
	}

	public static void main(String[] args) {
		// Make a call to the "addTestCases" function to populate the array with the
		// test case Person objects.
		addTestCases();

		// The main method of this application simply makes a call to the "mainMenu"
		// method.
		Methods.mainMenu();

	}
}