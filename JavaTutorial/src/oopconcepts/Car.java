package oopconcepts;

public class Car {
	private String color;
	private String make;
	private String model;
	private int year;
	int speed;
	int gear;
	
	//constructor
	public Car() {
		this(10,2);
		this.speed = 0;
		this.gear = 0;
		System.out.println("Executing constructor without arguments");
	}
	
	public Car(int speed, int gear) {
		this.speed = speed;
		this.gear = gear;
		System.out.println("Executing constructor with arguments");
	}
	
	public void increaseSpeed() {
		System.out.println("Increasing the speed");
	}
	
	//automatisch getters en setter => rechterklik source, create getter en setters
	public String getMake() {
		return this.make;
	}
	
	public void setMake(String make) {
		this.make = make;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if (year > 1900) {
			this.year = year;
		} else {
			System.out.println("This year is not valid");
		}
	}
}
