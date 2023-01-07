import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] num = new int[10];
        int[] calnum = new int[10];
        for (int i = 0; i < 10; i++) {
            num[i] = Integer.parseInt(sc.next());
        }

        for (int i = 0; i < 10; i++) {
            calnum[i] = num[i] % 42;
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            for (int i1 = 0; i1 < 10; i1++) {
                if (!list.contains(calnum[i]))
                    if (calnum[i] == calnum[i1]) {
                        list.add(calnum[i]);
                        break;
                    }
            }
        }

        System.out.println(list.size());
    }
}
