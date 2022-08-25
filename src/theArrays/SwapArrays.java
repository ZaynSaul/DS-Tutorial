package theArrays;

import java.util.Arrays;

public class SwapArrays {

  public static void main(String[] args) {

    int[] arr = { 5, 4, 3, 2, 1 };
    // System.out.println("Array before swap: " + Arrays.toString(arr));
    int j = 0;

    while (j < arr.length - 1) {
      int i = 1;
      while (i < arr.length) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;

        i++;
      }
      j++;
    }

    System.out.println("Array after swap: " + Arrays.toString(arr));
  }
}
