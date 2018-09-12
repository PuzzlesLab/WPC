import java.io.*;
import java.util.*;

public class Main {
    public static int count[];
    public static void print(boolean path[][],String pre,int t,int limit){
        if(t==0)
            return;
        for(int i=limit;i>=1;i--){
            if(path[i][t]&&count[i]>0){
                if(t-i>0){                    
                   String cur = pre+String.format("%d+",i);
                   count[i]--;
                   print(path,cur,t-i,i);
                   count[i]++;
                }else{
                    if(pre.isEmpty()){
                        System.out.println(i);
                    }else{
                        System.out.println(pre+i);
                    }
                }
            }
        }
    }
    public static void main(String arg[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while(!(s=br.readLine()).equals("0 0")){
            StringTokenizer st = new StringTokenizer(s);
            int t = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int token[] = new int[N];
            count = new int[1001];
            for(int i=0;i<N;i++){
                token[i] = Integer.parseInt(st.nextToken());
                count[token[i]]++;
            }
            Arrays.sort(token);
            boolean dp[] = new boolean[1001];
            boolean path[][] = new boolean[1001][1001];
            dp[0] = true;
            path[0][0] = true; 
            
            for(int i=0;i<N;i++){
                for(int j=t;j>=token[i];j--){
                    if(dp[j-token[i]]){
                        dp[j] = true;
                        path[token[i]][j] = true ;
                    }
                }
            }
            System.out.printf("Sums of %d:\n",t);
            if(!dp[t]){
                System.out.println("NONE");
            }else{
                print(path,"",t,t);
            }
        }

    }
}
