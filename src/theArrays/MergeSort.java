package theArrays;

import java.util.Arrays;
import java.util.Random;

public class MergeSort {

  public void sortEm(int[] array) {
    if (array.length < 2) {
      return;
    }
    int[] left = new int[array.length / 2];
    int[] right = new int[array.length - left.length];

    for (int i = 0; i < left.length; i++) {
      left[i] = array[i];
    }

    for (int i = left.length; i < array.length; i++) {
      right[i - left.length] = array[i];
    }

    sortEm(left);
    sortEm(right);

    merge(left, right, array);
  }

  public void merge(int[] left, int[] right, int[] array) {
    int i = 0;
    int j = 0;
    int k = 0;

    while (i < left.length && j < right.length) {

      if (left[i] <= right[j]) {
        array[k] = left[i];
        i++;
      } else {
        array[k] = right[j];
        j++;
      }
      k++;
    }

    while (i < left.length) {
      array[k] = left[i];
      k++;
      i++;
    }

    while (j < right.length) {
      array[k] = right[j];
      k++;
      j++;
    }
  }

  public static void main(String[] args) {
    int size = 10;
    int[] array = new int[size];
    Random rand = new Random();

    for (int i = 0; i < array.length; i++) {
      array[i] = 1 + rand.nextInt(20);
    }

    MergeSort sort = new MergeSort();

    System.out.println("Before sort: " + Arrays.toString(array));

    sort.sortEm(array);

    System.out.println("After sort: " + Arrays.toString(array));
  }
}
