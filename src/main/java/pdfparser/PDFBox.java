package pdfparser;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.File;
import java.io.IOException;

public class PDFBox {
    public static String pdf2String(String filePath) {
        String content = "";
        try {
            PDDocument doc = PDDocument.load(new File(filePath));
            PDFTextStripper textStripper = new PDFTextStripper();
            content = textStripper.getText(doc);
            doc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content;
    }
}
