import java.text.DecimalFormat;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int fullline = sc.nextInt();
        double[] ratio = new double[fullline];

        for (int i = 0; i < fullline; i++) {
            int maxpe = Integer.parseInt(sc.next());
            double averageScore = 0;
            double[] tempScore = new double[maxpe];
            for (int n = 0; n < maxpe; n++) {
                int in = sc.nextInt();
                averageScore += in;
                tempScore[n] = in;
            }
            averageScore /= maxpe;
            int count = 0;
            for (int n = 0; n < maxpe; n++) {
                if (tempScore[n] > averageScore)
                    count++;
            }
            ratio[i] = ((double) count / (double) maxpe) * 100;
        }

        DecimalFormat format = new DecimalFormat();
        format.applyLocalizedPattern("0.000");
        for (int i = 0; i < fullline; i++) {
            System.out.println(format.format((double) Math.round(ratio[i] * 1000) / 1000) + "%");
        }

    }
}
