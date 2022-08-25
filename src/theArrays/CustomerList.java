package theArrays;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerList {
  public static void main(String[] args) {
    ArrayList<String> customerList = new ArrayList<String>();

    Scanner scan = new Scanner(System.in);

    while (true) {
      System.out.print("Want to add a customer Enter Yes or No: ");
      String action = scan.nextLine();

      action = action.substring(0, 1).toLowerCase();
      if (action.equals("y")) {
        System.out.print("Enter customer Name: ");
        String fullName = scan.nextLine();
        customerList.add(fullName);
      } else if (action.equals("n")) {
        break;
      } else {
        System.out.println("Please enter Yes or No to proceed...");
        continue;
      }
    }

    for (String names : customerList) {
      System.out.println(names);
    }
    scan.close();
  }
}
