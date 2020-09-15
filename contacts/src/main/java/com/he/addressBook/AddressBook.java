package com.he.addressBook;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;




public class AddressBook {
	private  List<Contact> addressBook = null;
	
    public AddressBook() {
    	 addressBook = new LinkedList<>();
    }

    public void addContact(Contact contact) throws Exception {
    	long in = addressBook.stream()
				.filter(e -> e.getName().toLowerCase().equals(contact.getName().toLowerCase())).count();

		if (in == 0) {
			addressBook.add(contact);
			return;
		}
		throw new Exception("Input already exists");
    }

    public void deleteContact(String name) throws Exception {
    	for (Contact c : addressBook) {
			if (c.getName().toLowerCase().equals(name.toLowerCase())) {
				addressBook.remove(c);
				return;
			}
		}
		throw new Exception("Unable to find the contact " + name);
	
    }

    public void updateContact(String name, Contact contact) throws Exception {
    	for (Contact c : addressBook) {
			if (c.getName().toLowerCase().equals(contact.getName().toLowerCase())) {
				if (contact.getName().equals(name.toLowerCase())) {
					addressBook.remove(c);
					addressBook.add(contact);
					return;
				} else {
					throw new Exception("Another contact with new name exists");
				}
			}
		}

		for (Contact c : addressBook) {
			if (c.getName().toLowerCase().equals(name.toLowerCase())) {
				addressBook.remove(c);
				addressBook.add(contact);
				return;
			}
		}
		throw new Exception("Unable to find the contact " + name);
    }

    public List<Contact> searchByName(String name) {
    	if (name != null) {
			if (name.isEmpty()) {
				return addressBook;
			}
			return addressBook.stream()
					.filter(e -> e.getName().toLowerCase().startsWith(name.toLowerCase())).collect(Collectors.toList());
		}
		return null;
    }

    public List<Contact> searchByOrganisation(String organisation) {
    	if (organisation != null) {
			if (organisation.isEmpty()) {
				return addressBook;
			}
			return addressBook.stream()
					.filter(e -> e.getOrganisation().toLowerCase().startsWith(organisation.toLowerCase()))
					.collect(Collectors.toList());
		}
		return null;
    }

}