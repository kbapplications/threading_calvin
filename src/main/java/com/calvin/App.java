package com.calvin;

import com.calvin.thread.ThreadWithExtends;
import com.calvin.thread.ThreadWithRunnable;

/**
 * Hello world!
 *
 */
public class App 
{
    public static final int REPEATS = 10;

    public static void main( String[] args )
    {
        Runnable runnable = new ThreadWithRunnable();
        for(int i = 0; i < App.REPEATS; i++) {
            Thread thread = new Thread(runnable);
            thread.start();
        }
    }
}
