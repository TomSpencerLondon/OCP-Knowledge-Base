package com.codurance.conditionals;

public class Conditional {

  public static void someMethod() {
    if (hello()){
      System.out.println("Hello");
    }

    boolean a = false;
    boolean b = true;

    if (a = b) {
      System.out.println("a = b");
    }
  }

  private static boolean hello() {
    return true;
  }

  public static void main(String[] args) {
    someMethod();
  }
}
