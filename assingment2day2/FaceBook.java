package assingment2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'Create ')]")).click();
		driver.findElement(By.name("firstname")).sendKeys("geetha");
		driver.findElement(By.name("lastname")).sendKeys("raj");
		driver.findElement(By.xpath("//input[contains(@name,'reg')]")).sendKeys("9944284910");
		driver.findElement(By.id("password_step_input")).sendKeys("geetha26");
		WebElement day=driver.findElement(By.id("day"));
		Select opt1=new Select(day);
	opt1.selectByIndex(25);
	WebElement month=driver.findElement(By.id("month"));
	Select opt2=new Select(month);
	opt2.selectByVisibleText("Mar");
	WebElement year=driver.findElement(By.id("year"));
	Select opt3=new Select(year);
	opt3.selectByIndex(26);
	driver.findElement(By.xpath("//label[text()='Female']")).click();
	
		
		
		

	}

}
