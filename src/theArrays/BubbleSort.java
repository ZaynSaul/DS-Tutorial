package theArrays;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {
  private int[] array;

  public void fillArray() {

    array = new int[10];
    Random random = new Random();
    int i = 0;
    while (i < array.length) {
      array[i] = 5 + random.nextInt(50);
      i++;
    }
  }

  public void swapEm(int i, int j) {
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }

  public void display(int pass, int position) {
    System.out.println(String.format("After passing %2d: ", pass));

    for (int i = 0; i < position; i++) {
      System.out.print(array[i] + ",    ");
    }
    System.out.print("*, ");// to show the position in which th value have been sawp from

    for (int i = position + 1; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }

    System.out.print("   ");
    for (int i = 0; i < position; i++) {
      System.out.print("    _ _");
    }
    System.out.println("\n");

  }

  public void sortEm() {

    for (int i = 0; i < array.length; i++) {

      int j;
      for (j = 1; j < array.length; j++) {
        if (array[j] < array[j - 1]) {

          swapEm(j, j - 1);
        }
      }
    }

  }

  public String toString() {
    return Arrays.toString(array);
  }

  public static void main(String[] args) {
    BubbleSort order = new BubbleSort();
    order.fillArray();

    System.out.println("Before sort: " + order.toString());

    order.sortEm();
    System.out.println("After sort: " + order.toString());
  }
}
