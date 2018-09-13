import java.io.*;
import java.util.*;

public class Main {
    public static void main(String arg[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while((s=br.readLine())!=null&&!s.equals("0 0")){
            StringTokenizer st = new StringTokenizer(s);
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            boolean conflict = false;
            boolean time[] = new boolean[1000001];
            for(int i=0;i<N;i++){
                if(conflict){
                    br.readLine();
                    continue;
                }
                st = new StringTokenizer(br.readLine());
                int start = Integer.parseInt(st.nextToken());
                int end = Integer.parseInt(st.nextToken());
                if(time[start]){
                    conflict = true;
                    continue;
                }else{
                    time[start] = true;
                }
                for(int j=start+1;j<end;j++){
                    if(time[j]){
                        conflict = true;
                        continue;
                    }else{
                        time[j] = true;
                    }
                }
            }
            for(int i=0;i<M;i++){
                if(conflict){
                    br.readLine();
                    continue;
                }
                st = new StringTokenizer(br.readLine());
                int start = Integer.parseInt(st.nextToken());
                int end = Integer.parseInt(st.nextToken());
                int interval = Integer.parseInt(st.nextToken());
                int current = start;
                while(current<=1000000){
                    if(time[current]){
                        conflict = true;
                        break;
                    }else{
                        time[current] = true;
                    }
                    for(int j=current+1;j<current+(end-start);j++){
                        if(j>1000000){
                            break;
                        }
                        if(time[j]){
                            conflict = true;
                            break;
                        }else{
                            time[j] = true;
                        }
                    }
                    current += interval;
                }
            }
            if(conflict){
                System.out.println("CONFLICT");
            }else{
                System.out.println("NO CONFLICT");
            }
        }
    }
}