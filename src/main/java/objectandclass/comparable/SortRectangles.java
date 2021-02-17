package objectandclass.comparable;

import java.util.Arrays;

public class SortRectangles {

  public static void main(String[] args) {
    ComparableRectangle[] rectangles = {
        new ComparableRectangle(3.4, 5.4),
        new ComparableRectangle(13.24, 55.4),
        new ComparableRectangle(7.4, 35.4),
        new ComparableRectangle(1.4, 25.4),
    };

    Arrays.sort(rectangles);
    for (Rectangle rectangle : rectangles) {
      System.out.println(rectangle + " ");
      System.out.println();
    }
  }
}
