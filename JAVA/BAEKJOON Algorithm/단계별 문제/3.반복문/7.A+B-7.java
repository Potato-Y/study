import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int n=Integer.parseInt(sc.next());
        int [][]num=new int[n][2];
        for(int i=0;i<n;i++){
            num[i][0]=Integer.parseInt(sc.next());
            num[i][1]=Integer.parseInt(sc.next());
        }
        for(int i=0;i<n;i++){
            System.out.println("Case "+"#"+(i+1)+": "+(num[i][0]+num[i][1]));
        }
    }
}