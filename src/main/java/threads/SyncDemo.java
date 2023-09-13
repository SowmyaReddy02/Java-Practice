package threads;

public class SyncDemo {
    public synchronized void hello(String name) {
        for(int i=0;i<10;i++){
            System.out.println("name"+name);
        }
    }
}

class Sync{
    public static void main(String[] args) {
        SyncDemo syncDemo  = new SyncDemo();
        MyThreads t1 = new MyThreads(syncDemo,"Sow");
        MyThreads t2 = new MyThreads(syncDemo,"Chan");
        t1.start();
        t2.start();
    }
}

class MyThreads extends Thread{
    SyncDemo sd;
    String name;

    public MyThreads(SyncDemo sd, String name){
        this.sd=sd;
        this.name=name;
    }

    @Override
    public void run() {
        sd.hello(name);
    }
}
