package servicenow1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelServiceNow {
	public static String[][] readData(String filename,int sheetindex) throws IOException{
		XSSFWorkbook book=new XSSFWorkbook("./datasheet/"+filename+".xlsx");
		XSSFSheet sheetAt=book.getSheetAt(sheetindex);
		int rowcount=sheetAt.getLastRowNum();
XSSFRow row=sheetAt.getRow(0);
	    
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
