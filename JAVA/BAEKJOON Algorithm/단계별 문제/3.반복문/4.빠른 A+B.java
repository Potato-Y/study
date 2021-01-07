import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        try{
            int n=Integer.parseInt(br.readLine());    
            
            int [][]num=new int[n][2];
            
            for(int i=0;i<n;i++){
                String buffer=br.readLine();
                num[i][0]=Integer.parseInt(buffer.split(" ")[0]);
                num[i][1]=Integer.parseInt(buffer.split(" ")[1]);
            }
            
            for(int i=0;i<n;i++){
                bw.write(Integer.toString(num[i][0]+num[i][1]));
                bw.newLine();
            }
            bw.flush();
        }catch(Exception e){
            
        }
        
        
        
    }
}