import java.util.Scanner;

public class Question4 {
  public static void triangle(int x) {
    int rows, stars;

    for (rows = x; rows > 0; rows--) {


      for (stars = x; stars >= 0; stars--) {

        System.out.print("* ");
      }

      System.out.println();

    }
    public static void main(String[] args){

      Scanner reader = new Scanner(System.in);
      System.out.print("Enter a number: ");
      int number = reader.nextInt();
      triangle(number);
    }
  }
}
