package assingment2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGround4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/checkbox.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.manage().window().maximize();
driver.findElement(By.xpath("//h5[text()='Basic Checkbox']/following::div[5]")).click();
driver.findElement(By.xpath("//h5[text()='Notification']/following::div[5]")).click();
driver.findElement(By.xpath("//h5[text()='Choose your favorite language(s)']/following::div[5]")).click();
driver.findElement(By.xpath("//h5[text()='Tri State Checkbox']/following::div[3]")).click();
driver.findElement(By.xpath("//h5[text()='Toggle Switch']/following::div[3]")).click();
WebElement checkbox=driver.findElement(By.xpath("//div[contains(@id,'j_idt87:j_idt102')]"));
checkbox.isEnabled();
System.out.println(checkbox.isEnabled());
driver.findElement(By.xpath("//h5[text()='Select Multiple']/following::ul[1]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//li[@data-item-value='Paris']/div")).click();
driver.findElement(By.xpath("//li[@data-item-value='Istanbul']/div")).click();
driver.findElement(By.xpath("//li[@data-item-value='Berlin']/div")).click();
driver.findElement(By.xpath("(//ul[contains(@class,'selectcheckboxmenu')])[1]")).click();

	}

}
