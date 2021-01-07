import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=Integer.parseInt(sc.next());
        String []text=new String[a];


        for(int i=0;i<a;i++){
            text[i]="";
            for(int b=0;b<=i;b++){
                text[i]+="*";
            }
        }

        String l="%"+a+"s";

        for(int i=0;i<a;i++){
            System.out.printf(l,text[i]);
            System.out.println();
        }

    }
}