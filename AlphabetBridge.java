package Program;
import java.util.Scanner;
public class AlphabetBridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of rows : ");
        int n = sc.nextInt();
        // for first line
        for (int i = 1; i <= 2*n-1; i++) {
            System.out.print((char)(i+64)+" ");
        }
        System.out.println();
        // for next
        for (int i = 1; i <= n-1; i++) {
            int a=65;
            for (int j = 1; j <= n-i; j++) {
                System.out.print((char)(a)+" ");
                a++;
            }
            for (int j = 1; j <=2*i-1; j++) {
                System.out.print("  ");
                a++;
            }
            for (int j = 1; j <= n-i; j++) {
                System.out.print((char)(a)+" ");
                a++;
            }
            System.out.println();
        }
    }
}
