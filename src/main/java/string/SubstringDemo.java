package string;

public class SubstringDemo {

  public static void main(String[] args) {
    String message = "Welcome to Java!";
    System.out.println(message.substring(0, 11));
    System.out.println(message.substring(11));
    System.out.println(message.substring(0));

    String name = "Andrew Programing";

    int k = name.indexOf(' ');
    String firstName = name.substring(0, k);
    String lastName = name.substring(k + 1);

    System.out.println("first name:" + firstName + " last name:" + lastName);


  }

}
