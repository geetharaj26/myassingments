package assignment7;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static String[][] readData(String filename,int sheetindex) throws IOException{

		
		XSSFWorkbook book=new XSSFWorkbook("./datasheet/"+filename+".xlsx");
	    XSSFSheet sheetAt = book.getSheetAt(sheetindex);//get the sheet
	    XSSFRow row=sheetAt.getRow(0);
	    
	    //row count using sheet
	    int rowcount = sheetAt.getLastRowNum();
	    
	    //col count using one row
	    int colcount = row.getLastCellNum();
	    String[][]data=new String[rowcount][colcount];
	   
	    
	    //to iterate into each cell
	    for(int i=1;i<=rowcount;i++) {
	  	 for (int j=0;j<colcount;j++) {
	  		 String allvalues = sheetAt.getRow(i).getCell(j).getStringCellValue();
//	  		 System.out.println(allvalues);
	  		 data[i-1][j]=allvalues;

	}
	    }
	    book.close();
		return data;
		}
	}


	
