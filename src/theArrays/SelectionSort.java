package theArrays;

import java.util.Arrays;
import java.util.Random;

public class SelectionSort {
  private int[] array;// decalring array

  /**
   * Method to fill array with random variables base on size
   */

  public void fillArray(int capacity) {
    Random rand = new Random();
    array = new int[capacity];

    int i = 0;

    do {
      array[i] = 10 + rand.nextInt(50);
      i++;
    } while (i < capacity);
  }

  /*
   * Method to swap array elements
   */

  public void swapArray(int i, int j) {
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }

  /*
   * Method to display passed elements
   */

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

  /**
   * Method to sort the array
   */

  public void sortArray() {
    int minPos;
    int i;
    for (i = 0; i < array.length - 1; i++) {
      minPos = i;
      for (int j = i + 1; j < array.length; j++) {
        if (array[j] < array[minPos]) {
          minPos = j;
        }
      }
      swapArray(i, minPos);// Calling swap method

      display(i + 1, minPos);
    }
  }

  /**
   * To convert array to string format
   */

  public String toString() {
    return Arrays.toString(array);
  }

  /**
   * Main method to run the application
   */

  public static void main(String[] args) {
    SelectionSort sortArray = new SelectionSort();

    sortArray.fillArray(6);
    System.out.println("Before sorting: " + sortArray.toString());
    sortArray.sortArray();
    System.out.println("After sorting: " + sortArray.toString());
  }
}
