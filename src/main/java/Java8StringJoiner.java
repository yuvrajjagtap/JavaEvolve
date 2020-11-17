import java.util.StringJoiner;

public class Java8StringJoiner {
    public static void main(String[] args) {
        StringJoiner joiner = new StringJoiner(",","[", "]");
        joiner.add("Yuvraj");
        joiner.add("Jagtap");
        System.out.println(joiner);
    }
}
