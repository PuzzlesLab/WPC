import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author Chin Jia Xiong
 */
public class Main {
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cases = Integer.parseInt(br.readLine());
        for(int i=0; i<cases; i++){
            int num = Integer.parseInt(br.readLine());
            int[] arr = new int[num];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<num; j++){
                arr[j] = Integer.parseInt(st.nextToken());
            }
            long[] result = new long[2];
            if(arr.length > 1)
                getAns(arr, result);
            else{
                result[0] = arr[0];
                result[1] = arr[0];
            }
            System.out.println(result[0] + " " + result[1]);
        }
    }
    
    public static void getAns(int[] arr, long[] result){
        long maxNeg = Long.MIN_VALUE;
        long largeSubSeq = maxNeg;
        for(int i: arr){
            if(i < 0 && i > maxNeg) maxNeg = i;
            if(i >= 0){
                if(largeSubSeq == Long.MIN_VALUE) largeSubSeq = 0;
                largeSubSeq += i;
            }
        }
        if(largeSubSeq == Long.MIN_VALUE) largeSubSeq = maxNeg;
        result[0] = kadane(arr);
        result[1] = largeSubSeq;
    }
    
    public static long kadane(int[] arr){
        long maxCurrent = arr[0];
        long maxGlobal = arr[0];
        for(int i=1; i<arr.length; i++){
            maxCurrent = Math.max(arr[i], maxCurrent+arr[i]);
            if(maxCurrent > maxGlobal) maxGlobal = maxCurrent;
        }
        return maxGlobal;
    }
    
}
