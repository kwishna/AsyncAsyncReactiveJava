package org.concurrency.oo1;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class AsyncCook {

    public static void main(String[] args) {

        long start_time = System.currentTimeMillis();

//        CompletableFuture.supplyAsync(() -> new AsyncCook().chopOnion()).thenAccept(v -> System.out.println("--- chop completed ---"));
//        CompletableFuture.supplyAsync(() -> new AsyncCook().peelPotato()).thenAccept(v -> System.out.println("--- peel completed ---"));

        Cook cook = new Cook();

        CompletableFuture<Boolean> f1 = CompletableFuture.supplyAsync(cook::chopOnion);
        CompletableFuture<Boolean> f2 = CompletableFuture.supplyAsync(cook::peelPotato);

//        System.out.println(f2.join());
//        System.out.println(f1.join());

        CompletableFuture.allOf(f1, f2).thenAccept(v -> {
            System.out.println("All tasks completed.");
            System.out.println("f1 outcome: "+f1.join());
            System.out.println("f2 outcome: "+f2.join());
        });

        System.out.println("Total time taken is: "+(System.currentTimeMillis() - start_time));
    }
}
