package creational;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONBookMetadataFormatter implements BookMetadataFormatter {

    private JSONObject JSONobj;
    private JSONArray  JSONbooks;

    public JSONBookMetadataFormatter() {
        reset();
    }

    @Override
    public BookMetadataFormatter reset() {
        // Please implement this method. You may create additional methods as you see fit.
        JSONobj = new JSONObject();
        JSONbooks = new JSONArray();
        JSONobj.put("Books",JSONbooks);
        return this;
    }

    @Override
    public BookMetadataFormatter append(Book b) {
        // Please implement this method. You may create additional methods as you see fit.
        var obj = new JSONObject();
        obj.put("ISBN",b.getISBN());
        obj.put("Title",b.getTitle());
        obj.put("Publisher",b.getPublisher());

        var oL = new JSONArray();
        for(var auth : b.getAuthors()){
            oL.add(auth);
        }
        obj.put("Authors",oL);
        JSONbooks.add(obj);
        return this;
    }

    @Override
    public String getMetadataString() {
        // Please implement this method. You may create additional methods as you see fit.
        return JSONobj.toString()+'\n';
    }
}
