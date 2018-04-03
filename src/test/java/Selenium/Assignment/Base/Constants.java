package Selenium.Assignment.Base;

public class Constants {
	
	//url
	public static final String url = "https://www.amazon.in/";
	public static final String browser = "Chrome";
	public static final String USERNAME = "7.ashwini@gmail.com";
	public static final String PASSWORD = "Welcome123$";
	public static final String text = "robin sharma";	
	
	//xpath
	public static final String signIn = "//div[@id='nav-tools']/a/span[contains(text(),'Sign in')]";
	public static final String user = "//input[@type='email']";
	public static final String continue_btn = "//input[@id='continue']";
	public static final String password = "//input[@type='password']";
	public static final String submit = "//input[@id='signInSubmit']";
	public static final String search = "//input[@id='twotabsearchtextbox']";
	public static final String GoKey = "//input[@value='Go']";
	public static final String Books = "//li[@class='s-result-item celwidget  ']";
	public static final String addToCart = "//input[@id='add-to-cart-button']";
	public static final String cartAnnounce = "//a[@id = 'hlb-view-cart-announce']";
	public static final String qty = "//span[@class='a-dropdown-prompt']";
	public static final String price = "//div[@class='a-column a-span2 a-text-left']/p/span";
	public static final String bookName = "//span[@class='a-size-medium sc-product-title a-text-bold']";
	public static final String bookCreator = "//span[@class='a-size-base sc-product-creator']";
	public static final String bookImg = "//div[@class='a-row']/div/a/img";
	public static final String bookTitle = "//div[@class='a-row a-spacing-none']/a/h2";
	
}
