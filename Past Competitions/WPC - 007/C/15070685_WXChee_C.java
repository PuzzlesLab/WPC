import java.util.*;
import java.io.*;
/**
 *
 * @author thechee
 */
class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        for (int c = 0; c < t; c++){
            int l = Integer.parseInt(in.readLine());
            int[] X = new int[l];
            StringTokenizer line = new StringTokenizer(in.readLine());
            for(int i = 0; i < l; i++)
                X[i] = Integer.parseInt(line.nextToken());
            System.out.println(maxSum(X) + " " + maxSubSum(X));
        }
    }
    
    static long maxSum(int[] X){
        long maxNow = X[0];
        long max = X[0];
        for (int i = 1; i < X.length; i++){
            maxNow = Math.max(X[i], maxNow+X[i]);
            max = Math.max(max, maxNow);
        }        
        return max;
    }
    
    static long maxSubSum(int[] X){
        long max = X[0];
        for (int i = 1; i < X.length; i++){
            if(X[i] > 0){
                if(max < 0)
                    max = X[i];
                else
                    max += X[i];
            }else
                if(max < X[i])
                    max = X[i];
        }   
        return max;
    }
}