package com.java.objects;


class Person {
	
	String name;
	int age;

	
	void setDetails(String name, int age) {
		this.name = name; 
		this.age = age;
	}

	
	void displayDetails() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
}


class AccessPerson {
	public static void main(String[] args) {
		
		Person person = new Person();

		person.setDetails("Shiva", 25);

		person.displayDetails();
	}
}
