import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int in = Integer.parseInt(sc.next());
        int n1 = in / 10;
        int n2 = in - n1 * 10;
        int count = 0;
        int algorithmNum;
        int newNum;

        if(in<10){
            n1=0;
            n2=in;
        }

        while (true) {
            algorithmNum = n1 + n2;
            if (algorithmNum > 9) {
                algorithmNum = algorithmNum % 10;
            }
            newNum = n2 * 10 + algorithmNum;

            count++;
            if (in == (newNum)) {
                break;
            }
            n1 = newNum / 10;
            n2 = newNum - n1 * 10;
        }

        System.out.println(count);

    }
}
