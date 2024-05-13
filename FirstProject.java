import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class FirstProject {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
		WebDriver driver = new ChromeDriver();
		//FirstProject password = new FirstProject();
		//String PasswordReturn = password.UseDisTempPassword(driver);
		
		//password.UseDisTempPassword(password);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		String pass2 = UseDisTempPassword(driver);
		String name = "JINADU";

		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.xpath("//a[normalize-space()='Forgot your password?']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector(".go-to-login-btn")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys(name);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(pass2);
		
		
		driver.findElement(By.cssSelector("#chkboxOne")).click();
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		Thread.sleep(2000);
		
		//System.out.println(driver.findElement(By.xpath("//h2[normalize-space()='Hello JINADU,']")).getText());
		Assert.assertEquals(driver.findElement(By.xpath("//h2[normalize-space()='Hello JINADU,']")).getText(), "Hello "+name+",");
		
		//driver.findElement(By.cssSelector(".infoMsg")).getText()
		


	}
	
	public static String UseDisTempPassword(WebDriver driver) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.xpath("//a[normalize-space()='Forgot your password?']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		Thread.sleep(2000);
		String pass = driver.findElement(By.cssSelector(".infoMsg")).getText();
		//Please use temporary password 'rahulshettyacademy' to Login.
		String[] pass1= pass.split("'");
		String pass2 = pass1[1].split("'")[0];
		return pass2;
		
	}

}
