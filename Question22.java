package Program;

import java.util.Scanner;

public class Question22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. : ");
        int n = sc.nextInt();
        int nsp = 1;
        int nst = n-1;
        for (int i = 1; i <= 2 * n - 1; i++) {
            if(i==1 || i==2*n-1){
                for (int j = 1; j < 2*n; j++) {
                    System.out.print("*");
                }
            }
            else {
                for (int j = 1; j <= nst; j++) {
                    System.out.print("*");
                }
                for (int j = 1; j <= nsp; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= nst; j++) {
                    System.out.print("*");
                }
                if(i<n){
                    nst--;
                    nsp+=2;
                }
                else {
                    nst++;
                    nsp-=2;
                }
            }
            System.out.println();
        }
    }
}
