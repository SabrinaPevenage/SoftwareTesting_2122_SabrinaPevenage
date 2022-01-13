package testclasses;

import org.testng.annotations.Test;
import appcode.SomeClassToTest;

public class TestNG_TestAnnotation {
	
	@Test
	public void testMethod1() {
		SomeClassToTest obj = new SomeClassToTest();
		int result = obj.sumNumbers(1, 2);
		System.out.println("Running Test -> tesMethod1");
	}
	
	@Test
	public void testMethod2() {
		System.out.println("Running Test -> tesMethod2");
	}
	
	@Test
	public void testMethod3() {
		System.out.println("Running Test -> tesMethod3");
	}
}
