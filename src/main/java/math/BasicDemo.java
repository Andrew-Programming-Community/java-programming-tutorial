package math;

public class BasicDemo {

  public static void main(String[] args) {
    System.out.println(Math.sin(0));
    System.out.println(Math.cos(0));

    System.out.println(Math.sin(Math.PI / 2));

    System.out.println(Math.exp(1));
    System.out.println(Math.log(Math.E));

    System.out.println(Math.pow(2, 3));
    System.out.println(Math.sqrt(4));

    System.out.println(Math.ceil(2.1));
    System.out.println(Math.floor(2.1));
    System.out.println(Math.rint(2.1));
    System.out.println(Math.round(2.1));

    System.out.println(Math.max(10, 100));
    System.out.println(Math.min(10, 100));

    System.out.println(Math.abs(-1000));
    for (int i = 0; i < 5; i++) {
      System.out.println((int)(Math.random() * 10));
    }

    for (int i = 0; i < 5; i++) {
      System.out.println(50+(int)(Math.random() * 50));
    }


  }
}
