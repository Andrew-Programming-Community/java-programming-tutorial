package string;

import java.util.Scanner;

public class ReadStringFromConsole {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
//    String s1 = input.next();
//    String s2 = input.next();
//    String s3 = input.next();
//
//    System.out.println("s1 is " + s1);
//    System.out.println("s2 is " + s2);
//    System.out.println("s3 is " + s3);

    String s4 = input.nextLine();
    char ch=s4.charAt(0);
    System.out.println(ch);
  }

}
