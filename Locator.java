import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
public class Locator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\New Owner\\Desktop\\Automation Testing\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.automationexercise.com/");
		//driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.cssSelector("a[href='/login']")).click();
		driver.findElement(By.name("email")).sendKeys("greendelivery2023@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Omolara12");
		driver.findElement(By.cssSelector("button[data-qa='login-button']")).click();
		//System.out.println(driver.findElement(By.xpath("//p[normalize-space()='Your email or password is incorrect!']")).getText());
		Thread.sleep(1000);
		Assert.assertEquals(driver.findElement(By.xpath("//li[10]//a[1]")).getText(), "Logged in as Olusola Jinadu");
		

	}

}
