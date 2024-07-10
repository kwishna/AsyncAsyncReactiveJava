package org.concurrency.oo1;

public class Cook {
    public boolean chopOnion() {
        for (int i = 0; i < 10; i++) {
            System.out.println("-------- chop onion ---------");
        }
        return true;
    }

    public boolean peelPotato() {
        for (int i = 0; i < 10; i++) {
            System.out.println("******* peel potato *******");
        }
        return true;
    }
}
