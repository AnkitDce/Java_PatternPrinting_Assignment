package Program;

import java.util.Scanner;

public class Question21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. : ");
        int n = sc.nextInt();
        int nsp = n+1;
        for (int i = 1; i <= n-1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= nsp; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            nsp -=2;
            System.out.println();
        }
        nsp=1;
        for (int i = 0; i < 2; i++) {
            for (int j = 1; j < 2*n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= n-1; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= nsp; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= n-i; j++) {
                System.out.print("* ");
            }
            nsp +=2;
            System.out.println();
        }
    }
}
