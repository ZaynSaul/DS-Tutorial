package theArrays;

import java.util.Arrays;
import java.util.Random;

public class FillingArrays {

  public static void main(String[] args) {
    int[] array = new int[5];
    // Filling an array
    for (int i = 1; i < array.length; i++) {

      array[i] = i * i;
    }

    System.out.println("array: " + Arrays.toString(array) + "\n");

    // Filling array with random values
    Random rand = new Random();
    int[] numbers = new int[10];
    int j = 0;
    do {
      numbers[j] = 10 + rand.nextInt(100);
      j++;
    } while (j < numbers.length);

    System.out.println("Array with random numbers: " + Arrays.toString(numbers));

  }
}
