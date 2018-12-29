
import java.util.*;

public class Solution {

  public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    ArrayList<Integer> arrayList = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      int m = scanner.nextInt();
      arrayList.add(m);
    }
    int q = scanner.nextInt();
    for (int j = 0; j < q; j++) {
      String input = scanner.next();
      if (input.equals("Insert")) {
        arrayList.add(scanner.nextInt(), scanner.nextInt());
        
      } else if (input.equals("Delete")) {
        arrayList.remove(scanner.nextInt());
        
      }
    }
    scanner.close();
    for (int z = 0; z < arrayList.size(); z++) {
      System.out.print(arrayList.get(z) + " ");
    }
  }
}
