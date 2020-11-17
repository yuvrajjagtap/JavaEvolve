import java.time.LocalDateTime;

public interface Java9Interface {
    default void logMessage(String message) {
        logStartTime();
        System.out.println(message);
        logEndTime();
    }

    private void logStartTime() {
        System.out.println("Start");
        logTime();
    }

    private void logEndTime() {
        logTime();
        System.out.println("End");
    }

    private void logTime() {
        System.out.println(LocalDateTime.now());
    }

    void method1();
}
