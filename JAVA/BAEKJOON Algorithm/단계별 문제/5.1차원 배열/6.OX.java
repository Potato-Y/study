import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int full = Integer.parseInt(sc.next());
        String[] ox = new String[full];
        int[] score = new int[full];
        int count=1;
        char o='O';

        for(int i=0;i<full;i++){
            ox[i]= sc.next();
        }

        for (int i = 0; i < full; i++) {
            for (int n = 0; n < ox[i].length(); n++) {
                if (o==ox[i].charAt(n)){
                    score[i]+=count;
                    count++;
                }else {
                    count=1;
                }
            }
            System.out.println(score[i]);
            count=1;
        }
    }
}
