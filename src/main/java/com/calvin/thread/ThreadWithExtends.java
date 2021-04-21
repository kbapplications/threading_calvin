package com.calvin.thread;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ThreadWithExtends extends Thread {
    private static final String[] LETTERS = new String[] { "X", "Y", "Z" };

    private final String tName;

    public void run() {
        System.out.println("Running 'extension': " + tName);
        synchronized (ThreadWithExtends.LETTERS) {
            for (String letter : ThreadWithExtends.LETTERS) {
                System.out.println(letter);
            }
        }
    }
}
