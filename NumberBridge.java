package Program;

import java.util.Scanner;

public class NumberBridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of rows : ");
        int n = sc.nextInt();
        // for first line
        int a=1;
        for (int i = 1; i <= 2*n-1; i++) {
            System.out.print(a+" ");
            if(i<n) a++;
            else a--;
        }
        System.out.println();
        // for next
        for (int i = 1; i <= n-1; i++) {
            a=1;
            for (int j = 1; j <= n-i; j++) {
                System.out.print(a+" ");
                a++;
            }
            for (int j = 1; j <=2*i-1; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= n-i; j++) {
                a--;
                System.out.print(a+" ");
            }
            System.out.println();
        }
    }
}
