package string;

public class ConvertStringAndNumber {

  public static void main(String[] args) {
    String s1 = "123";
    int intValue = Integer.parseInt(s1);
    System.out.println(intValue);

    System.out.println(Double.parseDouble(s1));

    String s2 = 123 + "";
    System.out.println(s2);

  }

}
