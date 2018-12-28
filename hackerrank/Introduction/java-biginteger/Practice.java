
import java.math.BigInteger;
import java.util.*;

public class Practice {
  
  public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
    Scanner scanner = new Scanner(System.in);
    String n = scanner.nextLine();
    String m = scanner.nextLine();
    BigInteger bigIntegerN, bigIntegerM;
    bigIntegerN = new BigInteger(n);
    
    bigIntegerM = new BigInteger(m);
    
    System.out.println(bigIntegerN.add(bigIntegerM));
    System.out.println(bigIntegerN.multiply(bigIntegerM));
    
  }
}
