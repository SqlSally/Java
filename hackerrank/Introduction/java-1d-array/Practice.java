import java.util.*;

public class Practice {

    public static void main(String[] args) {
	   
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for(int j =0; j<n ;j++){
          int m = scan.nextInt();
          a[j] = m;
        }
            
        scan.close();
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
