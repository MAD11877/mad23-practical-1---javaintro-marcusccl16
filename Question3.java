import java.util.Scanner;

public class Question3
{
  public static void main(String[] args)
  {
    /**
     * Reads integer entered by the user, multiplies the integer by itself and print out the result.
     * 
     * Hint: in.nextInt() to read integer
     */
    Scanner reader= new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = reader.nextInt();
    int output = number * number;
    System.out.println(output);
  }
}
