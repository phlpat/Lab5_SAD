package creational;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws ParserConfigurationException, IOException {

        // Current usage
//        BookMetadataFormatter formatter = null;
//        try {
//            formatter = BookMetadataFormatterFactory.getBookMetadataFormatter(BookMetadataFormatterFactory.Format.JSON);
//            formatter.append(TestData.dragonBook);
//            formatter.append(TestData.dinosaurBook);
//            System.out.print(formatter.getMetadataString());
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ParserConfigurationException e) {
//            e.printStackTrace();
//        }


        // Expected usage
        try {
            BookMetadataExporter exporter = new XMLBookMetadataExporter();
            exporter.add(TestData.dragonBook);
            exporter.add(TestData.dinosaurBook);
            exporter.export(System.out);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
