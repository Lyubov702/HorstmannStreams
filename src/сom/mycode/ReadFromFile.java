package сom.mycode;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadFromFile {
    public static String read(String path) {
        StringBuilder builder = new StringBuilder();
        try {
            Files.lines(Paths.get(path)).parallel().forEach(builder::append);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String lines = builder.toString().trim();
        return lines;
    }
}
