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
        for(int i = 1; i <= App.REPEATS; i++) {
            Runnable runnable = new ThreadWithRunnable("Thread #" + i);
            Thread thread = new Thread(runnable);
            thread.start();
            new ThreadWithExtends("Thread #" + i).start();
        }
    }
}
