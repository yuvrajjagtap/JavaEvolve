
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java9 implements Java9Interface{
    public static void main(String[] args) {
        // Old way
        List<String> myList = new ArrayList<>();
        myList.add("one");
        myList.add("two");
        myList.add("three");
        myList.add("four");
        myList = Collections.unmodifiableList(myList);
        //myList = null;

        // New Way
        List<String> list = List.of("one", "two", "three");
        // Immutable
        //list.add("four");
        Map<Integer,String> map = Map.of(1, "Yuv",2,"Jag");

        //-------------------------------------------------------------------------------------//

        User user = new User();
        Address add = new Address();
        add.setStreet("Biljmer");
        user.setAddress(add);
        Optional.of(user).map(User::getAddress).map(Address::getStreet).ifPresent((p) -> System.out.println("Street Present"));
        Optional.of(user).map(User::getAddress).map(Address::getStreet).ifPresentOrElse((p) -> System.out.println("Street Present"),() -> System.out.println("Street Missing"));

        //-------------------------------------------------------------------------------------//

        System.out.println(myList.stream().takeWhile((s) -> !s.startsWith("t")).collect(Collectors.toList()));

        System.out.println(myList.stream().dropWhile((s) -> !s.startsWith("t")).collect(Collectors.toList()));

        myList = null;
        //myList.forEach(System.out::println);
        Stream.ofNullable(myList).forEach(System.out::println);//takeWhile((s) -> !s.startsWith("t")).collect(Collectors.toList()));

        System.out.println(Stream.iterate(0, n -> n + 1) // Java 8
                .limit(5).collect(Collectors.toList()));

        System.out.println(Stream.iterate(0, i -> i < 5, i -> i + 1).collect(Collectors.toList())); // Java9

        //-------------------------------------------------------------------------------------//

        new Java9().logMessage("Testing Interface Private methods");

        //-------------------------------------------------------------------------------------//
        
    }

    @Override
    public void method1() {

    }
}
