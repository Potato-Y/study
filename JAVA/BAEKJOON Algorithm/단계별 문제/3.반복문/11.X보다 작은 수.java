import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.next());
        int xnum=Integer.parseInt(sc.next());
        int []num=new int[n];

        for(int i=0;i<n;i++){
            num[i]=Integer.parseInt(sc.next());
        }

        for(int i=0;i<n;i++){
            if(num[i]<xnum){
                System.out.print(num[i]+" ");
            }
        }


    }
}