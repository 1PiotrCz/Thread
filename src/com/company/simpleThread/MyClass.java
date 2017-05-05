package com.company.simpleThread;

/**
 * Created by Piotr on 2017-05-05.
 */
public class MyClass {
    int[] array = {1, 4, 6, 3, 6, 87, 3, 7, 8, 3, 79, 3, 2};


  @Override
    public void run() {
        for (int number : array) {
            System.out.println(number);
        }
    }

    public void printInNewThread() {

        new Thread((Runnable) this).start();

    }
}

