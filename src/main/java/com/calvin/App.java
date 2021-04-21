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
        ThreadWithExtends thread = new ThreadWithExtends("Thread with Extends");
        thread.start();
    }
}
