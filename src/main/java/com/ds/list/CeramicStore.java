import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CeramicStore {
    public static void runAndWait(List<Runnable> runnables) throws InterruptedException {
        int numberOfTasks = runnables.size();
        CountDownLatch latch = new CountDownLatch(numberOfTasks);

        ExecutorService executor = Executors.newFixedThreadPool(numberOfTasks);

        for (Runnable runnable : runnables) {
            executor.execute(() -> {
                try {
                    runnable.run();
                } finally {
                    latch.countDown();
                }
            });
        }

        // Wait for all tasks to finish
        latch.await();

        // Shutdown the executor
        executor.shutdown();
    }

    public static void main(String[] args) {
        // Example usage
        List<Runnable> tasks = List.of(
                () -> System.out.println("Task 1 executed"),
                () -> System.out.println("Task 2 executed"),
                () -> System.out.println("Task 3 executed")
        );

        try {
            CeramicStore.runAndWait(tasks);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("All tasks have finished.");
    }
}
