package servicenow1;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass1 {
	public ChromeDriver driver;
	public String filename;
	public int sheetindex;

	@Parameters ({"url","username","pwd"})
	@BeforeMethod
	public void preConditionMethod(String url,String username, String pwd) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println(Thread.currentThread().getId());
		driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
	}
	@DataProvider
	public String[][]sendData() throws IOException{
		return ReadExcelServiceNow.readData(filename, sheetindex);
	}
	
	
	@AfterMethod
	public void postConditionMethod() {
		driver.close();
}

}
