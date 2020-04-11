package сom.mycode.book;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

//17. Find the 500 longest strings in War and Peace with a parallel stream.
public class WarAndPeace {

    public static void main(String[] args) throws IOException {
        String path = "src/сom/mycode/book/voyna-i-mir-tom-1.txt";
        List<String> longestStrings = Files.lines(Paths.get(path))
                .parallel()
                .sorted((o1, o2) -> o2.length() - o1.length())
                .limit(500).collect(Collectors.toList());

        longestStrings.forEach(System.out::println);
    }
}