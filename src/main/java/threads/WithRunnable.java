package threads;

public class WithRunnable implements Runnable{

    @Override
    public void run() {
        for (int i=0;i<10;i++){
            System.out.println("i "+i);
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        WithRunnable wr = new WithRunnable();
        Thread thread1 = new Thread(wr);
        thread1.start();
        thread1.setPriority(Thread.MAX_PRIORITY);

        Thread thread2 = new Thread(wr);
        thread2.start();
        thread2.setPriority(Thread.MAX_PRIORITY);

            for (int j=0;j<10;j++){
                System.out.println("j "+j);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
    }
}
