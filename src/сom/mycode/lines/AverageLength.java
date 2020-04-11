package сom.mycode.lines;

import сom.mycode.ReadFromFile;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

//10. Given a finite stream of strings, find the average string length.
public class AverageLength {
    public static void main(String[] args) {
        String path = "src/сom/mycode/lines/Esenin.txt";
        String lines = ReadFromFile.read(path);
        AtomicInteger count = new AtomicInteger();
        AtomicInteger sum = new AtomicInteger();
        Arrays.stream(lines.split(" ")).forEach(word -> {
            sum.addAndGet(word.length());
            count.getAndIncrement();
        });
        System.out.println("Average length of words:");
        System.out.println(sum.get() / count.get());
    }
}
