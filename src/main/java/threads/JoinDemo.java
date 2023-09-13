package threads;

import java.util.Scanner;

public class JoinDemo extends Thread{
    static int n,num=0;
    @Override
    public void run() {
        for(int i=1;i<n;i++){
            num=num+n;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println("Sum of N numbers");
        System.out.println("Enter a value");
        Scanner scanner = new Scanner(System.in);
        JoinDemo.n = scanner.nextInt();
        JoinDemo jd = new JoinDemo();
        jd.start();

        try {
            //main is going to take pause until the execution of thread is completed
            jd.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Sum of first "+jd.n +"Number is "+jd.num);
        long end = System.currentTimeMillis();
        System.out.println("Total time taken is "+(end - start)/1000+" Seconds");

    }
}
