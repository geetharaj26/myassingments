package assingment2day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGround2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		String title=driver.getTitle();
		System.out.println("the title is " +driver.getTitle());
		driver.navigate().back();
		WebElement button= driver.findElement(By.xpath("//h5[text()='Confirm if the button is disabled.']/following::button[1]"));
		button.isEnabled();
		System.out.println(button.isEnabled());
		WebElement buttonposition=driver.findElement(By.xpath("//h5[text()='Find the position of the Submit button']/following::button[1]"));
		buttonposition.getLocation();
		System.out.println(buttonposition.getLocation());
		WebElement color=driver.findElement(By.xpath("//h5[text()='Find the Save button color']/following::button[1]"));
		color.getCssValue("background");
		System.out.println(color.getCssValue("background") );
		WebElement heightandwidth=driver.findElement(By.xpath("//h5[text()='Find the height and width of this button']/following::button[1]"));
		heightandwidth.getSize();
		System.out.println(heightandwidth.getSize());
		WebElement colorchanged=driver.findElement(By.xpath("//h5[text()='Mouse over and confirm the color changed']/following::button[1]"));
		colorchanged.getCssValue("color");
		System.out.println(colorchanged.getCssValue("color"));
		driver.findElement(By.xpath("//span[text()='Image']")).click();
		WebElement buttons= driver.findElement(By.xpath("//h5[text()='How many rounded buttons are there?']/following::button"));
		
		

	}
 
}
