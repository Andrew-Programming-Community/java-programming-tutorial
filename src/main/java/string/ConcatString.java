package string;

public class ConcatString {

  public static void main(String[] args) {
    String s1 = "Hello ";
    String s2 = "Java!";
    String s4 = "Andrew";
    String s3 = s1 + s2 + s4;
    System.out.println(s3);

    String s5 = "111" + 123;
    System.out.println("s5=" + s5);

    s1+=s4;//s1=s1+s4
    System.out.println(s1);

    int i=1,j=2;

    System.out.println("i+j is"+i+j);
    System.out.println("i+j is"+(i+j));

  }

}
