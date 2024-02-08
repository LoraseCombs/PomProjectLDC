package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class DashBoardPage {
	
	WebDriver driver;
	
	public DashBoardPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH,using = "//strong[contains(text(), 'Dashboard')]") WebElement DASHBOARD_VALLIDATION;
	@FindBy(how = How.XPATH,using = "//span[contains(text(), 'Customers')]") WebElement CUSTOMER_MENU_ELEMENT;
	@FindBy(how = How.XPATH,using = "//span[contains(text(), 'Add Customer')]") WebElement ADD_CUSTOMER_MENU_ELEMENT;
	
	public void validateDashboardPage(String dashboardValidateText) {
		
		Assert.assertEquals(DASHBOARD_VALLIDATION.getText(), dashboardValidateText, "Dashboard Page Not Found");
		
	}
	
	public void clickOnCustomer() {
		
		CUSTOMER_MENU_ELEMENT.click();
		
	}
	
	public void clickOnAddCustomer() {

		ADD_CUSTOMER_MENU_ELEMENT.click();
		
		
	}

}
