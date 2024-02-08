package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
		WebDriver driver;
		
	public LoginPage(WebDriver driver) {
		this.driver =driver;
		
	}
	

	
	//WebElements
//	WebElement USER_NAME_ELEMENT = driver.findElement(By.xpath("//*[@id=\"user_name\"]"));
//	By USER_NAME_FIELD = By.xpath("//*[@id=\"user_name\"]");
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"user_name\"]") WebElement USER_NAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"password\"]") WebElement PASSWORD_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"login_submit\"]") WebElement SIGNIN_BUTTON;
	
	//Related actions
	//Individual methods
	public void insertUserName(String username) {
		
		USER_NAME_ELEMENT.sendKeys(username);
	}
	
	public void insertPassword(String password) {
		
		PASSWORD_ELEMENT.sendKeys(password);
	}
	
	public void clickSinginButton() {
		
		SIGNIN_BUTTON.click();	
	}
	
	//Combined method
	public void performLogin(String username, String password) {
		
		USER_NAME_ELEMENT.sendKeys(username);
		PASSWORD_ELEMENT.sendKeys(password);
		SIGNIN_BUTTON.click();
		
	}
	


}
