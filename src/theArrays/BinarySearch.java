package theArrays;

import java.util.Arrays;
import java.util.Random;

public class BinarySearch {
  private static int[] array;

  public static void main(String[] args) {
    fillArray();
    System.out.println("The array: " + Arrays.toString(array));

    if (binarySearch(2) != -1) {

      System.out.println("element found at idex: " + binarySearch(2));
    } else {
      System.out.println("Element not found");
    }
  }

  public static void fillArray() {
    array = new int[10];
    Random rand = new Random();

    for (int i = 0; i < array.length; i++) {
      array[i] = 1 + rand.nextInt(20);
    }

    Arrays.sort(array);
  }

  public static int binarySearch(int target) {
    int left = 0;
    int right = array.length - 1;

    int flag = -1;

    while (left <= right) {
      int midPoint = left + ((right - left) / 2);
      if (array[midPoint] == target) {
        return midPoint;
      } else if (array[midPoint] < target) {
        left = midPoint + 1;
      } else {
        right = midPoint - 1;
      }

    }
    return flag;
  }
}
