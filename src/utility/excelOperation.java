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

	public static Object[][] getRowData(String FilePath,String sheetName) throws FileNotFoundException, IOException {

		File file = new File(FilePath);

		// Using try-with-resources to automatically close streams
		try (FileInputStream inputStream = new FileInputStream(file); Workbook WB = new XSSFWorkbook(inputStream)) {

			// Get the sheet named "Data"
			Sheet sheet = WB.getSheet(sheetName);

			// Get total number of rows (excluding header)
			int totalRows = sheet.getLastRowNum();
			System.out.println("Total rows: " + totalRows);

			// Get total number of rows including header
			int totalRowsWithHeader = sheet.getPhysicalNumberOfRows();
			System.out.println("Total rows (with header): " + totalRowsWithHeader);

			// It always print the first row column count which is headed and logically we
			// see headers are common for all rows
			int totalCol = sheet.getRow(0).getLastCellNum();
			System.out.println("Total Columns " + totalCol);

			Object[][] data = new Object[totalRows][totalCol];

			for (int rowIndex = 0; rowIndex < totalRows; rowIndex++) {
				for (int colIndex = 0; colIndex < totalCol; colIndex++) {
					data[rowIndex][colIndex] = sheet.getRow(rowIndex + 1).getCell(colIndex).getStringCellValue();
					System.out.println(data[rowIndex][colIndex]);
				}
				System.out.println();
			}
			WB.close();
			return data;
		}
		
	}

}
