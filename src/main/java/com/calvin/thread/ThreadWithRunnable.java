package com.calvin.thread;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ThreadWithRunnable implements Runnable {
    private static final int[] NUMBERS = new int[] { 1, 2, 3};

    private final String name;

    @Override
    public void run() {
        System.out.println("Running 'runnable': " + name);
        synchronized (ThreadWithRunnable.NUMBERS) {
            for (int number : ThreadWithRunnable.NUMBERS) {
                System.out.println(number);
            }
        }
    }
}
