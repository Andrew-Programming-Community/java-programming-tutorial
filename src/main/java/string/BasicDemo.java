package string;

public class BasicDemo {

  public static void main(String[] args) {
    String s1 = "Welcome";
    String s2 = "welcome";
//    a.检査s1和s2 是否相等，然后将结果赋值给一个布尔变量isEqual。
    boolean isEqual = s1.equals(s2);
//
//    b.在忽略大小写的情况下检査s1 和s2 是否相等，然后将结果赋值给一个布尔变量isEqual1。
    boolean isEqual1 = s1.equalsIgnoreCase(s2);
//
//    c.比较s1和s2, 然后将结果赋值给一个整型变量x1。
    int x1 = s1.compareTo(s2);
//
//    d.在忽略大小写的情况下比较s1 和s2, 然后将结果赋值给一个整型变量x2。
    int x2 = s1.compareToIgnoreCase(s2);
//
//    c.检査s1 是否有前缀"AAA", 然后将结果赋值给一个布尔变量b1。
    boolean b1 = s1.startsWith("AAA");
//
//    f.检査s1 是否有后缀"AAA", 然后将结果赋值给一个布尔变量b2。
    boolean b2 = s1.endsWith("AAA");
//
//    g. 将s1 的长度赋值给一个整型变量x3。
    int x3 = s1.length();
//
//    h.将s1的第一个字符赋值给一个字符型变量x4。
    char x4 = s1.charAt(0);
//
//    i.创建新字符串s3, 它是s1和s2的组合。
    String s3 = s1 + s2;
//
//    j.创建s1 的子串，下标从1开始。
    s1.substring(1);
//
//    k.创建s1 的子串，下标从1到4。
    s1.substring(1, 5);
//
//    l.创建新字符串s4, 它将s1转换为小写。
    String s4 = s1.toLowerCase();
//
//    m.创建新字符串s5, 它将s1转换为大写。
    String s5 = s1.toUpperCase();
//
//    n.创建新字符串s6 , 它将s1两端的空白字符去掉。
    String s6 = s1.trim();
//
//    o.将s1中第一次出现的字符 e 的下标赋值给一个int型变量x5。
    int x5 = s1.indexOf('e');
//
//    p.将s1中最后一次出现的字符串abc的下标赋值给一个int型变量x6。
    int x6 = s1.indexOf("abc");

  }


}
