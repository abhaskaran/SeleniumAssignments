package Selenium.Assignment.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Selenium.Assignment.Assignment;
import Selenium.Assignment.Base.Base;
import Selenium.Assignment.Base.Constants;

public class TestDriver extends Base{
	
		public TestDriver(WebDriver driver) {
		super(driver);
	}
	
		public static void main(String args[]) {
			
				setDriver(Constants.url,Constants.browser);
				Assignment a = PageFactory.initElements(driver, Assignment.class);
				a.Login(Constants.USERNAME, Constants.PASSWORD);
				a.AddToCart();
		
		}


}
