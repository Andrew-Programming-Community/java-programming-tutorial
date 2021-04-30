package basic;

public class FloatDemo {

  public static void main(String[] args) {
    double x = 1.0 / 10;
    System.out.println(x);

    double y = 1 - 9.0 / 10;
    System.out.println(y);

    if (Math.abs(x - y) < 0.001) {
      System.out.println("equal");
    }


  }

}
