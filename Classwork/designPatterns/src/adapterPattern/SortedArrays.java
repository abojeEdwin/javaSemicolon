package adapterPattern;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SortedArrays {
    public static void main(String[] args) {
        int [] arr1 = {5,4,22,6};
        int [] arr2 = {1,2,3,4};
        System.out.println(IntStream.concat(IntStream.of(arr1), IntStream.of(arr2))
                .sorted()
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(" ")));
}
}
