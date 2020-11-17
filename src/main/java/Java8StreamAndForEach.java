import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8StreamAndForEach { //filter/map/reduce
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        for (int i = -1 ; i < 10 ; i++) {
            intList.add(i);
        }

        Stream<Integer> seq = intList.stream().filter(p -> p > 0);
        seq.forEach((p) -> System.out.println("Sequential " + p)); // ForEach -- java.util.function.Consumer

        Stream<Integer> parallel = intList.parallelStream().filter(p -> p > 0);
        parallel.forEach((p) -> System.out.println("Parallel " + p));;
        // Map Lambda
        intList.stream().filter(p -> p > 0).map(n -> n*n).collect(Collectors.toList()).forEach((n) -> System.out.println(n));

        //Map :: operator
        intList.stream().filter(p -> p > 0).map(Math::sqrt).collect(Collectors.toList()).forEach((n) -> System.out.println(n));
    }
}
