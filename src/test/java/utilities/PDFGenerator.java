package utilities;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import pojos.Customers;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class PDFGenerator {

    public static void pdfGeneratorRowsAndCellsWithList(String header, List<Customers> list, String fileName){
        Document document = new Document();
        String pdf_path = fileName;
        String pdf_title = header;

        List<String> headers = new ArrayList<String>();
        headers.add("CustomerName");
        headers.add("SSNs");
        headers.add("City");
        headers.add("Email");
        headers.add("Zip codes");
        try{
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(pdf_path));
            document.open();
            document.add(new Paragraph("                                     "+pdf_title));
            PdfPTable table = new PdfPTable(5);
            table.setWidthPercentage(110);
            table.setSpacingBefore(25);
            table.setSpacingAfter(25);
            float [] colWidth = {2,2,2,2,2};
            table.setWidths(colWidth);
            for(int i=0;i<headers.size();i++) {
                PdfPCell cell1 = new PdfPCell(new Phrase(headers.get(i)));
                table.addCell(cell1);
            }

            table.setHeaderRows(list.size());
            for(int i=0;i<list.size();i++ ) {
                table.addCell(list.get(i).getFirstName());
                table.addCell(list.get(i).getSsn());
                table.addCell(list.get(i).getCity());
                table.addCell(list.get(i).getEmail());
                table.addCell(list.get(i).getZipCode());
            }
            document.add(table);

            document.close();
            writer.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }





}
