/*
https://www.hackerrank.com/challenges/java-currency-formatter/problem?isFullScreen=true&h_r=next-challenge&h_v=zen
*/

public class Practice {

  public static void main(String[] args) throws ParseException {
    Scanner scanner = new Scanner(System.in);
    double payment = scanner.nextDouble();
    scanner.close();

    Locale locale = new Locale("en", "IN");

    System.out.println("US: " + NumberFormat.getCurrencyInstance(Locale.US).format(payment));
    System.out.println("India: " + NumberFormat.getCurrencyInstance(locale).format(payment));
    System.out.println("China: " + NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment));
    System.out.println("France: " + NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment));
  }

}
