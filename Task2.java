public class Task2 {
    public static void main(String[] args) {
        boolean check = true;
        for (int i = 2; i <= 1000; i++) {
            if (i == 2) {
                System.out.print("2, ");
            } else {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        check = false;
                    }
                }
                if (check == true) {
                    System.out.print(i + ", ");
                } else {
                    check = true;
                }
            }
        }
    }
}