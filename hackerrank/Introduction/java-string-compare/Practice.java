public class Practice {

  public static String getSmallestAndLargest(String s, int k) {
    String smallest = "";
    String largest = "";

    // Complete the function
    // 'smallest' must be the lexicographically smallest substring of length 'k'
    // 'largest' must be the lexicographically largest substring of length 'k'
    smallest = s.substring(0, k);
    largest = s.substring(0, k);

    for (int i = 0; i < s.length() - k + 1; i++) {
      String n = s.substring(i, i + k);
      
      if (n.compareTo(smallest) < 0) {
        smallest = n;
      }
      if (n.compareTo(largest) > 0) {
        largest = n;
      }
    }
    return smallest + "\n" + largest;
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String s = scan.next();
    int k = scan.nextInt();
    scan.close();

    System.out.println(getSmallestAndLargest(s, k));
  }
}
