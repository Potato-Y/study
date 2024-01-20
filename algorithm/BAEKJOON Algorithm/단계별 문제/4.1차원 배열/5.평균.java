import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int full = Integer.parseInt(sc.next());
        double max = 0;

        double[] num = new double[full];

        for (int i = 0; i < full; i++) {
            num[i] = Integer.parseInt(sc.next());
            if (max < num[i])
                max = num[i];
        }

        double allscore = 0;

        for (int i = 0; i < full; i++) {
            allscore = allscore + (num[i] * 100 / max);
        }

        System.out.println(allscore / full);
    }
}
