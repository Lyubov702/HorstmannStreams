package сom.mycode.words;
import сom.mycode.ReadFromFile;
import java.util.Arrays;

/*9. Read the words from /usr/share/dict/words (or a similar word list) into a
        stream and produce an array of all words containing five distinct vowels.*/

public class SingleVowels {
    public static void main(String[] args) {
        String path = "src/сom/mycode/words/TheLittlePrince.txt";
        String lines = ReadFromFile.read(path);
        Arrays.stream(lines.split(" ")).forEach(word -> {
            int count = 0;
            word = word.toLowerCase();
            if (word.contains("а")) count++;
            if (word.contains("у")) count++;
            if (word.contains("о")) count++;
            if (word.contains("ы")) count++;
            if (word.contains("и")) count++;
            if (word.contains("э")) count++;
            if (word.contains("я")) count++;
            if (word.contains("ю")) count++;
            if (word.contains("е")) count++;
            if (word.contains("ё")) count++;

            if (count >4){
                System.out.println(word);
            };
        });
    }
}
