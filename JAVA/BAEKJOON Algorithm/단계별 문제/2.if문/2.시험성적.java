import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=Integer.parseInt(sc.next());

        if(90<=a&&a<=100){
            System.out.println("A");
        }else if(80<=a&&a<90){
            System.out.println("B");
        }else if(70<=a&&a<80){
            System.out.println("C");
        }else if(60<=a&&a<70){
            System.out.println("D");
        }else{
            System.out.println("F");
        }
    }
}