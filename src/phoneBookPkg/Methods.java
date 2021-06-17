package phoneBookPkg;

//This class contains the principal methods for the application, and makes calls to methods
//in the SearchMethods and ModifyMethods class when needed.
public class Methods {

	public static void mainMenu() {
		// The main menu is called from the Index class, and is the starting point for
		// using the application.

		// Print main menu options
		System.out.println("Phone Book - By Joe Borders");
		System.out.println("****************************");
		System.out.println("Please choose from the following options:");
		System.out.println("1. Search entries");
		System.out.println("2. Create a new entry");
		System.out.println("3. Update an existing entry");
		System.out.println("4. Delete an entry");
		System.out.println("5. View all entries");
		System.out.println("6. Exit");
		System.out.print("\nEnter the number corresponding to your choice: \n");

		int option = Index.in.nextInt();

		// Switch block calls the method corresponding to user input on line 40.
		switch (option) {
		case 1:
			// Makes a call to a method in the SearchMethods class.
			searchEntries();
			break;
		case 2:
			addEntry();
			break;
		case 3:
			// Makes a call to a method in the ModifyMethod class.
			updateEntry();
			break;
		case 4:
			deleteEntry();
			break;
		case 5:
			viewAll();
			break;
		case 6:
			exitPhonebook();
			break;
		default:
			// Default case provides error handling in case user input does not match a
			// valid case.
			System.out.println("\n***Please choose a number from 1 to 5.***\n");
			mainMenu();
			break;
		}
	}

	// The "viewAll" method is called by case 5 in the switch block of the "mainMenu
	// method. It uses a for each loop and the toString() method to display all elements
	// in the object array declared in the Index class.
	public static void viewAll() {
		for (Object entry : Index.phoneBookArray) {
			System.out.println(entry.toString() + "\n-------------------------");
		}
		// Prompt the user for a decision whether to continue, or terminate the
		// application.
		continueUsing();
	}

	// The "exitPhonebook" method is called by case 6 in the switch block of the
	// "mainMenu" method. It makes a call to the "continueUsing" method which 
	//prompts the user for a decision whether to continue, or terminate the application.
	public static void exitPhonebook() {
		continueUsing();
	}

	// The "continueUsing" method prompts the user to decide whether to continue
	// using the phone book, or to terminate the application.
	public static void continueUsing() {
		System.out.println("Would you like to continue using the phone book? (Y/N)");
		String exit = Index.in.next();

		// Conditional logic: if the user enters "Y", the "mainMenu" method is called,
		// and the user starts again from the beginning of the application.
		if (exit.equalsIgnoreCase("y")) {
			mainMenu();

			// If anything other than "y" is entered, the application prints a message and
			// terminates.
		} else
			System.out.println("Have a nice day. Goodbye!");

	}

	// Initial search method to define search criteria.
	public static void searchEntries() {
		// Print a list of search types and prompt the user to select one based on its
		// numerical position in the list.
		System.out.println("\nChoose a search parameter: ");
		System.out.println("1. First name");
		System.out.println("2. Last name");
		System.out.println("3. Telephone number");
		System.out.println("4. City");
		System.out.println("5. State");
		int searchType = Index.in.nextInt();

		// Switch block calls the method corresponding to user input on line 15.
		switch (searchType) {
		case 1:
			firstNameSearch();
			break;
		case 2:
			lastNameSearch();
			break;
		case 3:
			telephoneNumberSearch();
			break;
		case 4:
			citySearch();
			break;
		case 5:
			stateSearch();
			break;
		default:
			System.out.println("\n***Please choose a number from 1 to 6.***\n");
			//Default case handles errors if user input is not a number from 1 to 
			//6, and redirects back to the start of the serachEntries method.
			searchEntries();
		}
	}

	// Method to search for Person object entries by first name.
	public static void firstNameSearch() {
		System.out.print("\nEnter the first name: ");
		String userIn = Index.in.next();
		// For each loop calls the "getFirstName" method from the Person class and
		// compares the returned value to user input. Matching person objects are 
		//printed to the console.
		for (Person entry : Index.phoneBookArray) {
			if (entry.getFirstName().equalsIgnoreCase(userIn)) {
				System.out.println(entry);
			}
		}
		System.out.println("***End of Search Results***");
		// Ask the user whether to continue using the phone book, and return to the
		// main menu if "Y" is entered.
		continueUsing();
	}

