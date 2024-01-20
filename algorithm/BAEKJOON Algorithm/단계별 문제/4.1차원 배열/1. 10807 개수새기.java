import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int inNum = in.nextInt(); // 입력받을 숫자 갯수
        String[] num = in.nextLine().split(" ");

        int count = 0;

        String searchNum = in.nextLine();

        for (int i = 0; i < inNum; i++) {
            if (num[i] == searchNum)
                count++;
        }

        System.out.println(count);
    }
}
