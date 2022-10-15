package assingment2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGround3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.manage().window().maximize();
		WebElement tool=driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		Select option=new Select(tool);
		option.selectByVisibleText("Selenium");
		driver.findElement(By.xpath("//label[contains(@id,'country_label')]")).click();
		driver.findElement(By.xpath("//li[@data-label='India']")).click();
		Thread.sleep(3000);
	driver.findElement(By.xpath("//label[contains(@id,'city_label')]")).click();
	driver.findElement(By.xpath("//li[text()='Chennai']")).click();
	driver.findElement(By.xpath("//button[@aria-label='Show Options']")).click();
	driver.findElement(By.xpath("//li[@data-item-label='Selenium WebDriver']")).click();
	driver.findElement(By.xpath("//label[text()='Select Language']")).click();
	driver.findElement(By.xpath("//li[@data-label='English']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//label[text()='Select Values']")).click();
	driver.findElement(By.xpath("//li[text()='Two']")).click();
	
		

	}

}
