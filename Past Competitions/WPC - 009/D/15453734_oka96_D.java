import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while((s=br.readLine())!=null){
            if(s.equals("0")){
                break;
            }
            int digit = s.length();
            if(digit%2==0){
                int value = (s.charAt(0)-'0')*10+(s.charAt(1)-'0');
                int sqrt = (int)Math.sqrt(value);
                int left = (digit-2)/2;
                String ans = String.valueOf(sqrt);
                for(int i=1;i<=left;i++){
                    ans += '0';
                }
                System.out.println(ans);
            }else{
                int value = (s.charAt(0) - '0');
                int sqrt = (int)Math.sqrt(value);
                int left = (digit-1)/2;
                String ans = String.valueOf(sqrt);
                for(int i=1;i<=left;i++){
                    ans += '0';
                }
                System.out.println(ans);
            }
        }
    }
}
