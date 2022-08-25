package theArrays;

import java.util.Arrays;
import java.util.Random;

public class InsertionSort {
  private int[] array;

  public static void main(String[] args) {
    InsertionSort sort = new InsertionSort();

    sort.fillArray(10);

    System.out.println("Before sorting: " + sort.toString());
    sort.sortEm();
    System.out.println("After sorting: " + sort.toString());

  }

  public void fillArray(int capacity) {
    Random rand = new Random();
    array = new int[capacity];

    int i = 0;

    do {
      array[i] = 1 + rand.nextInt(50);
      i++;
    } while (i < capacity);
  }

  public void sortEm() {

    for (int i = 1; i < array.length; i++) {
      int currentValue = array[i];// to store the current value in a temporary variable

      int j = i - 1;// in each step move back to the beginning before the current value
      while (j >= 0 && array[j] > currentValue) {
        array[j + 1] = array[j];// to shif the value towards the right
        j--;// to move back to the beginning of the array
      }

      array[j + 1] = currentValue;// to replace the value on first position with the current value
    }
  }

  public String toString() {
    return Arrays.toString(array);
  }

}
