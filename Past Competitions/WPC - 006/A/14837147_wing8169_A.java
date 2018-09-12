import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Chin Jia Xiong
 */
public class Main {

    public static void main(String[] args) throws IOException{
        long[] ls = new long[30001];
        int[] coins = {1, 5, 10, 25, 50};
        ls[0] = 1;
        for(int c: coins){
            for(int i=0; i<ls.length; i++){
                if(i >= c){
                    ls[i] += ls[i-c];
                }
            }
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text;
        while((text = br.readLine())!= null && !text.isEmpty()){
            int cents = Integer.parseInt(text);
            if(cents < 5) System.out.printf("There is only 1 way to produce %d cents change.\n", cents);
            else{
                System.out.printf("There are %d ways to produce %d cents change.\n", ls[cents], cents);
            }
        }
    }
    
}
