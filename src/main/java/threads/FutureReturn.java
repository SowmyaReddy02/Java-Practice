package threads;

import java.util.concurrent.*;

public class FutureReturn implements Callable<Double> {

    public Double area(int a,int b){
        return (double) (a*b/2);
    }

    @Override
    public Double call() {
        return area(3,3);
    }
}

class Test1{
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService e = Executors.newSingleThreadExecutor();

           Future<Double> f = e.submit(new FutureReturn());
           System.out.println("value "+f.get());

           e.shutdown();
    }

}
