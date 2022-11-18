package assignment7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicityWiat {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://leafground.com/waits.xhtml");
		driver.findElement(By.xpath("(//span[text()='Click'])[1]")).click();
		WebElement here = driver.findElement(By.xpath("//span[text()='I am here']"));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(here));
		String text = here.getText();
		System.out.println(text);
		
		driver.findElement(By.xpath("(//span[text()='Click'])[2]")).click();
		WebElement hide = driver.findElement(By.xpath("//span[text()='I am about to hide']"));
		wait.until(ExpectedConditions.invisibilityOf(hide));


		 driver.findElement(By.xpath("//span[text()='Click First Button']")).click();
		 WebElement clickable = driver.findElement(By.xpath("//span[text()='Click Second']"));
		 wait.until(ExpectedConditions.elementToBeClickable(clickable));
		 String text2 = clickable.getText();
		 System.out.println(text2);
		 
		 driver.findElement(By.xpath("(//span[text()='Click'])[3]")).click();
		 WebElement change = driver.findElement(By.xpath("//span[text()='Did you notice?']"));
		 String text3 = change.getText();
		 System.out.println(text3);
		 wait.until(ExpectedConditions.textToBePresentInElement(change, text3));
		 
		 

	}

}
