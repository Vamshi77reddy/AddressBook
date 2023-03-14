package com.bridgeLabz;

import java.util.Scanner;

public class AddressBookMain {
	private static Scanner getUserInput= new Scanner(System.in);//for user input

	public static void main(String[] args) {
		AddressBook adressBook=new AddressBook();


		byte menueChoice=0;

		do {
			System.out.println("  ::>>>Welcome AdressBook<<<::  ");
			System.out.println("  Multiple Contacts in AdressBook  ");

			System.out.println("1.Add New Contcat");
			System.out.println("2.View All Contacts");
			System.out.println("3.Update Contact");
			System.out.println("4.Delete Contact");


			byte userChoice=getUserInput.nextByte();
			switch (userChoice) 
			{ 
			case 1:
				System.out.println("Creating Contact...");
				Contact contacts=getContacts();
				int index1=adressBook.createContact(contacts);
				System.out.println("contacts id :: "+index1);
				break;
			case 2:
				adressBook.showAllContacts();
				break;
			case 3:
				System.out.println("Enter First Name :: ");
				String firstName = getUserInput.next();
				adressBook.updateContacts(firstName);
				break;
			case 4:
				 System.out.println("Enter the first name of details you want to delete");
				 String firstName1=getUserInput.next();
				 adressBook.deleteContacts(firstName1);

				break;
			default:
				System.out.println("Invalid Choice");
			}
			System.out.println("Press 1 to continue "+'\n'+"Press any number to exit");
			menueChoice=getUserInput.nextByte();


		} while (menueChoice==1);

	}
	

	 private static Contact getContacts()
	 
	 {
		 Contact contacts= new Contact();
		 System.out.println("Enter First Name");
		 String firstName =getUserInput.next();
		 contacts.setFirstName(firstName);

		 System.out.println("Enter Last Name");
		 String lastName =getUserInput.next();
		 contacts.setLastName(lastName);

		 System.out.println("Enter PhoneNumber");
		 long phoneNumber =getUserInput.nextLong();
		 contacts.setPhoneNumber(phoneNumber);

		 System.out.println("Enter EmailId");
		 String email =getUserInput.next();
		 contacts.setEmail(email);

		 System.out.println("Enter Adress");
		 String adress =getUserInput.next();
		 contacts.setAddress(adress);

		 System.out.println("Enter City");
		 String city =getUserInput.next();
		 contacts.setCity(city);

		 System.out.println("Enter State");
		 String state =getUserInput.next();
		 contacts.setState(state);

		 System.out.println("Enter Zipcode");
		 int zip =getUserInput.nextInt();
		 contacts.setZip(zip);
	 

		 return contacts;

	 
	}
}
