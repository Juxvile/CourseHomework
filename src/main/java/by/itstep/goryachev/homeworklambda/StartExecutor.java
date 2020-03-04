package by.itstep.goryachev.homeworklambda;



import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class StartExecutor {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);


        List<Future<Long>> futureList = new ArrayList<>();

        for (int i = 0; i < 10; ++i) {
            myCallable myCallable = new myCallable();
//            executorService.submit(myCallable);
            Future <Long> future = executorService.submit(myCallable);
            futureList.add(future);
            if (i == 9) {
                executorService.shutdown();
            }
        }

//        for (Future<Long> f1 : futureList){
//            try {
//                System.out.println(f1.get());
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            } catch (ExecutionException e) {
//                e.printStackTrace();
//            }
//        }

//        futureList.forEach(System.out::println);
//        executorService.shutdown();

    }
}



class myCallable implements Callable <Long> {

    @Override
    public Long call() throws Exception {
        try {
            System.out.println("Started: " + Thread.currentThread().getId());
            Thread.sleep(2000 + Math.round(Math.random() * 3000));
            System.out.println("Finished " + Thread.currentThread().getId());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return Thread.currentThread().getId();
    }
}
