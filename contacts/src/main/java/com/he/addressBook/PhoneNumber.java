package com.he.addressBook;


public class PhoneNumber {
    private String label;
    
    private String phoneNumber;

    public PhoneNumber(String label, String phoneNumber) throws Exception {
    	setLabel(label);
    	setPhoneNumber(phoneNumber);
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) throws Exception {
    	if (UtilService.isValidParam(label))
			this.label = label;
		else {
			throw new Exception("Invalid label is passed for phone number");
		}
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) throws Exception {
    	if (UtilService.isValidPhNo(phoneNumber))
			this.phoneNumber = phoneNumber;
		else {
			throw new Exception("Invalid phone number is passed");
		}
    }

	@Override
	public String toString() {
		return "PhoneNumber [label=" + label + ", phoneNumber=" + phoneNumber + "]";
	}
}
