
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String arg[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long way[] = new long[30001];
        int token[] = {1,5,10,25,50};
        way[0] = 1;
        for(int i=0;i<token.length;i++){
            for(int j=token[i];j<=30000;j++){
                if(way[j-token[i]]>0)
                    way[j] += way[j-token[i]];
            }
        }
        String s;
        while((s=br.readLine())!=null&&!s.isEmpty()){
            int N = Integer.parseInt(s);
            long ans = way[N];
            if(ans==1){
                System.out.println("There is only 1 way to produce "+N+" cents change.");
            }else{
                System.out.printf("There are %d ways to produce %d cents change.\n",ans,N);
            }
        }

    }
}
