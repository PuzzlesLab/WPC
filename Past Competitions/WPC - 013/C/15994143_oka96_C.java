import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        BigInteger b[] = new BigInteger[1001];
        b[0] = BigInteger.ONE;
        b[1] = BigInteger.ONE;
        for(int i=2;i<=1000;i++){
            b[i] = b[i-1].multiply(BigInteger.valueOf(i));
        }
        while((s=br.readLine())!=null&&!s.isEmpty()){
            int N = Integer.parseInt(s);
            System.out.println(N+"!");
            System.out.println(b[N]);
        }
    }
}
