package threads;

public class Communication extends Thread{
    int total;
    @Override
    public void run() {
        System.out.println("Child thread is calculating sum: ");
        synchronized (this){
            for(int i=0;i<5;i++){
                total+=i;
            }
            this.notify();
        }
    }
}

class Main2{
    public static void main(String[] args) throws InterruptedException {
        Communication com = new Communication();
        com.start();
        synchronized (com){
            System.out.println("wait");
            com.wait();
            System.out.println("notified");
            System.out.println(com.total);
        }
    }
}
