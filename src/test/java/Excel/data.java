package Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class data {
	
	@Test
	  public String ReadInteger(int rownum,int colnum) throws EncryptedDocumentException, IOException {
		  
		  
		String FilePath = "./Testdata.xlsx";
		 FileInputStream fs = new FileInputStream(FilePath);
		 Workbook wb = new WorkbookFactory().create(fs);

		Sheet sh = wb.getSheetAt(0); // this is to get the access to Sheet1.
		 
		 int rowcount=sh.getLastRowNum();
		 
		//  System.out.println("No of rows containing value in excel is :"+rowcount);
		 
		 Row r =sh.getRow(rownum); //Get 1 st row from execel
		 
		 Cell c=r.getCell(colnum); //Get 1 st cell from execel
		 
		 DataFormatter formatter = new DataFormatter();

		 String Exceldata = formatter.formatCellValue(c);
		 
		 
		 return Exceldata;
		  
	  }
	  
	public String ReadString(int rownum,int colnum) throws EncryptedDocumentException, IOException {
		  
		  
		  String FilePath = "./Testdata.xlsx";
		  FileInputStream fs = new FileInputStream(FilePath);
		  Workbook wb = new WorkbookFactory().create(fs);
		 
		  Sheet sh = wb.getSheetAt(0); // this is to get the access to Sheet1. 
		  
		  int rowcount=sh.getLastRowNum();
		  
		//  System.out.println("No of rows containing value in excel is :"+rowcount);
		  
		  Row r =sh.getRow(rownum); //Get 1 st row from execel
		  
		  Cell c=r.getCell(colnum); //Get 1 st cell from execel
		  
		  String Exceldata=c.getStringCellValue();
		  //System.out.println("data from excel is :"+Exceldata);
		  
		  return Exceldata;
		  
	  }

	
public String Write(int rownum,int colnum,String outputdata) throws IOException {
		  
		  
		  String FilePath = "./Testdata.xlsx";
		  FileInputStream fs = new FileInputStream(FilePath);
		  Workbook wb = new WorkbookFactory().create(fs);
		  
		  Sheet sh = wb.getSheetAt(0); // this is to get the access to Sheet1. 
		  
		
		// Row r =sh.getRow(rownum); //Get 1 st row from execel
		  
		  
		// Cell c=r.createCell(colnum); //create cell  to store value in excel
		 

		  
		// and setCellvalue will set the value
		 
		 sh.getRow(rownum).createCell(colnum).setCellValue(outputdata);
		 
		
		 
		// here we need to specify where you want to save file
		 
		 FileOutputStream fout=new FileOutputStream(new File("outputfilepath"));
		 
		 
		// finally write content 
		 
		 try {
			wb.write(fout);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		// close the file
		 
		 fout.close();
		 
		 return "Outputdata Added to Excel ";
	  }
	}
	
	