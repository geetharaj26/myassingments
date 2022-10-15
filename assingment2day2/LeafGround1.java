package assingment2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGround1 {

	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.leafground.com/input.xhtml;jsessionid=node0tmb2389go0xlxjvuy66xu9p668024.node0");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
	driver.manage().window().maximize();
	driver.findElement(By.xpath("(//div[@class='col-12']/input)[1]")).clear();
	driver.findElement(By.xpath("(//div[@class='col-12']/input)[1]")).sendKeys("geetha");
	driver.findElement(By.xpath("(//div[@class='col-12']/input)[2]")).clear();
	driver.findElement(By.xpath("(//div[@class='col-12']/input)[2]")).sendKeys("madurai");
WebElement textbox =driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt93\"]"));
textbox.isEnabled();
System.out.println(textbox.isEnabled());
driver.findElement(By.xpath("(//div[@class='col-12']/input)[4]")).clear();
WebElement retrievetext=driver.findElement(By.xpath("//h5[text()='Retrieve the typed text.']/following::input[1]"));
retrievetext.getAttribute("value");
System.out.println(retrievetext.getAttribute("value"));
driver.findElement(By.xpath("//h5[contains(text(),'Type email')]/following::input[1]")).sendKeys("rmbg.rg@gmail.com",Keys.TAB);
driver.findElement(By.xpath("//h5[text()='Type about yourself']/following::textarea")).sendKeys("iam geetha rajendran completed BE");
driver.findElement(By.xpath("//span[@aria-controls='ql-picker-options-0']")).click();
driver.findElement(By.xpath("//span[@id='ql-picker-options-0']/span[@data-value='monospace']")).click();
driver.findElement(By.xpath("//span[@aria-controls='ql-picker-options-1']")).click();
driver.findElement(By.xpath("//span[@data-value='large']")).click();
driver.findElement(By.xpath("//button[@class='ql-bold'][1]")).click();
driver.findElement(By.xpath("(//button[@class='ql-italic'])[1]")).click();
driver.findElement(By.xpath("(//button[@class='ql-underline'])[1]")).click();
driver.findElement(By.xpath("(//button[@class='ql-strike'])[1]")).click();
driver.findElement(By.xpath("//span[@aria-controls='ql-picker-options-2']")).click();
driver.findElement(By.xpath("//span[@id='ql-picker-options-2']/span[@data-value='#0066cc']")).click();
driver.findElement(By.xpath("//span[@aria-controls='ql-picker-options-3']")).click();
driver.findElement(By.xpath("//span[@id='ql-picker-options-3']/span[@data-value='#ffff00']")).click();
driver.findElement(By.xpath("//button[@class='ql-script']")).click();
driver.findElement(By.xpath("//button[@class='ql-header'][1]")).click();
driver.findElement(By.xpath("//span[@aria-controls='ql-picker-options-4']")).click();
driver.findElement(By.xpath("//span[@data-value='center']")).click();
driver.findElement(By.xpath("//h1[@class='ql-align-center']")).sendKeys("all the best");
Thread.sleep(2000);
driver.findElement(By.xpath("//h5[text()='Just Press Enter and confirm error message*']//following::input[contains(@id,'thisform')]")).sendKeys(Keys.ENTER);
WebElement errormessage=driver.findElement(By.xpath("//div[@aria-live='polite']//span[@class='ui-message-error-detail']"));
errormessage.getText();
System.out.println(errormessage.getText());
WebElement label=driver.findElement(By.xpath("//label[text()='Username']"));
label.getLocation();
driver.findElement(By.xpath("//label[text()='Username']/preceding-sibling::input")).click();
WebElement label1=driver.findElement(By.xpath("//label[text()='Username']"));
label1.getLocation();
if(label1!=label1) {
	System.out.println("the label postion changes");
}else {
	System.out.println("the label postion not changes");
}
driver.findElement(By.xpath("//h5[text()='Type your name and choose the third option']/following::input[1]")).sendKeys("geetha");
driver.findElement(By.xpath("//li[contains(@class,'autocomplete')][3]")).click();
WebElement dob=driver.findElement(By.xpath("//h5[text()='Type your DOB (mm/dd/yyyy) and confirm date chosen ']/following::input[contains(@id,'input')]"));
dob.sendKeys("26/03/1996",Keys.TAB);

driver.findElement(By.xpath("//h5[text()='Type number and spin to confirm value changed']/following::input[1]")).sendKeys("4");
driver.findElement(By.xpath("//a[contains(@class,'spinner')][1]")).click();
WebElement startlocation=driver.findElement(By.xpath("//h5[text()='Type random number (1-100) and confirm slider moves correctly']/following::input[1]"));
startlocation.sendKeys("50");
startlocation.getLocation();
WebElement endlocation=driver.findElement(By.xpath("//h5[text()='Type random number (1-100) and confirm slider moves correctly']/following::input[1]"));
endlocation.getLocation();
if(startlocation!=endlocation) {
	System.out.println("the location is changed");
} else {
	System.out.println("the location unchanged");
}
WebElement keyboard =driver.findElement(By.xpath("//h5[text()='Click and Confirm Keyboard appears']/following::input[1]"));
keyboard.click();
keyboard.isEnabled();
System.out.println("keyboard is enabled");
keyboard.sendKeys(Keys.TAB);
driver.findElement(By.xpath("(//button[@class='ql-bold'])[2]")).click();
driver.findElement(By.xpath("(//button[@class='ql-italic'])[2]")).click();
driver.findElement(By.xpath("(//button[@class='ql-underline'])[2]")).click();
driver.findElement(By.xpath("(//button[@class='ql-strike'])[2]")).click();
driver.findElement(By.xpath("//span[@aria-controls='ql-picker-options-5']")).click();
driver.findElement(By.xpath("//span[@id='ql-picker-options-5']/span[2]")).click();
driver.findElement(By.xpath("//div[@data-placeholder='Enter your content']")).sendKeys("thankyou");

	}
	







	}


