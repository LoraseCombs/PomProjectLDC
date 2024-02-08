package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashBoardPage;
import page.LoginPage;
import page.NewCustomerPage;
import util.BrowserFactory;

public class NewCustomerTest {
	
	WebDriver driver;
	
	String userName = "demo@codefios.com";
	String password = "abc123";
	String dasboardValidationText = "Dashboard";
	String newCustomerText = "New Customer";
	String fullname = "Selenium";
	String company = "Techfios";
	
	@Test
	public void userShouldBeAbleToAddNewCustomer() {
		
		driver = BrowserFactory.init();
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.performLogin(userName, password);
		
		DashBoardPage dashboardPage = PageFactory.initElements(driver, DashBoardPage.class);
		dashboardPage.validateDashboardPage(dasboardValidationText);
		dashboardPage.clickOnCustomer();
		dashboardPage.clickOnAddCustomer();
		
		NewCustomerPage newCustomerPage = PageFactory.initElements(driver, NewCustomerPage.class);
		newCustomerPage.validateNewCustomerPage(newCustomerText);
		newCustomerPage.insertFullName(fullname);
		newCustomerPage.selectCompany(company);
		
	}

}
