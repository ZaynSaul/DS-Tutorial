package theArrays;

import java.util.Arrays;

public class ReverseArray {

  public static void main(String[] args) {

    int[] array = { 1, 2, 3, 4, 5, 6 };

    reverseArr(array);

  }

  public static void reverseArr(int[] array) {

    for (int i = 0; i < array.length / 2; i++) {
      int item = array[i];
      array[i] = array[array.length - i - 1];
      array[array.length - i - 1] = item;
    }
    System.out.println(Arrays.toString(array));
  }
}
