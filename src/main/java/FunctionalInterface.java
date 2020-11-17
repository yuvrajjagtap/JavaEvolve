@java.lang.FunctionalInterface
public interface FunctionalInterface {
    static public String concat(String s1, String s2) {
        return s1+s2;
    }

   /* default public String concat(String s1, String s2) {
        return s1+s2;
    }*/

    public String beautify(String s1, String s2);
}
