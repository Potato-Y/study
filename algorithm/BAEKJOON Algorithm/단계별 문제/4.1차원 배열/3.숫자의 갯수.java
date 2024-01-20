import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] num = new int[4];
        String calNum;
        for (int i = 0; i < 3; i++) {
            num[i] = Integer.parseInt(sc.next());
        }

        num[3] = num[0] * num[2] * num[1];
        calNum = Integer.toString(num[3]);

        int count = 0;
        for (int i = 0; i < 10; i++) {
            for (int i1 = 0; i1 < calNum.length(); i1++) {
                char sh = Integer.toString(i).charAt(0);
                if (sh == calNum.charAt(i1))
                    count++;
            }
            System.out.println(count);
            count = 0;
        }

    }
}