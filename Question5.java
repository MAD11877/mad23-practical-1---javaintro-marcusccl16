import java.util.Scanner;

public class Question5
{
  public static void input(String[] args)
  {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int number = in.nextInt();
    ArrayList<Integer> holdnumbers = new ArrayList<Integer>();
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
    for (int x=0, x<number,x++){
      String comparingnum = String.format("Number #%d: ",holdnumbers.size()+1);
      System.out.print(comparingnum);
      int integer = in.nextInt();
      holdnumbers.add(integer);
    }
    int[] numarray = numbers.toArray(new int[0]);
    HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();
    int max = 1;
    int largestnum = 0;
    for (int a = 0; a < holdnumbers.size(); a++){

      if (hash.get(numarray[a]) != null){

        int count = hash.get(numarray[a]);
        count++;
        hash.put(numarray[a],count);

        if (count > max){
          max = count;
          largestnum = numarray[a];
        }
      }
  }


}
