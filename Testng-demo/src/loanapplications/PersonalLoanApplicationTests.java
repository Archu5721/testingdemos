package loanapplications;

import org.testng.annotations.Test;

public class PersonalLoanApplicationTests {
	
	@Test(groups= {"Smoke"})
	public void PersonalLoanLoginWeb() {
		System.out.println("Personal loan application - web login test");
	}
	
	@Test(groups= {"Smoke"})
	public void PersonalLoanLoginMobile() {
		System.out.println("Personal loan application - mobile login test");
	}
	
	@Test(groups= {"Smoke"})
	public void PersonalLoanLoginAPI() {
		System.out.println("Personal loan application - API login test");
	}

}
