package com.calvin.thread;

public class ThreadWithRunnable implements Runnable {
    private static final int[] NUMBERS = new int[] { 1, 2, 3};

    @Override
    public void run() {
        for(int number : ThreadWithRunnable.NUMBERS) {
            System.out.println(number);
        }
    }
}
