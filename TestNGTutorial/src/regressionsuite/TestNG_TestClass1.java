package regressionsuite;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseTestSuite;

public class TestNG_TestClass1 extends BaseTestSuite {
	@BeforeClass
	public void setUp() {
		System.out.println("\n TestNG_TestClass1 -> This runs before class");
	}
	
	@AfterClass
	public void cleanUp() {
		System.out.println("\n TestNG_TestClass1 -> This runs after class");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("\n TestNG_TestClass1 -> This runs before every method");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("\n TestNG_TestClass1 -> This runs after every method");
	}
	
	@Test
	public void TestMethod1() {
		System.out.println("\nRunning Test -> TestNG_TestClass1 -> testMethod1");
	}
	
	@Test
	public void TestMethod2() {
		System.out.println("\nRunning Test -> TestNG_TestClass1 -> testMethod2");
	}
}
