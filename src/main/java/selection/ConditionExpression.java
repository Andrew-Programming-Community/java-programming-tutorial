package selection;

public class ConditionExpression {

  public static void main(String[] args) {
    int x = 0;
    int y;
    if (x > 0) {
      y = 1;
    } else {
      y = -1;
    }

    y = x > 0 ? 1 : -1;

    System.out.println(y);


    y = x > 0 ? x+1 : x-1;

    System.out.println(y);



  }

}
