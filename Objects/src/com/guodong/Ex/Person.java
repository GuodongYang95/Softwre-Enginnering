package com.guodong.Ex;

public class Person {
	protected String name;
	
	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return  name 
				;
	}
	
	

}
