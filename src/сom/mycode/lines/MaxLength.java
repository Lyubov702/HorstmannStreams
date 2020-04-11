package сom.mycode.lines;

import сom.mycode.ReadFromFile;

import java.util.Arrays;
import java.util.Comparator;

//11. Given a finite stream of strings, find all strings of maximum length.
public class MaxLength {
    public static void main(String[] args) {
        String path = "src/сom/mycode/lines/Esenin.txt";
        String lines = ReadFromFile.read(path);
        int maxLength = Arrays.stream(lines.split(" ")).max(Comparator.comparingInt(String::length)).get().length();
        System.out.println("Max length of words= " + maxLength);
        Arrays.stream(lines.split(" ")).filter(word -> word.length() >= maxLength).forEach(System.out::println);
    }
}
