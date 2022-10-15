package assingment2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("(//span[@class='x-tab-strip-inner'])[2]")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys("9876543211");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		WebElement leadid=driver.findElement(By.linkText("//tr//a[@class='linktext']"));
		leadid.click();
		System.out.println(leadid.getText());
		Thread.sleep(3000);
		driver.findElement(By.linkText("Delete")).click();
	driver.findElement(By.xpath("(//span[@class='x-tab-strip-inner']/span)[1]")).click();
		
		
		
		
		
		

	}

}
