package servicenow1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class UpdateIncident1 extends BaseClass1 {
	@Test(dataProvider="sendData")
	public void updating(String text) throws InterruptedException {
		
		Shadow shadow = new Shadow(driver);
        Thread.sleep(3000);
        shadow.findElementByXPath("//div[text()='All']").click();
        
        shadow.findElementByXPath("//input[@id='filter']").sendKeys(text); 
        shadow.findElementByXPath("//span[text()='All']").click();
        driver.switchTo().frame(shadow.findElementByXPath("//iframe[@id='gsft_main']"));
        shadow.setImplicitWait(5);
        shadow.findElementByXPath("//i[@aria-label='Updated column options']").click();
        shadow.findElementByXPath("//div[text()='Sort (z to a)']").click();
        String text1= shadow.findElementByXPath("//table/tbody/tr[1]/td[8]").getText();
		System.out.println(text1);
		String text2 = shadow.findElementByXPath("//table/tbody/tr[1]/td[7]").getText();
		System.out.println(text2);
		String id = shadow.findElementByXPath("//table/tbody/tr[1]/td[3]").getText();
		System.out.println(id);
        shadow.findElementByXPath("//table/tbody/tr[1]/td[3]").click();
        WebElement state = shadow.findElementByXPath("//select[@id='incident.state']");
		Select opt1=new Select(state);
		opt1.selectByVisibleText("In Progress");
		WebElement urgency = shadow.findElementByXPath("//select[@id='incident.urgency']");
		Select opt2=new Select(urgency);
		opt2.selectByVisibleText("1 - High");
		shadow.findElementByXPath("//textarea[contains(@id,'work_notes-textarea')]").sendKeys("null");
		shadow.findElementByXPath("//button[text()='Update']").click();
		shadow.findElementByXPath("//i[@aria-label='Updated column options']").click();
        shadow.findElementByXPath("//div[text()='Sort (z to a)']").click();
		WebElement dropdown = shadow.findElementByXPath("//select[@role='listbox']");
		Select option=new Select(dropdown);
		option.selectByVisibleText("Number");
		shadow.findElementByXPath("//input[@class='form-control']").sendKeys(id,Keys.ENTER);
		 Thread.sleep(3000);
		String statetext1 = shadow.findElementByXPath("//table/tbody/tr[1]/td[8]").getText();
		System.out.println(statetext1);
		String prioritytext1 = shadow.findElementByXPath("//table/tbody/tr[1]/td[7]").getText();
		System.out.println(prioritytext1);
		String idName1 = shadow.findElementByXPath("//table/tbody/tr[1]/td[3]").getText();
		System.out.println(idName1);
		if((text1.equals(statetext1)) && (text2.equals(prioritytext1)) && (id.equals(idName1))){
			System.out.println("The instance is not updated");
		}else {
			System.out.println("The instance is updated");
		}
		

	}
	@BeforeTest
	public void setfile() {
		filename="servicenow";
		sheetindex=0;
	}


}
