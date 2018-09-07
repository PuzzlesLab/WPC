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
    public static void main(String[] args) throws IOException{
       BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
       int cases = Integer.parseInt(in.readLine());
       for(int i = 0; i < cases; i++){
            StringTokenizer line = new StringTokenizer(in.readLine());
            int no = Integer.parseInt(line.nextToken());
            int yes = Integer.parseInt(line.nextToken());
            int cost = Integer.parseInt(line.nextToken());
            if(cost < yes - no)
                System.out.println("advertise");
            else if(cost == yes - no)
                System.out.println("does not matter");
            else
                System.out.println("do not advertise");
       }
    }
    
}