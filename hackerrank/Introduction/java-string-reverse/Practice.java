public class Practice {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String A = sc.next();
    /* Enter your code here. Print output to STDOUT. */
    String B = "";
    for (int i = 0; i < A.length(); i++) {
      char n = A.charAt(A.length() - 1 - i);
      B = B + n;
    }
    if (A.equals(B)) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
