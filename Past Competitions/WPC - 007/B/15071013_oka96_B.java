import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

    static int equal(int[] arr) {
        // Complete this function
        int n = arr.length;
        Arrays.sort(arr);
        int small = arr[0];
        int range = arr[n-1]-arr[0];
        int dp[] = new int[range+5];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0] = 0;
        int token[] = {1,2,5};
        for(int i=0;i<3;i++){
            for(int j=token[i];j<=range+4;j++){
                if(dp[j-token[i]]!=Integer.MAX_VALUE){
                    dp[j] = Math.min(dp[j],dp[j-token[i]]+1);
                }
            }
        }
        for(int i=0;i<n;i++){
            arr[i] -= small;
            //total += dp[arr[i]];
        }
        int max = Integer.MAX_VALUE;
        for(int i=0;i<=4;i++){
            int total = 0;
            for(int j=0;j<n;j++){
                total += dp[arr[j]+i];
            }
            max = Math.min(max,total);
        }
        
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int[] arr = new int[n];
            for(int arr_i = 0; arr_i < n; arr_i++){
                arr[arr_i] = in.nextInt();
            }
            int result = equal(arr);
            System.out.println(result);
        }
        in.close();
    }
}
