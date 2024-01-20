import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int repeat = in.nextInt();
        for (int i = 0; i < repeat; i++) {
            int charRepeat = in.nextInt();
            String s = in.next();

            for (int i2 = 0; i2 < s.length(); i2++) {
                for (int i3 = 0; i3 < charRepeat; i3++) {
                    System.out.print(s.charAt(i2));
                }
            }
            System.out.println();
        }
    }
}
