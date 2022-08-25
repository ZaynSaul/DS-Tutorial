package theArrays;

import java.util.Arrays;
import java.util.Random;

public class MaxMinArray {

  public static void main(String[] args) {
    int[] array = new int[10];
    Random rand = new Random();

    int j = 0;
    do {
      array[j] = 10 + rand.nextInt(30);
      j++;
    } while (j < array.length);
    System.out.println("The array values are: " + Arrays.toString(array));
    System.out.println("Minimun value from array is: " + minValue(array));
    System.out.println("Maximun value from array is: " + maxValue(array));
  }

  /**
   * Method to find the minimum element in the array
   * 
   * @param array
   * @return
   */
  public static int minValue(int[] array) {

    int min = array[0];
    int i = 0;
    do {
      if (array[i] < min) {
        min = array[i];
      }
      i++;
    } while (i < array.length);

    return min;
  }

  /**
   * Returns the the maximum value in an array
   * 
   * @param array
   * @return
   */
  public static int maxValue(int[] array) {

    int max = array[0];
    int i = 0;
    do {
      if (array[i] > max) {
        max = array[i];
      }
      i++;
    } while (i < array.length);

    return max;
  }
}
