import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int m=Integer.parseInt(sc.next());
        int h=Integer.parseInt(sc.next());
        
        h=h-45;
        if(h<0){
            h=60-Math.abs(h);
            m--;
            if(m==-1){
                m=23;
            }
        }
        
        System.out.println(m+" "+h);
    }
}