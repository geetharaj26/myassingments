package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("geetha");
	    driver.findElement(By.id("lastNameField")).sendKeys("rajendran");
	    driver.findElement(By.name("submitButton")).sendKeys("Create Contact");
	    String name=driver.findElement(By.id("viewContact_firstName_sp")).getText();
	    System.out.println("the first name is " +driver.findElement(By.id("viewContact_firstName_sp")).getText());
			String title=driver.getTitle();
		System.out.println("the tittle is " +driver.getTitle());
		driver.close();


	}

}
