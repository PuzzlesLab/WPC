import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            
            if(n == 0 && m == 0 ) break;
            
            ArrayList<Integer> sequenceOfTasks = new ArrayList<>(n);
            for(int x = 0; x < n; x++){
                sequenceOfTasks.add(x, x + 1);
            }
            
            for(int x = 0; x < m; x++){
                StringTokenizer st1 = new StringTokenizer(br.readLine());
                int i = Integer.parseInt(st1.nextToken());
                int j = Integer.parseInt(st1.nextToken());
                int indexOf_i = sequenceOfTasks.indexOf(i);
                int indexOf_j = sequenceOfTasks.indexOf(j);
                if(indexOf_i > indexOf_j){
                    Collections.swap(sequenceOfTasks, indexOf_i, indexOf_j);                    
                }     
            }
            
            for(int i : sequenceOfTasks){
                System.out.print(i + " ");
            }
            System.out.print("\n");
        }
    }
}