import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int n=Integer.parseInt(sc.next());
        int [][] save=new int[n][2];
        for(int i=0;i<n;i++){
            save[i][0]=Integer.parseInt(sc.next());
            save[i][1]=Integer.parseInt(sc.next());
        }
        
        for(int i=0;i<n;i++){
            System.out.println(save[i][0]+save[i][1]);
        }
    }
}