import java.io.*;
import java.util.*;

public class Main {
    public static void main(String arg[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while((s=br.readLine())!=null&&!s.equals("Game Over")){
            StringTokenizer st = new StringTokenizer(s);
            int frame[] = new int[21];
            int scores[] = new int[10];
            char round[] = new char[10];
            Arrays.fill(frame,-1);
            int i=0;
            while(st.hasMoreTokens()){
                char cur = st.nextToken().charAt(0);
                if(cur=='X'||cur=='/'){
                    if(i<=19){
                        round[i/2] = cur;
                    }
                    frame[i] = 10;
                    if(cur=='X'&&i<=16)
                        i++;
                }else{
                    frame[i] = cur-'0';
                }
                i++;
            }
            if(frame[18]==10){
                if(frame[19]!=10&&frame[20]==10){
                    scores[9] = frame[18]+frame[20];
                }else{
                    scores[9] = frame[18]+frame[19]+frame[20];
                }
            }else if(frame[19]==10){
                scores[9] = frame[19]+frame[20];
            }else{
                scores[9] = frame[18]+frame[19];
            }
            for(int j=8;j>=0;j--){
                if(frame[2*j]==10){
                    if(j==8){
                        if(frame[(j+1)*2]==10){
                            scores[j] = frame[j * 2] + frame[j * 2 + 2] + frame[j * 2 + 3];
                        }else if(frame[(j+1)*2+1]==10){
                            scores[j] = frame[j*2]+frame[j*2+3];
//                            System.out.println(frame[j*2]+" "+frame[j*2+3]);
                        }else{
                            scores[j] = frame[j*2]+frame[j*2+2]+frame[j*2+3];
                        }
                    }else{
                        if(frame[(j+1)*2+1]==10){
                            scores[j] = frame[j*2]+frame[j*2+3];
                        }else if(frame[(j+1)*2]==10){
                            scores[j] = frame[j*2]+frame[(j+1)*2]+frame[(j+2)*2];
                        }else{
                            scores[j] = frame[j*2]+frame[(j+1)*2]+frame[(j+1)*2+1];
                        }
                    }
                }else if(frame[j*2+1]==10){
                    scores[j] = frame[j*2+1]+frame[j*2+2];
                }else{
                    scores[j] = frame[j*2]+frame[j*2+1];
                }
            }
            int total = 0;
            for(int j=0;j<10;j++){
                total += scores[j];
//                System.out.println(scores[j]);
            }
            System.out.println(total);
        }
    }
}