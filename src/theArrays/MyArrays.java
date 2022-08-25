package theArrays;

import java.util.Arrays;

class MyArrays {

  public static void main(String[] args) {

    int capacity = 10;// size of the array
    String[] names = new String[capacity];// Initalising an array

    names[0] = "Bucky";//
    names[1] = "Jane";//

    System.out.println("Dsiplay array using to string method");
    System.out.println(Arrays.toString(names));
    System.out.println("\n");

    // assigning an array with known values
    int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

    // Using a loops
    for (int i = 0; i < nums.length; i++) {
      System.out.println(nums[i]);
    }

    // Enhance for loop
    for (int i : nums) {
      System.out.println(i);
    }

    // For each

    Arrays.stream(nums).forEach(System.out::println);

  }
}