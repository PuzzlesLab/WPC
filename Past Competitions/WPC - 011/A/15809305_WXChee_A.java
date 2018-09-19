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
        int cases = Integer.parseInt(in.readLine());
        for(int i = 0; i < cases; i++){
            StringTokenizer line = new StringTokenizer(in.readLine());
            String chess = line.nextToken();
            int x = Integer.parseInt(line.nextToken());
            int y = Integer.parseInt(line.nextToken());
            
            if(chess.equals("r")){
                if(x >= y)
                    System.out.println(y);
                else
                    System.out.println(x);
            }else if(chess.equals("k")){
                if((x*y)%2 == 1){
                    System.out.println((x*y)/2+1);
                }else{
                    System.out.println((x*y)/2);
                }
            }else if(chess.equals("Q")){
                if(x <= 3 && y <= 3){
                    if(x <= 2 && y <= 2){
                        System.out.println(1);
                    }else{
                        System.out.println(2);
                    }
                }else{
                    if(x >= y)
                        System.out.println(y);
                    else
                        System.out.println(x);
                }
            }else if(chess.equals("K")){
                x = (x%2) + (x/2);
                y = (y%2) + (y/2);
                System.out.println(x*y);
            }
        }
    }
    
}