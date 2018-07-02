import pdfparser.PDFxStream;
import utils.FileUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            List<String> fileList = FileUtils.getFiles("D:/Business/ARP/invoice_sample/", new ArrayList<>());
            System.out.println(fileList.size());
            System.out.println(fileList);
            System.out.println("---------------------------------");
            String fileContent = PDFxStream.pdf2String("D:/Business/ARP/invoice_sample/HKG-SINOWAY SHIPPING LTD.pdf");
//            String fileContent = PDFBox.pdf2String("D:/Business/ARP/invoice_sample/HKG-SINOWAY SHIPPING LTD.pdf");
            System.out.println(fileContent);
            FileUtils.writeFile("D:/PDFxStream.txt", fileContent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
