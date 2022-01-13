package testclasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class TestNG_BeforeClassAnnotations {
	
	@BeforeClass
	public void setUp() {
		System.out.println("\n This runs before class");
	}
	
	@AfterClass
	public void cleanUp() {
		System.out.println("\n This runs after class");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("\n This runs before every method");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("\n This runs after every method");
	}
	
	@Test
	public void TestMethod1() {
		System.out.println("\nRunning Test -> testMethod1");
	}
	
	@Test
	public void TestMethod2() {
		System.out.println("\nRunning Test -> testMethod2");
	}
}
