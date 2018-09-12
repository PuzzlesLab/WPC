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
        while(in.ready()){
            StringTokenizer line = new StringTokenizer(in.readLine());
            int a = Integer.parseInt(line.nextToken());
            int b = Integer.parseInt(line.nextToken());
            String A = Integer.toString(a);
            String B = Integer.toString(b);
            if(GCD(a,b) == 1) {
                System.out.printf("%10s%10s    Good Choice\n\n", A, B);
            }else{
                System.out.printf("%10s%10s    Bad Choice\n\n", A, B);
            }
        }
    }
    
    static int GCD(int x, int y){
        if(x > y){
            return GCD(y, x);
        }
        if(y%x==0){
            return x;
        }else{
            return GCD(y%x, x);
        }
    }
}