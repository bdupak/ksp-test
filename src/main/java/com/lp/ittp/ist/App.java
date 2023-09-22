package com.lp.ittp.ist;

public class App {
  public static void main(String[] args) {
    int[] array = new int[10];
    int counter = 0;
    for (int i = 0; i < array.length - 1; i++) {
      array[i] = i;
      counter++;
    }
    System.out.println("Hello World!");
  }
}
