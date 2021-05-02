package string;

public class StringCompare {

  public static void main(String[] args) {
    String s1 = "Java";
    String s2 = "java";
    String s3 = "java";

    boolean b1 = s1.equals(s2);
    System.out.println(b1);
    System.out.println(s2.equals(s3));

    //如果比较操作符两边的操作数是引用类型，那么比较的是这两个引用类型所指向的对象的地址
    //System.out.println(s1==s2);

    System.out.println(s1.equalsIgnoreCase(s2));

    int r = s1.compareTo(s2);
    System.out.println("r=" + r);
    System.out.println(s1.compareToIgnoreCase(s2));

    System.out.println(s1.startsWith("ja"));
    System.out.println(s1.endsWith("Va"));

    System.out.println(s1.startsWith("va",2));
    System.out.println(s1.contains("ava"));
  }

}
