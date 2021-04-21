package com.calvin.thread;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Data
public class ThreadWithExtends extends Thread {

    private static final int REPEATS = 10;
    private static final String[] LETTERS = new String[] { "X", "Y", "Z" };

    private final String threadname;

    public void run() {
        for(String letter : ThreadWithExtends.LETTERS) {
            System.out.println(letter);
        }
    }

    public void start() {
        System.out.println("Starting " + threadname);
        for(int i = 1; i <= ThreadWithExtends.REPEATS; i++) {
            Thread t = new Thread(this, threadname);
            t.start();
        }
    }
}
