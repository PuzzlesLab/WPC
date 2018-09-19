import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        
        while((s=br.readLine())!=null&&!s.isEmpty()){
            int gg[] = new int[31];
            if(s.equals("#")){
                continue;
            }
            String next;
            while(!(next=br.readLine().trim()).equals("#")){
                if(s.charAt(s.length()-1)!='-'){
                    s = s+" "+next;
                }else{
                    s = s+next;
                }
            }

            String abc = s.replaceAll("-","");
            abc = abc.replaceAll("'","");
            StringTokenizer st = new StringTokenizer(abc," ,.?!");
            while(st.hasMoreTokens()){
                String value = st.nextToken();
                gg[value.length()]++;
            }
            for(int i=1;i<=30;i++){
                if(gg[i]>0){
                    System.out.println(i+" "+gg[i]);
                }
            }
            System.out.println();
        }
    }
}
