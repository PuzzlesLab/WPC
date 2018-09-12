import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        long ways[] = new long[30001];
        ways[0] = 1;
        for(int i =1;i<ways.length;i++){
            ways[i]+=ways[i-1];
        }
        for(int i =5;i<ways.length;i++){
            ways[i]+=ways[i-5];
        }
        for(int i =10;i<ways.length;i++){
            ways[i]+=ways[i-10];
        }
        for(int i =25;i<ways.length;i++){
            ways[i]+=ways[i-25];
        }
        for(int i =50;i<ways.length;i++){
            ways[i]+=ways[i-50];
        }
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while((input=sc.readLine())!=null&&!input.isEmpty()){
            int n = Integer.parseInt(input);
            long m = ways[n];
            if(m==1){
                System.out.println("There is only 1 way to produce "+n+" cents change.");
            }
            else{
                System.out.println("There are "+m+" ways to produce "+n+" cents change.");
            }
        }
    }
}
