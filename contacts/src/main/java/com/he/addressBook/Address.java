package com.he.addressBook;


public class Address {

	private String label;
	
	private String address;
	
	public Address(String label) throws Exception{
		setLabel(label);
	}
	public Address(String label, String address) throws Exception {
		setLabel(label);
		this.address = address;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) throws Exception {
		if(UtilService.isValidParam(label))
			this.label = label;
		else
			throw new Exception("Invalid label paased for Address name");
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Address [label=" + label + ", address=" + address + "]";
	}
	
}
