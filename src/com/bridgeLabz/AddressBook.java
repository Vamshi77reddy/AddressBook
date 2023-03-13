package com.bridgeLabz;

import java.util.Scanner;

public class AddressBook {

private static Contacts[] contactsOfPersons= new Contacts[15];//for array decaration
private static Scanner getUserInput= new Scanner(System.in);//for user input
public int createContact(Contacts contacts) 
{
	System.out.println("List Of Files");
	System.out.println(contacts);
	int index = getIndexFornextEmptyLocation();
	System.out.println("Index :: "+index);
	contactsOfPersons[index]=contacts;
	return index;
}

private int getIndexFornextEmptyLocation()
{
	for (int i=0;i<contactsOfPersons.length;i++)
	{								
		if (null==contactsOfPersons[i])
		{
			return i;
		}
	}
	return 0;
}

public void showAllContacts() {

	System.out.println("Showing contacts details");

	for (int i=0;i<contactsOfPersons.length;i++)
	{								
		showContactDetails(contactsOfPersons[i]); 
	}
}
private void showContactDetails(Contacts contacts)
{
	if(contacts != null) 
	{
	System.out.println(">>>>>Contact Details<<<<<");
	System.out.println("First Name = "+contacts.getFirstName());
	System.out.println("Last Name = "+contacts.getLastName());
	System.out.println("Phone Number = "+contacts.getPhoneNumber());
	System.out.println("Email Id = "+contacts.getEmail());
	System.out.println("Adress = "+contacts.getAddress());
	System.out.println("City = "+contacts.getCity());
	System.out.println("State = "+contacts.getState());
	System.out.println("ZipCode = "+contacts.getZip());

	}
}

public static void main(String[] args) {
	AddressBook adressBook=new AddressBook();


	byte menueChoice=0;

	do {
		System.out.println("  ::>>>Adress Book<<<::  ");
		System.out.println("1.Add New Contcat");
		System.out.println("2.View All Contacts");
		byte userChoice=getUserInput.nextByte();
		switch (userChoice) 
		{ 
		case 1:
			System.out.println("Creating Contact...");
			Contacts contacts=getContacts();
			int index1=adressBook.createContact(contacts);
			System.out.println("contacts id :: "+index1);
			break;
		case 2:
			adressBook.showAllContacts();
			break;
		default:
			System.out.println("Invalid Choice");
		}
		System.out.println("Press 1 to continue "+'\n'+"Press any number to exit");
		menueChoice=getUserInput.nextByte();


	} while (menueChoice==1);


}

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


