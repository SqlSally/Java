
import java.util.*;

public class Practice {

  public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner scanner = new Scanner(System.in);
    Integer n = scanner.nextInt();
    String space = scanner.nextLine();
    String input = scanner.nextLine();
    String[] spaceArray = input.split(" ");
    int[] array = new int[n];
    for (int j = 0; j < n; j++) {
      array[j] = Integer.parseInt(spaceArray[j]);
    }

    int result = 0;
    for (int i = 0; i < array.length; i++) {
      int sum = 0;
      for (int j = i; j < array.length; j++) {
        sum = sum + array[j];
        if (sum < 0) {
          result++;
        }
      }
    }
    System.out.println(result);
  }

}
