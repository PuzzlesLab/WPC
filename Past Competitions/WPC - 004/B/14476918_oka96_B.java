import java.io.*;
import java.util.*;

public class Main {

    public static void main(String arg[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        
        for(int i=1;i<=T;i++){
            Map<String, String> map = new HashMap<>();
            String gg;
            while((gg=br.readLine()).equals("")){
            }
            int N = Integer.parseInt(gg.trim());
            for(int j=1;j<=N;j++){
                String name = br.readLine();
                String party = br.readLine();
                map.put(name,party);
            }
            int M = Integer.parseInt(br.readLine().trim());
            int max = 0;
            String ans = "";
            boolean multiple = true;
            
            Map<String,Integer> dict = new HashMap<>();
            
            for(int j=1;j<=M;j++){
                String s = br.readLine();
                int curCount;
                if(!map.containsKey(s))
                    continue;
                if(!dict.containsKey(s)){
                    curCount = 1;
                }else{
                    curCount = dict.get(s)+1;
                }
                dict.put(s,curCount);
                if(curCount>max){
                    max = curCount;
                    multiple = false;
                    ans = s;
                }else if(curCount==max){
                    multiple = true;
                }
            }
            if(multiple){
                System.out.println("tie");
            }else if (!map.containsKey(ans)){
                System.out.println("independent");
            }else{
                System.out.println(map.get(ans));
            }
            if(i<T)
                System.out.println();
        }
    }
}
