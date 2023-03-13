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
public void updateContacts(String firstName) {

	int i= findByFirstName(firstName);
	if (i!=-1)
	{
		editContactDetails(contactsOfPersons[i]);
	}
	showAllContacts();

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
private void editContactDetails( Contacts contacts) {
	Contacts con = new Contacts();

	byte loopExit = 1; 
		do {
			System.out.println("Choose Option to Update :: " + '\n' + " 1.FirstName " + '\n' + " 2.LastName " + '\n' + " 3.Address "
					+ '\n' + " 4.City " + '\n' + " 5.State " + '\n' + " 6.Zip " + '\n'
							+ " 7.PhoneNumber " + '\n' + " 8.Aadhar_Number " + '\n' + " 9.Email_ID ");
			byte option = getUserInput.nextByte();

			switch(option) {
			case 1:
					System.out.println(" FirstName :: "); 
					contacts.setFirstName(getUserInput.next());
				break;
			case 2:
					System.out.println(" LastName :: ");
					contacts.setLastName(getUserInput.next());
				break;
			case 3:
					System.out.println(" PhoneNumber :: ");
					contacts.setPhoneNumber(getUserInput.nextLong());

				break;
			case 4:
				System.out.println(" Email_ID :: ");
				contacts.setEmail(getUserInput.next());
			break;
			case 5:
				System.out.println(" Address :: ");
				con.setAddress(getUserInput.next());

				break;
			case 6:
					System.out.println(" City :: ");
					contacts.setCity(getUserInput.next());
				break;
			case 7:
					System.out.println(" State :: ");
					contacts.setState(getUserInput.next());
				break;
			case 8:
					System.out.println(" Zip :: ");
					contacts.setZip(getUserInput.nextInt());
				break;



			default:
				System.out.println(" ****---- Invalid Input ----**** ");
			}
			System.out.println(" Press 1: If you want to update anything else " + '\n' + " Press 0: Exit to Menu ");
			loopExit = getUserInput.nextByte();
		}while(loopExit != 0);
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
private int findByFirstName(String firstName)
{

	for (int i=0;i<contactsOfPersons.length;i++)
	{								
		Contacts contacts= contactsOfPersons[i];
		if(null!=contacts && firstName.equalsIgnoreCase(contacts.getFirstName()))
		{
			return i;
		}
	}
	return -1;

}

public static void main(String[] args) {
	AddressBook adressBook=new AddressBook();


	byte menueChoice=0;

	do {
		System.out.println("  ::>>>Welcome Adress Book<<<::  ");
		System.out.println("1.Add New Contcat");
		System.out.println("2.View All Contacts");
		System.out.println("3.Update Contact");

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
		case 3:
			System.out.println("Enter First Name :: ");
			String firstName = getUserInput.next();
			adressBook.updateContacts(firstName);
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