	// Method to search for Person object entries by last name.
	public static void lastNameSearch() {
		System.out.print("Enter the last name: ");
		String userIn = Index.in.next();
		// For each loop calls the "getLastName" method from the Person class and
		// compares the returned value to user input. Matching person objects are 
		//printed to the console.
		for (Person entry : Index.phoneBookArray) {
			if (entry.getLastName().equalsIgnoreCase(userIn)) {
				System.out.println(entry);
			}
		}
		System.out.println("***End of Search Results***");
		// Ask the user whether to continue using the phone book, and return to the
		// main menu if "Y" is entered.
		continueUsing();
	}

	// Method to search for Person object entries by telephone number.
	public static void telephoneNumberSearch() {
		System.out.print("Enter the telephone number in the following format: (123) 456-7890");
		String userIn = Index.in.next();
		// For each loop calls the "getTelephoneNumber" method from the Person class and
		// compares the returned value to user input. Matching person objects are 
		//printed to the console.
		for (Person entry : Index.phoneBookArray) {
			if (entry.getTelephoneNumber().equals(userIn)) {
				System.out.println(entry);
			}
		}
		System.out.println("***End of Search Results***");
		// Ask the user whether to continue using the phone book, and return to the
		// main menu if "Y" is entered.
		continueUsing();
	}

	// Method to search for Person object entries by city.
	public static void citySearch() {
		System.out.print("Enter the city: ");
		String userIn = Index.in.next();
		// For each loop calls the "getCity" method from the Person class and compares
		// the returned value to user input. Matching person objects are printed to the
		// console.
		for (Person entry : Index.phoneBookArray) {
			if (entry.getCity().equalsIgnoreCase(userIn)) {
				System.out.println(entry);
			}
		}
		System.out.println("***End of Search Results***");
		// Ask the user whether to continue using the phone book, and return to the
		// main menu if "Y" is entered.
		continueUsing();
	}

	// Method to search for Person object entries by state.
	public static void stateSearch() {
		System.out.print("Enter the two-letter state abbreviation. Example: FL ");
		String userIn = Index.in.next();
		// For each loop calls the "getState" method from the Person class and compares
		// the returned value to user input. Matching person objects are printed to the
		// console.
		for (Person entry : Index.phoneBookArray) {
			if (entry.getState().equalsIgnoreCase(userIn)) {
				System.out.println(entry);
			}
		}
		// Ask the user whether to continue using the phone book, and return to the
		// main menu if "Y" is entered.
		continueUsing();
	}

	public static void addEntry() {
		// Create new person object to be added to the phone book array.
		Person entry3 = new Person();

		System.out.println("\n***Add New Phone Book Entry***");

		// Collect user input and assign to the new Person object using setters.
		System.out.println("Enter first name: ");
		entry3.setFirstName(Index.in.next());

		System.out.println("Enter middle name (or \"none\"): ");
		entry3.setMiddleName(Index.in.next());

		System.out.println("Enter last name: ");
		entry3.setLastName(Index.in.next());

		System.out.println("Enter telephone number in the following format: (123) 456-7890: ");
		entry3.setTelephoneNumber(Index.in.next());

		System.out.println("Enter street address: ");
		entry3.setStreet(Index.in.next());

		System.out.println("Enter city: ");
		entry3.setCity(Index.in.next());

		System.out.println("Enter state: ");
		entry3.setState(Index.in.next());

		System.out.println("Enter zip code: ");
		entry3.setZipCode(Index.in.next());

		// Create temporary array for storing existing elements plus the new Person
		// object.
		Person[] addEntryArray = new Person[4];

		// Copy the array from the Index class into the temporary array using for loop.
		int i;
		for (i = 0; i < Index.phoneBookArray.length; i++) {
			addEntryArray[i] = Index.phoneBookArray[i];
		}
		// Copy new Person object into temporary array.
		addEntryArray[i] = entry3;
		// Copy temporary array to phone book array in the Index class.
		Index.phoneBookArray = addEntryArray;
		// Print new array and confirm it has been added to the phone book.
		System.out.println(entry3.toString() + "\n ***The entry has been added to the phone book***\n");
		// Ask the user whether to continue using the phone book, and return to the
		// main menu if "Y" is entered.
		continueUsing();
	}

