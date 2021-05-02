package string;

public class StringDemo {

  public static void main(String[] args) {

    String message = "Welcome to Java!";

    System.out.println(message.length());
    System.out.println(message.charAt(2));
    String concatMessage = message.concat("Andrew");
    System.out.println(concatMessage);
    System.out.println(message);

    System.out.println(message.toUpperCase());
    System.out.println(message.toLowerCase());

    String messageWithBlank = " \tWelcome\n     ";
    System.out.println(messageWithBlank);
    System.out.println(messageWithBlank.trim());


  }

}
