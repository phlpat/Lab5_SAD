package creational;

import java.io.IOException;

public class JSONBookMetadataExporter extends BookMetadataExporter {

    @Override
    public BookMetadataFormatter createBookMetadataFormatter() throws IOException {
        return new JSONBookMetadataFormatter();
    }
}