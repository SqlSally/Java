
import java.util.*;

public class Practice {

  public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner scanner = new Scanner(System.in);
    Integer n = scanner.nextInt();
    ArrayList<Integer> arrayList[] = new ArrayList[n];
    int i, j, g, k;

    for (i = 0; i < n; i++) {
      Integer m = scanner.nextInt();
      arrayList[i] = new ArrayList<>();
      for (j = 0; j < m; j++) {
        arrayList[i].add(scanner.nextInt());
      }
    }

    Integer q = scanner.nextInt();
    for (g = 0; g < q; g++) {
      for (k = 0; k < n; k++) {
      try {
        Integer result = arrayList[scanner.nextInt() -1].get(scanner.nextInt()-1);
          System.out.println(result);
        } catch (IndexOutOfBoundsException e) {
          System.out.println("ERROR!");
        }
      }
    }
  }
}
