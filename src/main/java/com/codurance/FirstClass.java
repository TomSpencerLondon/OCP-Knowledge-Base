package com.codurance;

public class FirstClass {
  // Java program - start a process
  // Java can run 100s of threads
  // JVM - designates one thread and runs code
  // in the main method

  public static void main(String[] args) {

    // This thread takes time to spawn
    Runnable runnable = new Runnable() {
      @Override
      public void run() {
        System.out.println("Hello from runnable 1");
      }
    };

    Thread thread = new Thread(runnable);
    thread.start();

    System.out.println("Hello world!");
  }
}
