//import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class Java11 {
    public static void main(String[] args) {
        String s = "   Yuvraj\n   Jag\ntap";
        System.out.println("Strip+" + s.strip() + "+");
        s.lines().forEach(System.out::println);
        System.out.println(s.isBlank());
        System.out.println("Repeat ".repeat(5));

        ///////////-----------------------///////////////////////

        List<String> myList = new ArrayList<>();
        myList.add("A");
        myList.add("AB");
        myList.add("BA");
        //myList.add(null);
        //System.out.println(
 //       myList.stream().filter((@NotNull var p) -> p.startsWith("A")).collect(Collectors.toList()));

    }
}
