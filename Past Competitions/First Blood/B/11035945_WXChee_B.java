import java.io.*;
import java.util.*;

class Main {
 
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> A = new ArrayList<Integer>();
        for(int a = 0; ; a++)
        {    
            StringTokenizer I1 = new StringTokenizer(input.readLine());
            double n = Double.parseDouble(I1.nextToken());           
            if(n == 0)
                break;
            double sum = 0;
            for(int i = 2; ; i++)
            {    
                sum += 1.0/i;
                if(sum >= n)
                {
                    A.add(i - 1);
                    break;
                } 
            }           
        }
        for(int a = 0; a < A.size() ; a++)
           System.out.println(A.get(a) + " card(s)");
    }
    
}