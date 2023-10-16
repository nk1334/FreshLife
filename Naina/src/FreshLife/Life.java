package FreshLife;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Life {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.com.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hollandandbarrett.com");
		WebElement Alert=driver.findElement(By.id("onetrust-accept-btn-handler"));
		Alert.click();
		WebElement RewardsforLife=driver.findElement(By.xpath("//span[text()='Rewards For Life']"));
		RewardsforLife.click();
		WebElement Link=driver.findElement(By.linkText("Join Rewards for Life"));
		Link.click();
		WebElement name=driver.findElement(By.name("firstName"));
		name.sendKeys("abc");
		WebElement Lastname=driver.findElement(By.name("lastName"));
		Lastname.sendKeys("xyz");
		WebElement email=driver.findElement(By.name("email"));
		email.sendKeys("abcxyz@gmail.com");
		WebElement confirmemail=driver.findElement(By.id("confirmEmail"));
		confirmemail.sendKeys("abcxyz@gmail.com");
		WebElement pass=driver.findElement(By.name("password"));
		pass.sendKeys("Abc123@!");
		WebElement button=driver.findElement(By.xpath("//span[text()='Email me about ']"));
		button.click();
		WebElement clickbutton=driver.findElement(By.xpath("//span[text()='I agree to the Rewards for Life and website ']"));
		clickbutton.click();
		WebElement Submit=driver.findElement(By.xpath("//span[text()='Create an account']"));
		Submit.click();
		WebElement SignIn=driver.findElement(By.linkText("Sign in"));
		SignIn.click();
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("abcxyz@gmail.com");
		WebElement pswd=driver.findElement(By.name("password"));
		pswd.sendKeys("Abc123@!");
		WebElement Signin=driver.findElement(By.xpath("//button[text()='Sign In']"));
		Signin.click();
	}

}

	

