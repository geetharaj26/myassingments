package assignment7;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CreateLead1 extends ProjectMethod {
	@Test(dataProvider="sendData")

	public void creatinglead(String cname,String firstname,String lastname) {
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastname);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("99");
		driver.findElement(By.name("submitButton")).click();
		
}
//	@DataProvider
//	public String[][] sendData() throws IOException{
//		filename="createlead";
//		sheetindex=0;
//		/*
//		 * String[][]data=new String[2][3]; data[0][0]="tl"; data[0][1]="geetha";
//		 * data[0][2]="r";
//		 * 
//		 * data[1][0]="testleaf"; data[1][1]="princi"; data[1][2]="r";
//		 */
//		return ReadExcelData.readData(filename,sheetindex);
		
	@BeforeTest
	public void setfile() {
		filename="createlead";
		sheetindex=0;
	}
}


	


