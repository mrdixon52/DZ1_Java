import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();
        sc.close(); 
        int trianglNum = 0;
        int factorial = 1;
        for (int i = 0; i <= n;  i++){
            trianglNum = trianglNum + i;
        }
        for (int j = 1; j <= n; j++){
            factorial = factorial * j;
        }
        System.out.println("Triangular number = " + trianglNum);
        System.out.println("Factorial n = " + factorial);
    }
}