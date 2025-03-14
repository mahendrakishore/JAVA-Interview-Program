package Intellias;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LargestListStream {

    public static void main(String[] args) {
        int[] numbers = {10, 5, 20, 8, 15};
        List<Integer> numList = Arrays.asList(10, 5, 20, 8, 15);

        Optional<Integer> sl= numList.stream().max(Integer::compareTo);
        sl.ifPresent(max -> System.out.println(max));

    }
}
