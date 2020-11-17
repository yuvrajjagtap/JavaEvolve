public interface Interface1 {
    public static String getName() {
        return "Interface1";
    }

    default void logMessage(String message) {
        System.out.println("Logging from Interface1 " + message);
    }

    void method11();

    void method12();
}
