package сom.mycode;

import java.util.*;
import java.util.stream.Collectors;

public class FlatMappingExample {
    public static void main(String[] args) {
        int[][] arr = {{4, 44}, {444, 4444}, {44444, 444444}};

        int[] newArr = Arrays.stream(arr)
                .flatMapToInt(Arrays::stream)
                .toArray();

        System.out.println(Arrays.toString(newArr)); //print [1, 2, 3, 4, 5, 6]


        List<List<Integer>> list = Arrays.asList(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        Map<Integer, List<Integer>> map =
                list.stream()
                        .collect(Collectors.toMap(
                                Collection::size,
                                x -> x.stream().filter(y -> y % 5 != 0).collect(Collectors.toCollection(ArrayList::new)),
                                (left, right) -> {
                                    left.addAll(right);
                                    return left;
                                }
                        ));


        System.out.println(map);
    }
}
