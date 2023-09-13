package threads;

public class DiffPriority extends Thread{
    @Override
    public void run() {
        for (int i=0;i<3;i++){
            System.out.println("i  "+i);
        }
        try {
            sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        DiffPriority dp1 = new DiffPriority();
        dp1.setPriority(MAX_PRIORITY);
        dp1.start();


        DiffPriority dp2 = new DiffPriority();
        dp2.setPriority(MIN_PRIORITY);
        dp2.start();

        try {
            dp1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        for (int i =0;i<3;i++){
            System.out.println("j "+i);
        }
    }
}
