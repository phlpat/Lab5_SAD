package creational;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.PrintStream;

public abstract class BookMetadataExporter extends BookCollection {

    public void export(PrintStream stream) throws ParserConfigurationException, IOException {
        BookMetadataFormatter export_books=createBookMetadataFormatter();
        for (Book book:books
        ) {
            export_books.append(book);
        }
        stream.print(export_books.getMetadataString());
    }
    public abstract BookMetadataFormatter createBookMetadataFormatter() throws ParserConfigurationException, IOException;
}
