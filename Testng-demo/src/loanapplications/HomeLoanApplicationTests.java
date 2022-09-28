package loanapplications;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomeLoanApplicationTests {
	@BeforeTest
	public void setupTestData() {
		System.out.println("Setting up Test Data");
	}
	
	@AfterTest
	public void cleanupTestData() {
		System.out.println("Cleaning up Test Data");
	}
	@BeforeMethod
	public void dosomething() {
		System.out.println("I am BeforeMethod");
	}
	
	@BeforeSuite
	public void startDatabase() {
		System.out.println("Annotations!!");
	}
	
	@Test(groups= {"Smoke"})
	public void HomeLoanLoginWeb() {
		System.out.println("Home loan application - web login test");
	}
	
	@Test
	public void HomeLoanLoginMobile() {
		System.out.println("Home loan application - mobile login test");
	}
	
	@Test
	public void HomeLoanLoginAPI() {
		System.out.println("Home loan application - API login test");
	}

}
