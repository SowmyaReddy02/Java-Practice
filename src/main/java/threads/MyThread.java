package threads;

public class MyThread extends Thread{
    @Override
    public void run() {
        for (int i=1;i<=4;i++){
            System.out.println("i: "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class ThreadDemo{
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread();
        myThread1.setName("thread1");
        myThread1.setPriority(Thread.MAX_PRIORITY);
        myThread1.start();

        MyThread myThread2 = new MyThread();
        myThread2.setName("thread2");
        myThread2.setPriority(Thread.MAX_PRIORITY);
        myThread2.start();

        for (int j=1;j<10;j++){
            System.out.println("j:"+j+"\t");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
