package сom.mycode.words;

import сom.mycode.ReadFromFile;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Pattern;

/*7. Turning a file into a stream of tokens, list the first 100 tokens that are
        words in the sense of the preceding exercise. Read the file again and list
        the 10 most frequent words, ignoring letter case.*/

public class Tokens {
    public static void main(String[] args) {
        String fileName = "src/сom/mycode/words/TheLittlePrince.txt";
        String line = ReadFromFile.read(fileName);
        System.out.println("The first 100 tokens:");
        Pattern.compile("\\PL+").splitAsStream(line).limit(100).forEach(s ->
                System.out.print(s+"  "));
        System.out.println();
        Map<String, Integer> map = new LinkedHashMap<>();
        System.out.println("The 10 most frequent words");
        Pattern.compile("\\PL+").splitAsStream(line).limit(100).forEach(word -> {
            Integer val = map.get(word);
            if (val != null) {
                map.put(word, new Integer(val + 1));
            } else {
                map.put(word, 1);
            }
        });
        Map<String, Integer> result = new LinkedHashMap<>();
        map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(value->{
                    result.put(value.getKey(), value.getValue());
                });
        result.entrySet().stream().limit(10).forEach(System.out::println);
    }
}