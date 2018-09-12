import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    static BigInteger[] dp = new BigInteger[105];
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        dp[0]=BigInteger.valueOf(1);
        dp[1]=BigInteger.valueOf(2);
        for(int i =2;i<dp.length;i++) {
            dp[i] = dp[i - 1].add(dp[i - 2]);
        }
        boolean temp = false;
        while(sc.hasNext()){
            if(temp){
                System.out.println("");
            }
            temp=true;
            String first = sc.next();
            String second = sc.next();
            BigInteger ans = convert(first).add(convert(second));
            StringBuilder out = new StringBuilder();
            boolean check = false;
            for(int i =104;i>=0;i--){
                if(ans.compareTo(dp[i])>=0){
                    check=true;
                    out.append(1);
                    ans=ans.subtract(dp[i]);
                }
                else if(check){
                    out.append(0);
                }
            }
            if(!check){
                System.out.println(0);
            }
            else{
                System.out.println(out);
            }
        }
    }
    public static BigInteger convert(String fibinary){
        BigInteger ans =BigInteger.valueOf(0);
        for(int i=0;i<fibinary.length();i++){
            if(fibinary.charAt(i)=='1') {
                ans = ans.add(dp[fibinary.length()-1-i]);
            }
        }
        return ans;
    }
}
