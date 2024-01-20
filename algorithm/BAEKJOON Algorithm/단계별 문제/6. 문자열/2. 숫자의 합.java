import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            String num = sc.next();
            int total = 0;
            for (int i = 0; i < n; i++) {
                total += Character.getNumericValue(num.charAt(i));
            }

            System.out.println(total);
            sc.close();
        }
    }
}