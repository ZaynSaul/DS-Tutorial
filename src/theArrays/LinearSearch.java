package theArrays;

import java.util.Random;

public class LinearSearch {

  private static int[] array;

  public static void main(String[] args) {
    fillArray(10);

    System.out.println("Values \t position");
    findElement(2);
  }

  public static void fillArray(int size) {
    Random random = new Random();

    array = new int[size];

    for (int i = 0; i < size; i++) {
      array[i] = 1 + random.nextInt(20);
    }
  }

  public static void findElement(int element) {

    boolean isFound = false;
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " <---------> " + i);
      if (array[i] == element) {
        System.out.println("  <== found element in position " + i);
        isFound = true;
      }
      System.out.println();

    }

    if (isFound == false) {
      System.out.println("------------------------");
      System.out.println("| -1 Element not found |");
      System.out.println("------------------------");
    }
  }

}
