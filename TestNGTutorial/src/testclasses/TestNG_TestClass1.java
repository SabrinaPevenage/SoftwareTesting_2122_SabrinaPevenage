package testclasses;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestNG_TestClass1 {
	@BeforeClass
	public void setUp() {
		System.out.println("\n TestNG_TestClass1 -> before class");
	}
	
	@AfterClass
	public void cleanUp() {
		System.out.println("\n TestNG_TestClass1 -> after class");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("\n TestNG_TestClass1 -> before method");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("\n TestNG_TestClass1 -> after method");
	}
	
	@Test
	public void TestMethod1() {
		System.out.println("\n TestNG_TestClass1 -> testMethod1");
	}
	
	@Test
	public void TestMethod2() {
		System.out.println("\n TestNG_TestClass1 -> testMethod2");
	}
}
