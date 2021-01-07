import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);
        int a;
        int b;

        ArrayList<Integer> aList=new ArrayList<Integer>();
        ArrayList<Integer> bList=new ArrayList<Integer>();
        
        while(true){
            a=Integer.parseInt(sc.next());
            b=Integer.parseInt(sc.next());
            if(a==0&&b==0){
                break;
            }
            aList.add(a);
            bList.add(b);
        }

        for(int i=0;i<aList.size();i++){
            System.out.println(aList.get(i)+bList.get(i));
        }


    }
}
