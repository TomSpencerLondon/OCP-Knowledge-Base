package com.codurance.outer;

public class OuterClass {
  String outerField = "Outer field";
  static String staticOuterField = "Static outer field";

  class InnerClass {
    void accessMembers() {
      System.out.println(outerField);
      System.out.println(staticOuterField);
    }
  }

  static class StaticNestedClass {
    void accessMembers(OuterClass outer) {
      // Compiler error: cannot make a static reference to the non-static
      // field outerField
    }
  }
}
