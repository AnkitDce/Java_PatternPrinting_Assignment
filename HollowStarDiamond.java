package Program;

import java.util.Scanner;

public class HollowStarDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. : ");
        int n = sc.nextInt();
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < 2*n-1; j++) {
                if(i+j==n+1 || i+n==j+1) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2*n-1; j++) {
                if(i==j || j==2*n-i) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
