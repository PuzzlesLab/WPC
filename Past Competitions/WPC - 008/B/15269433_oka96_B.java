import java.io.*;
import java.util.*;

public class Main {
    public static boolean composite[];
    public static ArrayList<Integer> arr = new ArrayList<>();
    public static void soe(int up){
        composite = new boolean[up+1];
        int sqrt = (int)Math.sqrt(up);
        for(int i=2;i<=sqrt;i++){
            if(!composite[i]){
                arr.add(i);
                for(int j=i*i;j<=up;j+=i){
                    composite[j] = true;
                }
            }
        }
        for(int i=sqrt+1;i<=up;i++){
            if(!composite[i]){
                arr.add(i);
            }
        }
    }
    public static void main(String arg[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        soe(1000000);
        String s;
        while((s=br.readLine())!=null){
            if(s.equals("0")){
                break;
            }
            int N = Integer.parseInt(s);
            boolean ans = false;
            for(int i=1;i<arr.size();i++){
                int prime = arr.get(i);
                if(prime<=N/2){
                    if(!composite[N-prime]){
                        ans = true;
                        System.out.println(N+" = "+prime+" + "+(N-prime));
                        break;
                    }
                }
            }
            if(!ans){
                System.out.println("Goldbach's conjecture is wrong.");
            }
        }
    }
}