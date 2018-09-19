

import java.util.*;
import java.io.*;

public class Main {
    public static int decode(String s){
        int value = 0;
        for(int i=1;i<s.length()-1;i++){
            if(s.charAt(i)=='o'){
                value *= 2;
                value += 1;
            }else if(s.charAt(i)==' '){
                value *= 2;
            }
        }
        return value;
    }
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        s=br.readLine();
        String ans = "";
        while((s=br.readLine())!=null&&!s.isEmpty()){
            if(s.equals("___________")){
                continue;
            }
            char dd = (char)decode(s);
            ans += dd;
//            if(dd=='\n'){
//                ans += '\n';
//            }
        }
        System.out.print(ans);
//        System.out.println((int)decode("|    o. o |"));
    }
}
