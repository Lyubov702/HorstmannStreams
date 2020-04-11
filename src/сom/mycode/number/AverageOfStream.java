package сom.mycode.number;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

//15. Write a call to reduce that can be used to compute the average of a Stream<Double>.
public class AverageOfStream {
    public static void main(String[] args) {
        List<Double> number = new ArrayList<>();
        Stream<Double> num = Stream.of(7.0, 25.0, 4.0, 19.0, 44.0, 5.0);
        double avg = num.mapToDouble(Double::doubleValue).average().getAsDouble();
        System.out.println("Average of double numbers= " + avg);
    }
}
