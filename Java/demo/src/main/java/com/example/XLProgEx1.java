package com.example;

import java.io.IOException;
import java.io.FileOutputStream;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel. HSSFCell;

public class XLProgEx1 {

  public static void main(String[] args) throws IOException{

     HSSFWorkbook workbook = new HSSFWorkbook();
     HSSFSheet sheet = workbook.createSheet("Data Sheet");

     HSSFRow row;

     String [][] data = {
            {"ID","Name","Age"},
            {"1","Nikhil","24"},
            {"2","Naresh","23"},
     };

     for (int i = 0; i<data.length;i++){
        row = sheet.createRow(i); 
        for(int j = 0; j<data[i].length;j++){ 
            HSSFCell cell = row.createCell(j);
            cell.setCellValue(data[i][j]);
        }
     }
     FileOutputStream outputStream = new FileOutputStream("data.xls");
     workbook.write(outputStream);
     outputStream.close();
     System.out.println("Excel file created successful!!!");
  }
}
