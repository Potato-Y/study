import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.next().charAt(0);

            System.out.println(n);
            sc.close();
        }
    }
}