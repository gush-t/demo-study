package com.example.workstudy.json;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

public class XlsxRead {

    /**
     * 1.读取xlsx文件中的url
     * 1.1解析文件
     * 1.2遍历row
     * 1.3获取cell
     *
     * @param args
     */
    public static void main(String[] args) throws IOException {
        String fileName = "D:\\chatRecord\\WChat\\WeChat Files\\wxid_9qdj8w8gd3pg22" +
                "\\FileStorage\\File\\2021-03\\Session.xlsx";
        InputStream inputStream = new FileInputStream(fileName);
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
        XSSFSheet xssfSheet = workbook.getSheetAt(0);
        XSSFRow xssfRow;
        XSSFCell xssfCell;
        StringBuffer stringBuffer  =new StringBuffer();
        Iterator iterator =  xssfSheet.rowIterator();
        int time = 0;
        while (iterator.hasNext()){
            xssfRow = (XSSFRow) iterator.next();
            XSSFCell url =  xssfRow.getCell(2);
            stringBuffer.append("'");
            stringBuffer.append(url.getStringCellValue());
            stringBuffer.append("', ");
            time++;
        }
        System.out.println(stringBuffer.toString());
        System.out.println(time);
    }
}
