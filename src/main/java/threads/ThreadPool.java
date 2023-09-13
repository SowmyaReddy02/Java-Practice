package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool implements Runnable{

    @Override
    public void run() {
        System.out.println("Task executed");
    }
}

class Test{
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        System.out.println("Thread " + Thread.currentThread().getName());

        for (int i = 0; i < 3; i++) {
            executorService.execute(new ThreadPool());
        }
    }

}
