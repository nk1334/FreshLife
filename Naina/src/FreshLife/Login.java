package FreshLife;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.com.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hollandandbarrett.com");
		WebElement button=driver.findElement(By.id("onetrust-accept-btn-handler"));
		button.click();
		WebElement Rewards=driver.findElement(By.xpath("//span[text()='Rewards For Life']"));
		Rewards.click();
		WebElement Join=driver.findElement(By.linkText("Join Rewards for Life"));
		Join.click();
		WebElement SignIn=driver.findElement(By.linkText("Sign in"));
		SignIn.click();
		

		WebElement email=driver.findElement(By.name("username"));
		email.sendKeys("abcxyz@gmail.com");
		WebElement pass=driver.findElement(By.name("password"));
		pass.sendKeys("Abc123@!");

		WebElement Signin=driver.findElement(By.xpath("//button[@class='c03525a04 ca5866931 cda6ccd84 c67906ae7 cd6731ef1']"));
		Signin.click();
		
		WebElement Food=driver.findElement(By.xpath("//div[text()='Food & Drink']"));
		Food.click();
		WebElement vegan=driver.findElement(By.linkText("Snacks"));
		vegan.click();
		WebElement mix=driver.findElement(By.linkText("Chocolate, Cakes & Biscuits"));
		mix.click();
		WebElement choco=driver.findElement(By.linkText("Chocolate"));
		choco.click();
		WebElement vegcho=driver.findElement(By.xpath("//span[text()='Vegan Chocolate']"));
		vegcho.click();
		WebElement basket=driver.findElement(By.xpath("//div[text()='Add to basket']"));
		basket.click();
		
		

		WebElement Categories=driver.findElement(By.xpath("//div[text()='Vitamins & Supplements']"));
		Categories.click();
	WebElement Discover=driver.findElement(By.xpath("//button[text()='Discover the range']"));
	Discover.click();
	WebElement Showmore=driver.findElement(By.xpath("//span[text()='Show more...']"));
	Showmore.click();
	
	WebElement search=driver.findElement(By.xpath("//input[@placeholder='Search...']"));
	search.sendKeys("Vitamin C");
	search.click();
	WebElement Allproducts=driver.findElement(By.xpath("//label[@class='Checkbox-module_label__SfYmD Typography-module_base__h-bPx Typography-module_helvetica__-8F7V']"));
	Allproducts.click();
	WebElement Addtobasket=driver.findElement(By.xpath("//div[text()='Add to basket']"));
	Addtobasket.click();
	WebElement home=driver.findElement(By.xpath("//span[text()='Home']"));
	home.click();
	WebElement Join1=driver.findElement(By.xpath("//span[text()='Rewards For Life']"));
	Join1.click();
		WebElement icon=driver.findElement(By.xpath("//span[text()='Basket']"));
		icon.click();
	
		WebElement product1InBasket = driver.findElement(By.xpath("//div[contains(text(),'Vegan Chocolate')]"));
		WebElement product2InBasket = driver.findElement(By.xpath("//div[contains(text(),'Vitamin C')]"));

		if (product1InBasket != null && product2InBasket != null) {
		    System.out.println("Both products are in the basket.");
		} else {
		    System.out.println("One or both products are missing from the basket.");
		}

			




	

			
	
	}}


