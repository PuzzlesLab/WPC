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
//        int cases = Integer.parseInt(br.readLine());
        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            long ans = Integer.parseInt(st.nextToken());
            int power = Integer.parseInt(st.nextToken());
            if(ans==0 && power==0) break;
            long rslt;
            long currentAns = Math.round(Math.pow(Math.E, Math.log(ans)/(double)power));
            long currentDiff = Math.abs((long)Math.pow(currentAns, power) - ans);
            rslt = currentAns;
            if(Math.abs((long)Math.pow(currentAns+1, power) - ans) < currentDiff) rslt = currentAns+1;
            if(Math.abs((long)Math.pow(currentAns-1, power) - ans) < currentDiff) rslt = currentAns-1;
            System.out.println(rslt);
        }
    }
    
}
