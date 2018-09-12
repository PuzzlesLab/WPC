import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Chin Jia Xiong
 */
public class Main {
    
    public static void generateCoin(int[] coins){
        for(int i=1; i<=21; i++){
            coins[i-1] = i*i*i;
        }
    }

    public static void main(String[] args){
        long[] ls = new long[10001];
        int[] coins = new int[21];
        generateCoin(coins);
        ls[0] = 1;
        for(int c: coins){
            for(int i=0; i<ls.length; i++){
                if(i >= c){
                    ls[i] += ls[i-c];
                }
            }
        }
        Scanner input = new Scanner(System.in);
        while(input.hasNextInt()){
            int amnt = input.nextInt();
            System.out.println(ls[amnt]);
        }
    }
    
}
