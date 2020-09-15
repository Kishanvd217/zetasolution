package com.he.addressBook;

import java.util.ArrayList;
import java.util.List;


public class Contact {

    private String            name;
    private String            organisation;
    private List<PhoneNumber> phoneNumbers;
    private List<Address>     addresses;

    public Contact(String name, String organisation) throws Exception {
    	if(UtilService.isValidParam(name))
			this.name = name;
    	else
    		throw new Exception("Invalid name");
    	
    	if(organisation.length() < 255)
			this.organisation = organisation;
    	else
    		throw new Exception("Invalid name");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
    	if(UtilService.isValidParam(name))
			this.name = name;
    }

    public String getOrganisation() {
        return organisation;
    }

    public void setOrganisation(String organisation) {
    	if(organisation.length() < 255)
			this.organisation = organisation;
    }

    public List<PhoneNumber> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public void addPhoneNumber(PhoneNumber phoneNumber) {
        if (this.phoneNumbers == null) {
            this.phoneNumbers = new ArrayList<>();
        }
        this.phoneNumbers.add(phoneNumber);

    }

    public void addAddress(Address address) {
        if (this.addresses == null) {
            this.addresses = new ArrayList<>();
        }
        this.addresses.add(address);
    }

	@Override
	public String toString() {
		return "Contact [name=" + name + ", organisation=" + organisation + ", phoneNumbers=" + phoneNumbers
				+ ", addresses=" + addresses + "]";
	}
    
}