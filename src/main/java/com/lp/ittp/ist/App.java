package com.lp.ittp.ist;

import java.util.ArrayList;
import java.util.List;

public class App {
  public static void main(String[] args) {
    mainLogic();
  }

  private static void mainLogic() {
    int[] array = new int[10];
    int counter = 0;
    for (int i = 0; i < array.length - 1; i++) {
      array[i] = i;
      counter++;
    }
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      list.add(i);
    }
    List<Character> listChar = new ArrayList<>();
    for (char i = 0; i < 10; i++) {
      listChar.add(i);
    }
    List<String> listString = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      listString.add(String.valueOf(i));
    }
    System.out.println("Hello World!");
  }
}
