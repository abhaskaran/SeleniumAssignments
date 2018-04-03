package Selenium.Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Selenium.Assignment.Base.Base;
import Selenium.Assignment.Base.Constants;

public class Assignment extends Base{
	
	@FindBy(xpath = Constants.signIn)
	public WebElement signIn;
	
	@FindBy(xpath = Constants.continue_btn)
	public WebElement continueBtn;
	
	@FindBy(xpath = Constants.user)
	public WebElement user;
	
	@FindBy(xpath = Constants.password)
	public WebElement password;

	@FindBy(xpath = Constants.submit)
	public WebElement submit;
	
	@FindBy(xpath = Constants.search)
	public WebElement search;
	
	@FindBy(xpath = Constants.GoKey)
	public WebElement GoKey;
	
	@FindBy(xpath = Constants.Books)
	public List<WebElement> Books;
	
	@FindBy(xpath = Constants.addToCart)
	public WebElement addToCart;
	
	@FindBy(xpath = Constants.cartAnnounce)
	public WebElement cartAnnounce;
	
	@FindBy(xpath = Constants.qty)
	public WebElement qty;
	
	@FindBy(xpath = Constants.price)
	public List<WebElement> price;
	
	@FindBy(xpath = Constants.bookName)
	public WebElement bookName;
	
	@FindBy(xpath = Constants.bookCreator)
	public WebElement bookCreator;
	
	@FindBy(xpath = Constants.bookImg)
	public List<WebElement> bookImg;
	
	@FindBy(xpath = Constants.bookTitle)
	public List<WebElement> bookTitle;
	
	public Assignment(WebDriver driver) {
		super(driver);
	}
	
	public void Login(String usr, String pwd) {
		signIn.click();
		user.sendKeys(usr);
		continueBtn.click();
		password.sendKeys(pwd);
		submit.click();
	}
	
	public void Search(String text) {
		search.sendKeys(text);
		GoKey.click();
	}
	
	@SuppressWarnings("unlikely-arg-type")
	public void SelectBook() {
		// iterate through the list of books and select the last book in the page
		int s = bookTitle.size();
		for(int i= 0; i < bookTitle.size() ;i++) {
			String xxx = bookTitle.get(i).getText();
			System.out.println(xxx);
				if(i==(bookTitle.size()-1)) {	
					//String y = bookTitle.get(i).getText();
					//System.out.println(y);
					bookTitle.get(i).click();
					break;
				}
			}
}
	
	public void AddToCart() {
		Search(Constants.text);
		SelectBook();
		cartAnnounce.click();
		//cartAnnounce.click();
		String quantity = qty.getText();
		int q = Integer.parseInt(quantity);
		System.out.println("The quantity of books in cart is = "+q);
			for(int j=1; j<= price.size();j++) {
				String pr = price.get(j).getText();
				int p = Integer.parseInt(pr);
				System.out.println("The price of the book is = "+p);
	
		}
		String bName = bookName.getText();
		System.out.println("Name of the book is "+bName);
		String bCreator = bookCreator.getText();
		System.out.println("Creator of the book is "+bCreator);
	}
}
