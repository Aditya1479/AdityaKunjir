package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelOperation {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		File file = new File("D:\\Java\\AdityaKunjir\\TestData\\loginData.xlsx");

		// Using try-with-resources to automatically close streams
		try (FileInputStream inputStream = new FileInputStream(file); Workbook WB = new XSSFWorkbook(inputStream)) {

			// Get the sheet named "Data"
			Sheet sheet = WB.getSheet("Data");

			if (sheet == null) {
				System.out.println("Sheet 'Data' not found!");
				return;
			}

			// Get total number of rows (excluding header)
			int totalRows = sheet.getLastRowNum();
			System.out.println("Total rows: " + totalRows);

			// Get total number of rows including header
			int totalRowsWithHeader = sheet.getPhysicalNumberOfRows();
			System.out.println("Total rows (with header): " + totalRowsWithHeader);

		}
	}
}
