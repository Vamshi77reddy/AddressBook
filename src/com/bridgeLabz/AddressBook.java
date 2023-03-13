package com.bridgeLabz;

import java.util.Scanner;

public class AddressBook {

private static Contacts[] contactsOfPersons= new Contacts[15];//for array decaration
private static Scanner getUserInput= new Scanner(System.in);//for user input


public static void main(String[] args) {


 private static Contacts getContacts()
 {
	 Contacts contacts= new Contacts();
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