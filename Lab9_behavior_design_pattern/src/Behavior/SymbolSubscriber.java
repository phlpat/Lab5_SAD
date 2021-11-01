package Behavior;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.Flow;

public  class SymbolSubscriber extends StringSubscriber {

    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        this.subscription=subscription;
        ((StringSubscription) subscription).addSubscriber(this);
    }

    @Override
    public void onNext(String item) {
        if (item.matches("(.*)[[^A-Za-z0-9]&&[^\n\t\s]](.*)")) {
            try {
                Path path = Paths.get(System.getProperty("user.dir"),"src","Behavior","Symbol.txt");
                File file  = new File(path.toString());
                FileWriter writer = new FileWriter(file, true);

                writer.write(item + "\n");

                writer.flush();
                writer.close();

                writer = null;
            } catch (IOException error) {
                error.printStackTrace();
            }
        }
    }
}