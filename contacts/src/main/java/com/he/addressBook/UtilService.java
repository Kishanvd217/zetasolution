package com.he.addressBook;

public class UtilService {
	public static boolean isValidParam(String name) {
		if (((name != null) && (!name.trim().equals("")) && (name.chars().allMatch(Character::isLetter))))
			if (name.length() < 256)
				return true;
		return false;
	}
	
	//matches("[0-9]+")
	public static boolean isValidPhNo(String name) {
		if (name != null && name.length() == 10 && name.chars().allMatch(Character::isDigit))
			return true;
		return false;
	}
}
