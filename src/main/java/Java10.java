import java.util.*;
import java.util.stream.Collectors;

public class Java10 { // var

    String s2 = "";

    public static void main(String[] args) {
        var myName = "Yuvraj";
        var split = Optional.of(myName).map(s -> s.split("v")).get();
        Arrays.stream(split).forEach(System.out::println);

        var java8 = new Java9();
        test1(java8);

        ////////////////-------------------///////////////////////////////////////////////
        List<String> myList = new ArrayList<>();
        myList.add("one");
        myList.add("two");
        myList.add("three");
        myList.add("four");
        myList = List.copyOf(myList);
        //myList.add("five");

        //var newList = myList.stream().takeWhile((s) -> !s.startsWith("t")).collect(Collectors.toList());
        var newList = myList.stream().takeWhile((s) -> !s.startsWith("t")).collect(Collectors.toUnmodifiableList());
        System.out.println(newList);
        //newList.add("five");

        ////////////////-------------------///////////////////////////////////////////////

        var numList = List.of(1,2,3,4,5,6);
        var fstInt = numList.stream().filter((p) -> p > 5).findFirst().orElseThrow();
        System.out.println(fstInt);


    }

    public static void test1(Java9Interface s) {

    }
}
