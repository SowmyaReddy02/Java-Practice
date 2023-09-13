package org.example;



class ThreadOne extends Thread{

}

class ThreadTwo implements Runnable{

    @Override
    public void run() {

    }
}
public class DemoThread {
    public static void main(String[] args) {
        Thread thread =  new Thread();
        System.out.println(thread.getName());
        System.out.println(thread.getPriority());
   //     System.out.println(thread.setPriority());

        ThreadOne threadOne = new ThreadOne();
        threadOne.start();
        threadOne.run();
      //  threadOne.sl
      //  threadOne.wait();
        ThreadTwo threadTwo = new ThreadTwo();


    }
}
