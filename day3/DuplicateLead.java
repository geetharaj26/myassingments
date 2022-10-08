package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("geetha");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("rajendran");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("r");
		driver.findElement(By.id("createLeadForm_industryEnumId")).sendKeys("Health Care");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("to enhance quality of life by enhancing health");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("rmbg.rg@gmail.com");
		driver.findElement(By.name("submitButton")).sendKeys("Create Lead");
		String title=driver.getTitle();
		System.out.println("the tittle is " +driver.getTitle());
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("trigon");
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("shajeth");
		driver.findElement(By.name("submitButton")).sendKeys("Create Lead");
		String title1=driver.getTitle();
		System.out.println("the tittle is " +driver.getTitle());
		


	}

}
