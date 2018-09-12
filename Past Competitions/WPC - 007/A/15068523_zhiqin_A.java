import java.util.Scanner;
import java.math.BigInteger;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BigInteger[] dp = new BigInteger[10001];
        java.util.Arrays.fill(dp, BigInteger.ZERO);
        dp[0] = BigInteger.ONE;

        int[] amount = new int[21];
        for(int i =1;i<=21;i++){
            amount[i-1]=i*i*i;
        }
        for(int i =0;i<21;i++){
            for(int j=amount[i];j<dp.length;j++){
                dp[j] = dp[j].add(dp[j-amount[i]]);
            }
        }
        while(sc.hasNextInt()){
            int num = sc.nextInt();
            System.out.println(dp[num]);
        }
    }
}
