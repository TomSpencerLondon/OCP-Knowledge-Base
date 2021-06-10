package com.codurance;

import static java.lang.System.out;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import javax.print.DocFlavor.STRING;

public class FirstClass {
  // Java program - start a process
  // Java can run 100s of threads
  // JVM - designates one thread and runs code
  // in the main method

  public static void main(String[] args) throws ExecutionException, InterruptedException {
    boolean isException = false;
    // This thread takes time to spawn
    Thread thread = new Thread(() -> out.println("Hello from runnable 1"));
    thread.start();

    Callable<String> callable = () -> {
      if (isException){
        throw new Exception();
      }
      return "Completed call";
    };

    ExecutorService executor = Executors.newFixedThreadPool(2);
    Future<String> submitted = executor.submit(callable);

    out.println(submitted.get());


    out.println("Hello world!");

    executor.shutdown();
  }
}
