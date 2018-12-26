
import java.util.Scanner;


public class Practice {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String s = scan.nextLine();
    String replaceAll = s.replaceAll("[!,?._'@]", " ");

    String[] splitValue = replaceAll.split(" ");

    int result = 0;
    for (String ss : splitValue) {
      if (ss.trim().isEmpty()) {
        continue;
      }
      result++;
    }
    System.out.println(result);
    for (String ss : splitValue) {
      if (ss.trim().isEmpty()) {
        continue;
      }
      System.out.println(ss);
    }
    scan.close();
  }
}
