package com.calvin.thread;

public class ThreadWithExtends extends Thread {
    private static final String[] LETTERS = new String[] { "X", "Y", "Z" };

    public void run() {
        for(String letter : ThreadWithExtends.LETTERS) {
            System.out.println(letter);
        }
    }
}
