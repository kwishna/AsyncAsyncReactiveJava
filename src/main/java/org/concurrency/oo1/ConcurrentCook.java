package org.concurrency.oo1;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ConcurrentCook {

    public static void main(String[] args) throws InterruptedException {

        long start_time = System.currentTimeMillis();

        try (ExecutorService exec = Executors.newFixedThreadPool(2)) {

            Cook cook = new Cook();

            Future<?> onion = exec.submit(cook::chopOnion);
            Future<?> potato = exec.submit(cook::peelPotato);

            Thread.sleep(10000); // if we comment this line `onion.isDone()` and `potato.isDone()` will be 'false'. Hence, if-block won't be executed.

            if (onion.isDone()) {
                System.out.println("---- Onion Peeling Completed ----");
            }

            if (potato.isDone()) {
                System.out.println("---- Potato Peeling Completed ----");
            }

            System.out.println("Total time taken is: " + (System.currentTimeMillis() - (start_time + 10000)));
            exec.shutdown();

        }
    }
}
