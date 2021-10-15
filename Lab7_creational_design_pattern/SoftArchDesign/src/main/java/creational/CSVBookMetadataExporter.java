package creational;

import java.io.IOException;

public class CSVBookMetadataExporter extends BookMetadataExporter {

    @Override
    public BookMetadataFormatter createBookMetadataFormatter() throws IOException {
        return new CSVBookMetadataFormatter();
    }
}