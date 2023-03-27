import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter sign(+, -, *, /): ");
        String sign = sc.next();
        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();
        sc.close();
        if (sign.equals("+")) {
            int sum = a + b;
            System.out.print("Result = " + sum);
        } else if (sign.equals("-")) {
            int subtraction = a - b;
            System.out.print("Result = " + subtraction);
        } else if (sign.equals("*")) {
            int multiplication = a * b;
            System.out.print("Result = " + multiplication);
        } else if (sign.equals("/")) {
            int division = a / b;
            System.out.print("Result = " + division);
        } else {
            System.out.print("Error. Enter signs like +, -, *, /");
        }
    }
}
