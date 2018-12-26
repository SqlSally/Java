public class Practice {

  static boolean isAnagram(String a, String b) {

    a = a.toLowerCase();
    b = b.toLowerCase();
    char[] c = a.toCharArray();
    sort(c);
    String e = new String(c);
    char[] d = b.toCharArray();
    sort(d);
    String f = new String(d);

    return e.equals(f);
  }

  private static void sort(char[] n) {

    for (int i = 0; i < n.length; i++) {
      char temp = n[i];
      int index = i;
      for (int j = i + 1; j < n.length; j++) {
        if (n[j] < temp) {
          temp = n[j];
          index = j;
        }
      }
      if (index != i) {
        n[index] = n[i];
        n[i] = temp;
      }
    }
  }

  
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    String a = scan.next();
    String b = scan.next();
    scan.close();
    boolean ret = isAnagram(a, b);
    System.out.println((ret) ? "Anagrams" : "Not Anagrams");
  }
}
