package assingnment4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGround {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/window.xhtml");
		System.out.println(driver);
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		driver.findElement(By.xpath("//h5[text()='Find the number of opened tabs']/following::span[1]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles.size());
		
		List<String>window=new ArrayList<String>(windowHandles);
		
		
		driver.switchTo().window(window.get(1));
		driver.close();
		driver.switchTo().window(window.get(2));
		driver.close();
		driver.switchTo().window(window.get(0));
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//span[text()='Close Windows']")).click();
	Set<String> windowHandles2 = driver.getWindowHandles();
	System.out.println(windowHandles2.size());
	List<String>windows=new ArrayList<String>(windowHandles2);
		for(String newwindows:windowHandles2) {
	
			driver.switchTo().window(windows.get(1));
				driver.close();
				driver.switchTo().window(windows.get(2));
				driver.close();
				driver.switchTo().window(windows.get(3));
				driver.close();
				
			
		}
			
		

	}

}
