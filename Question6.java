package Program;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. : ");
        int n=sc.nextInt();
        int nst=n+2;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nst; j++) {
                System.out.print("* ");
            }
            if( i==n-1) nst=n+2;
            else nst=n-2;
            System.out.println();
        }
    }
}
