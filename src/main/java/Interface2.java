public interface Interface2 {
    public static String getName() {
        return "Interface2";
    }

    default void logMessage(String message) {
        System.out.println("Logging from Interface2 " + message);
    }

    void method21();
}
