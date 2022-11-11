package servicenow;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class Incident extends BaseClass {
@Test
	public void creating() throws InterruptedException {
		
		Shadow shadow =new Shadow(driver);
		Thread.sleep(3000);
        shadow.findElementByXPath("//div[text()='All']").click();
        shadow.setImplicitWait(10);
        shadow.findElementByXPath("//input[@id='filter']").sendKeys("Incident",Keys.ENTER);
        shadow.findElementByXPath("//span[text()='Create New']").click();
        driver.switchTo().frame(0);
        WebElement firstframe = shadow.findElementByXPath("//iframe[@id='gsft_main']");
        firstframe.click();
        shadow.findElementByXPath("//button[contains(@id,'lookup.incident.caller_id')]").click();
        Set<String>windowHandles=driver.getWindowHandles();
        System.out.println("size of windows " +windowHandles.size());
        List<String>window=new ArrayList<String>(windowHandles);
        driver.switchTo().window(window.get(1));
        System.out.println(driver.getTitle());   
        shadow.findElementByXPath("//a[text()='System Administrator']").click();
        driver.switchTo().window(window.get(0));
        driver.switchTo().frame(0);
         WebElement frame = shadow.findElementByXPath("//iframe[@id='gsft_main']");
         Thread.sleep(3000);
         shadow.findElementByXPath("//input[@id='incident.short_description']").sendKeys(null);
         shadow.findElementByXPath("//button[text()='Submit']").click();
         Thread.sleep(3000);
         shadow.findElementByXPath("//i[@aria-label='Updated column options']").click();
         shadow.findElementByXPath("//div[text()='Sort (z to a)']").click();
         String id = shadow.findElementByXPath("//table/tbody/tr[1]/td[3]").getText();
        System.out.println(id);
        WebElement list = shadow.findElementByXPath("//select[@role='listbox']");
        Select opt=new Select(list);
        opt.selectByVisibleText("Number");
        shadow.findElementByXPath("//input[@class='form-contro']").sendKeys(id,Keys.ENTER);
        String id1 = shadow.findElementByXPath("//table/tbody/tr[1]/td[3]").getText();
        if(id.equals(id1)) {
        	System.out.println("instance num is created");
        }else {
        	System.out.println("instance num not created");
        }
       
        
        
        
	}

}