	public static void updateEntry() {
		System.out.println("Select a contact to edit by choosing its number.\n");
		// Display a numbered list of Person objects for the user to select from.
		int num = 1;
		for (Object entry : Index.phoneBookArray) {
			System.out.println(num + ". " + entry);
			num++;
		}
		int contact = Index.in.nextInt();
		contact--;
		// Display a numbered list of Person object attributes for the user to select
		// from.
		System.out.println("Select a field to edit by choosing its number. \n1. First name\n2. Middle name"
				+ "\n3. Last name\n4. Telephone number\n5. Street\n6. City\n7. State\n8. Zip code");
		int field = Index.in.nextInt();

		// Switch block calls the setter method which corresponds to the user's choice
		// and allows the value to be re-assigned with user input.
		switch (field) {
		case 1:
			// Make a call to the setFirstName method in the Person class.
			System.out.println("Enter the new first name: ");
			String newFirstName = Index.in.next();
			Index.phoneBookArray[contact].setFirstName(newFirstName);
			break;
		case 2:
			// Make a call to the setMiddleName method in the Person class.
			System.out.println("Enter the new middle name: ");
			String newMiddleName = Index.in.next();
			Index.phoneBookArray[contact].setMiddleName(newMiddleName);
			break;
		case 3:
			// Make a call to the setLastName method in the Person class.
			System.out.println("Enter the new last name: ");
			String newLastName = Index.in.next();
			Index.phoneBookArray[contact].setLastName(newLastName);
			break;
		case 4:
			// Make a call to the setTelephoneNumber method in the Person class.
			System.out.println("Enter the new telephone number in the following format: (123) 456-7890 ");
			String newTel = Index.in.next();
			Index.phoneBookArray[contact].setTelephoneNumber(newTel);
			break;
		case 5:
			// Make a call to the setStreet method in the Address class.
			System.out.println("Enter the new street address: ");
			String newStreet = Index.in.next();
			Index.phoneBookArray[contact].setStreet(newStreet);
			break;
		case 6:
			// Make a call to the setCity method in the Address class.
			System.out.println("Enter the new city: ");
			String newCity = Index.in.next();
			Index.phoneBookArray[contact].setCity(newCity);
			break;
		case 7:
			// Make a call to the setState method in the Address class.
			System.out.println("Enter the new state abbreviation. Example: FL ");
			String newState = Index.in.next();
			Index.phoneBookArray[contact].setState(newState);
			break;
		case 8:
			// Make a call to the setZipCode method in the Address class.
			System.out.println("Enter the new zip code: ");
			String newZip = Index.in.next();
			Index.phoneBookArray[contact].setZipCode(newZip);
			break;
		default:
			// Handle errors if user input does not match any cases, and redirect
			// back to the start of the updateEntry method.
			System.out.println("Please choose a field number from 1 to 8.");
			updateEntry();
			break;
		}
		System.out.println(
				Index.phoneBookArray[contact].toString() + "\n" + "***The contact information has been updated***");
		// Ask the user whether to continue using the phone book, and return to the
		// main menu if "Y" is entered.
		continueUsing();
	}

	public static void deleteEntry() {
		// Prompt user to select a contact to delete.
		System.out.println("Select a contact to delete by choosing its number.\n");
		// Print a numbered list of Person objects using for each loop.
		int num = 1;
		for (Object entry : Index.phoneBookArray) {
			System.out.println(num + ". " + entry + "\n-------------------------");
			num++;
		}
		int contact = Index.in.nextInt();
		// Decrement user input to match array index position.
		contact--;
		// Print the selected contact and prompt the user to confirm intent to delete.
		System.out.println(Index.phoneBookArray[contact].toString() + 
				"\n---------------------------"
				+ "\n***Are you sure you want to delete this contact? (Y/N)***");
		String delete = Index.in.next();

		if (delete.equalsIgnoreCase("Y")) {
			Index.phoneBookArray[contact].setFirstName("null");
			// Decrement number of list items by 2 to use later for temporary object array
			// length.
			num -= 2;
		} else {
			// Ask the user whether to continue using the phone book, and return to the
			// main menu if "Y" is entered.
			mainMenu();
		}

		// Create temporary object array to store non-deleted Person objects.
		Person[] addEntryArray = new Person[num];
		// Declare loop counter variables.
		int i = 0;
		int j = 0;
		// Copy non-deleted Person objects to temporary array using for each loop.
		for (@SuppressWarnings("unused")
		Object person : Index.phoneBookArray) {
			if (Index.phoneBookArray[i].getFirstName().equals("null")) {
				i++;
			} else {
				addEntryArray[j] = Index.phoneBookArray[i];
				j++;
				i++;
			}
		}
		// Copy temporary array to Person object array in Index class.
		Index.phoneBookArray = addEntryArray;
		System.out.println("***Contact Deleted***");
		// Ask the user whether to continue using the phone book, and return to the
		// main menu if "Y" is entered.
		continueUsing();
	}
}
