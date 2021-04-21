package com.calvin;

import com.calvin.thread.ThreadWithExtends;

/**
 * Hello world!
 *
 */
public class App 
{
    public static final int REPEATS = 10;

    public static void main( String[] args )
    {
        for(int i = 0; i < App.REPEATS; i++) {
            Thread thread = new ThreadWithExtends();
            thread.start();
        }
    }
}
