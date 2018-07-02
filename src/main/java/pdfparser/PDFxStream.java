package pdfparser;

import com.snowtide.PDF;
import com.snowtide.pdf.Document;
import com.snowtide.pdf.OutputTarget;

public class PDFxStream {
    public static String pdf2String(String filePath) throws java.io.IOException {
        Document pdf = PDF.open(filePath);
        StringBuilder text = new StringBuilder(1024);
        pdf.pipe(new OutputTarget(text));
        pdf.close();
        return text.toString();
    }
}
