package com.personal;

public class PriyaProfile implements IProfile {

	public void myBasicInfo() {
		
		System.out.println(ProfileConstants.FIRST_NAME+"Priya");
		System.out.println(ProfileConstants.LAST_NAME+"dharshini");
		System.out.println(ProfileConstants.AGE+"20");
	}

	public void myHobbies() {
		System.out.println("My hobbies are hearing song and watching movies");
		
	}

}
