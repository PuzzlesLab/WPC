import java.io.*;
import java.util.*;

public class Main {

    public static void main(String arg[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=1;i<=T;i++){
            String s;
            while((s=br.readLine())!=null){
                if(s.equals(""))
                    break;
                s = s.replace('1','I');
                s = s.replace('2','Z');
                s = s.replace('3','E');
                s = s.replace('4','A');
                s = s.replace('5', 'S');
                s = s.replace('6','G');
                s = s.replace('7','T');
                s = s.replace('8','B');
                s = s.replace('9','P');
                s = s.replace('0','O');
                System.out.println(s);
            }
            if(i<T)
                System.out.println();
        }
    }
}
