package org.concurrency.oo1;

public class SyncCook {

    public static void main(String[] args) {
        long start_time = System.currentTimeMillis();

        Cook cook = new Cook();
        cook.chopOnion();
        cook.peelPotato();

        System.out.println("Total time taken is: " + (System.currentTimeMillis() - start_time)); // 4044
    }
}
