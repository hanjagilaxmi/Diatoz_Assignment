package genericScript;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Datadriven {
	public static String getData(String sh,int r,int c) throws EncryptedDocumentException, IOException 
	{
		String value=null;
		try {
		FileInputStream fis=new FileInputStream("./Excel/Booksexcel.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet s=book.getSheet(sh);
		Row r1 = s.getRow(r);
		Cell c1 = r1.getCell(c);
		value = c1.toString();
		}
		catch (Exception e) {
			
		}
		return value;
		
		
	}
}
