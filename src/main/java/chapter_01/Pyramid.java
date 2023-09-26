package chapter_01;

/** Created by tomatojams on 2023-09-14 */
public class Pyramid {

  public static void main(String[] args) {

    for (int i = 1; i <= 9; i = i + 2) {
      int space = (9 - i) / 2;
      for (int j = 0; j < space; j++) {
        System.out.print(" ");
      }
      for (int k = 0; k < i; k++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
