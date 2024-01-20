package Program;

import java.util.Scanner;

public class NumberTriangle2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of rows : ");
        int n=sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i+1-j+" ");
            }
            System.out.println();
        }
    }
}
