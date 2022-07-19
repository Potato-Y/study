import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int full = Integer.parseInt(sc.next());
        int bigNum;
        int smallNum;
        int[] num= new int[full];

        for(int i=0;i<full;i++){
            num[i]=Integer.parseInt(sc.next());
        }
        bigNum=num[0];
        smallNum=num[0];

        for(int i=0;i<full;i++){
            if(num[i]>bigNum) bigNum=num[i];
            if(num[i]<smallNum) smallNum=num[i];
        }

        System.out.println(smallNum+" "+bigNum);
        
    }
}