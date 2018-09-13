import java.io.*;
import java.util.*;

public class Main {
    public static void main(String arg[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            String s = br.readLine();
            String a1 = s.substring(0,8);
            String a2 = s.substring(8,16);
            String a3 = s.substring(16,24);
            String a4 = s.substring(24,32);
            int b1 = Integer.parseInt(a1,2);
            int b2 = Integer.parseInt(a2, 2);
            int b3 = Integer.parseInt(a3, 2);
            int b4 = Integer.parseInt(a4, 2);
            System.out.printf("%d.%d.%d.%d\n",b1,b2,b3,b4);
        }
    }
}