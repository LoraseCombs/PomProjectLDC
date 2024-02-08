package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashBoardPage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {
	
	//create object
	//by the name of the class
	
	WebDriver driver;
	
	String userName = "demo@codefios.com";
	String password = "abc123";
	String dasboardValidationText = "Dashboard";
	
	@Test
	public void validUserShouldBeAbleToLogin() {
		
		driver = BrowserFactory.init();
		
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.insertUserName("username");
		loginPage.insertPassword(password);
		loginPage.clickSinginButton();
		
		DashBoardPage dashboardPage = PageFactory.initElements(driver, DashBoardPage.class);
		dashboardPage.validateDashboardPage(dasboardValidationText);
		
		BrowserFactory.tearDown();
		
	}

}
