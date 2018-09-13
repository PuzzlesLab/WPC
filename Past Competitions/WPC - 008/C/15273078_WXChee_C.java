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
        while(true){
            String line = in.readLine();
            if(line.equals("Game Over"))
                break;
            StringTokenizer l = new StringTokenizer(line);
            int[] scores = new int[10];
            int score = 0;
            ArrayList<String> record = new ArrayList<String>();
            int counter = 0;
            while(l.hasMoreTokens()){
                if(record.size() < 4)
                    record.add(l.nextToken());
                else{
                    score += calculateScore(record, counter);
                    counter ++;
                    //System.out.println(counter);
                }
            }
            //System.out.println(counter);
            while(record.size() != 0){
                //System.out.println(counter);
                //System.out.println(Arrays.toString(record.toArray()));
                //System.out.println(score);
                score += calculateScore(record, counter);
                if(counter != 9)
                    counter ++;
            }
            System.out.println(score);
            //System.out.println(Arrays.toString(record.toArray()));
        }
    }
    
    static int calculateScore(ArrayList<String> r, int c){
        if(c >= 9){
            if(r.size() > 1){
                if(r.get(0).equals("X")){
                    r.remove(0);
                    return 10;
                }else
                    if(r.size() > 1)
                        if(r.get(1).equals("/")){
                            r.remove(0);
                            r.remove(0);
                            return 10;
                        }else{
                            int x = Integer.parseInt(r.remove(0));
                            int y = Integer.parseInt(r.remove(0));
                            return x+y;
                            
                        }
                    else{
                        return Integer.parseInt(r.remove(0));
                    }
            }else{
                if(r.get(0).equals("X")){
                    r.remove(0);
                    return 10;
                }
                return Integer.parseInt(r.remove(0));
                
            }
        }
        else{
        if(r.get(0).equals("X"))
            if(r.get(1).equals("X"))
                if(r.get(2).equals("X")){
                    r.remove(0);
                    return 30;
                }else{
                    r.remove(0);
                    return 20 + Integer.parseInt(r.get(1)) /*+ Integer.parseInt(r.get(2))*/;
                }
            else
                if(r.get(2).equals("/")){
                    r.remove(0);
                    return 20;
                }else{
                    r.remove(0);
                    return 10 + Integer.parseInt(r.get(0)) + Integer.parseInt(r.get(1));
                }
        else
            if(r.get(1).equals("/"))
                if(r.get(2).equals("X")){
                    r.remove(0);
                    r.remove(0);
                    return 20;
                }else{
                    r.remove(0);
                    r.remove(0);
                    return 10 + Integer.parseInt(r.get(0));
                }
            else{
                int score = Integer.parseInt(r.get(0)) + Integer.parseInt(r.get(1));
                r.remove(0);
                r.remove(0);
                return score;
            }
        }
    }
    
}