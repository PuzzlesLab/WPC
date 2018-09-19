import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        BigInteger d = BigInteger.valueOf(Integer.MAX_VALUE);
        while((s=br.readLine())!=null&&!s.isEmpty()){
            System.out.println(s);
            StringTokenizer st = new StringTokenizer(s);
            BigInteger b = new BigInteger(st.nextToken());
            String opr = st.nextToken();
            BigInteger c = new BigInteger(st.nextToken());
            BigInteger ans;
            if(opr.equals("+")){
                ans = b.add(c);
            }else{
                ans = b.multiply(c);
            }
            if(b.compareTo(d)>0){
                System.out.println("first number too big");
            }
            if(c.compareTo(d)>0){
                System.out.println("second number too big");
            }
            if(ans.compareTo(d)>0){
                System.out.println("result too big");
            }          
        }
    }
}
