package assingment2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("(//div[@class='x-form-element']/input[@name='firstName'])[3]")).sendKeys("geetha");
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(@class,'x-grid3-cell')]/a")).click();
		String title=driver.getTitle();
		System.out.println("title of the page " +title);
		driver.findElement(By.xpath("//div[@class='frameSectionExtra']/a[3]")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		Thread.sleep(3000);
		WebElement newcompanyname=driver.findElement(By.id("updateLeadForm_companyName"));
		newcompanyname.sendKeys("leaf test");
		System.out.println(newcompanyname.getAttribute("value"));
		driver.findElement(By.name("submitButton")).click();
		driver.close();
		
		
		
		
		

	}

}
