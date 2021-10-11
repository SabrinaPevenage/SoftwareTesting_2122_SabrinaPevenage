package oopconcepts;

public class ClassDemo {

	public static void main(String[] args) {
		Car bmw = new Car();
		bmw.setMake("BMW");
		System.out.println("Make of BMW is:" +bmw.getMake());
		
		System.out.println("Model of BMW is: " + bmw.getModel());
		
		Car benz = new Car();
		benz.setMake("Benz");
		System.out.println("Make of benz is: " + benz.getMake());
		
		benz.setModel("c300");
		System.out.println("Model of benz is: " + benz.getModel());
		
		benz.setYear(1800);
		System.out.println("Year of benz is: " + benz.getYear());
	}

}
