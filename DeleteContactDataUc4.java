package com.bridgelabz.addressbook;

import java.util.Scanner;

public class DeleteContactDataUc4 extends CreateNewContactUc2 {

	static Scanner s = new Scanner(System.in);

	public void deleteData() {

		System.out.println("\nEnter first name to delete : ");
		String searchName = s.next();
		for(int i = 0 ; i < contactBook.size() ; i++) {
			if(contactBook.get(i).getFirstName().equals(searchName)) {
				contactBook.remove(contactBook);
				System.out.println("Deleted the person details");
			}
			else
				System.out.println("Person Details not deleted");
		}
	}

	public static void main(String[] args) {

		DeleteContactDataUc4 deleteContact = new DeleteContactDataUc4();			

		EditContactUc3 editContact = new EditContactUc3();			
		editContact.createNewData();
		editContact.displayContacts();
		editContact.editData();
		editContact.displayContacts();
		deleteContact.deleteData();


	}
}
