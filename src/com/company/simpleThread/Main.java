package com.company.simpleThread;

/**
 * Created by Piotr on 2017-05-05.
 */
public class Main {
    public static void main(String[] args) {

//        Random r = new Random();
//		Thread t1 = new Thread(){
//			@Override
//			public void run(){
//
//				for(int i = 0; i < 10; i++){
//					System.out.println("t1: " + i);
//					try {
//						Thread.sleep(r.nextInt(2000));
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//
//					}
//				}
//
//			}
//		};
//		Thread t2 = new Thread(){
//			@Override
//			public void run(){
//
//				for(int i = 0; i < 10; i++){
//					System.out.println("t2: " + i);
//					try {
//						Thread.sleep(r.nextInt(2000));
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//
//				}
//
//			}
//		};
//		t1.start();
//		t2.start();

        MyClass runnableClass = new MyClass();
        Thread t3 = new Thread((Runnable) runnableClass);
        t3.start();

        runnableClass.printInNewThread();

    }

}
