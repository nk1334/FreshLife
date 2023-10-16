package FreshLife;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC {

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
		WebElement basket=driver.findElement(By.xpath("//div[@class='AddToBasket-module_basketCount__OZfjW']"));
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
	WebElement Addtobasket=driver.findElement(By.xpath("//div[@class='AddToBasket-module_basketCount__OZfjW']"));
	Addtobasket.click();
	 List<WebElement> productList = driver.findElements(By.xpath("//div[@class='ProductCard-module_title__nQbBW Typography-module_base__h-bPx Typography-module_brandon__Es-DX Typography-module_bold__NNV5t']"));
	 
	 HashMap<String,Integer> list = new HashMap<String,Integer>();

    int vitaminCProductsAdded = 0;
for(int i=0;i < list.size() && vitaminCProductsAdded < 2; i++) {
	 WebElement product = productList.get(i);
	 String productText = product.getText();
	 if (product.getText().contains("Vitamin C")) {
		 WebElement addToBasketButton = product.findElement(By.xpath(".//button[contains(text(),'Add to Basket')]"));
	 
		 addToBasketButton.click();
		 vitaminCProductsAdded++;


	}

}}}
