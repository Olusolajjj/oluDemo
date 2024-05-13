import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendReport {
	
	ExtentReports extent;
	
	
	@BeforeMethod
	public void config() {
		
		String path = System.getProperty("user.dir")+"\\report\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Olu Automation");
		reporter.config().setDocumentTitle("first extent report");
		
	
		
		extent = new ExtentReports();
		
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Olusola");
		
	
}
	@Test
	public void getWebTittle() {
		ExtentTest test = extent.createTest("Testee");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mvnrepository.com/artifact/com.aventstack/extentreports/5.1.1");
		System.out.println(driver.getTitle());
		driver.close();
		test.fail("intentionally fail the test");
		extent.flush();
	}

}
