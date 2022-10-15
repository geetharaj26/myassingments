package assingment2day2;

import java.awt.List;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGround5 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/link.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.manage().window().maximize();
		WebElement dashboard=driver.findElement(By.xpath("(//a[text()='Go to Dashboard'])[1]"));
		dashboard.click();
		driver.navigate().back();
		WebElement finddestination=driver.findElement(By.xpath("//a[text()='Find the URL without clicking me.']"));
		finddestination.getAttribute("href");
		System.out.println(finddestination.getAttribute("href"));
		driver.findElement(By.linkText("Broken?")).click();
		String Title=driver.getTitle();
		if(Title.contains("Error")) {
			System.out.println("brokenlink");
		}else {
			System.out.println("link is not broken");
		}
		driver.navigate().back();
		driver.findElement(By.xpath("//a[text()='Go to Dashboard']")).click();
		driver.navigate().back();
		
		

	}

}
