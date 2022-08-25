package theArrays;

import java.util.Arrays;

public class CopyArrays {

  public static void main(String[] args) {
    // int[] newArray = { 1, 2, 3, 4, 5, 6 };
    // copyArrays(newArray);

    String[] newStringArray = { "Mango", "Oranges", "Banana", "PawPaw", "Apple", "Guyava" };

    copyArrayString(newStringArray);

  }

  public static void copyArrays(int[] array) {
    int[] copyArr = new int[array.length];
    copyArr = Arrays.copyOf(array, array.length);

    // if (array == copyArr) {
    // System.out.println("The two arrays are equal");
    // } else {
    // System.out.println("The two arrays are not equal");
    // }

    System.out.println("The Main Array is: " + Arrays.toString(array));
    System.out.println("The Copy Array is: " + Arrays.toString(copyArr));
  }

  public static void copyArrayString(String[] array) {
    String[] copyArr = new String[array.length];

    copyArr = array;

    if (array == copyArr) {
      System.out.println("The two arrays are equal");
    } else {
      System.out.println("The two arrays are not equal");
    }

    // System.out.println("The Main Array is: " + Arrays.toString(array));
    // System.out.println("The Copy Array is: " + Arrays.toString(copyArr));
  }
}
