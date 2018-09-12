import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            String[] input = sc.nextLine().split(" ");
            int step = Integer.parseInt(input[0]);
            int mod = Integer.parseInt(input[1]);
            if (check(step,mod)){
                System.out.printf("%10d%10d    Good Choice\n",step,mod);
            }
            else{
                System.out.printf("%10d%10d    Bad Choice\n",step,mod);
            }
            System.out.println();
        }
    }
    public static boolean check(int step, int mod){
        int[] temp = new int[100001];
        temp[0]=0;
        for(int i =1;i<mod;i++){
            temp[i]=(temp[i-1]+step)%mod;
        }
        Arrays.sort(temp,0,mod);
//        for(int x: temp){
//            System.out.print(" "+x);
//        }
        for(int i =0;i<mod;i++){
            if(temp[i]!=i){
                return false;
            }
        }
        return true;
    }
}
