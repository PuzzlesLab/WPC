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
            StringTokenizer st = new StringTokenizer(br.readLine());
            int avenueNotAd = Integer.parseInt(st.nextToken());
            int avenueAd = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            avenueAd -= cost;
            if(avenueNotAd < avenueAd) System.out.println("advertise");
            else if(avenueNotAd > avenueAd) System.out.println("do not advertise");
            else System.out.println("does not matter");
        }
    }
    
}
