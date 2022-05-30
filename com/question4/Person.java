package com.question4;

class Address {

	
	private String city;
	private String state;
	private String pinCode;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	
}


public class Person {

	String name;
	String gender;
	Address add =new Address();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(String city, String state,String pin) {
		Address add =new Address();
		add.setCity(city);
		add.setState(state);
		add.setPinCode(pin);
		
	}
    
	
}
