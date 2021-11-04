import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        int a,b;

        a=Integer.parseInt(sc.next());
        b=Integer.parseInt(sc.next());

        if(a>b){
            System.out.println(">");
        }else if (a<b){
            System.out.println("<");
        }else if(a==b){
            System.out.println("==");
        }
    }
}