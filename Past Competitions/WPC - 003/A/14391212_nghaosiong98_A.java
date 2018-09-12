import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static int gcd(int a,int b){
        return a%b!=0? gcd(b,a%b):b;
    }
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int STEP, MOD;
        while(input.hasNext()){
            STEP = input.nextInt();
            MOD = input.nextInt();
            System.out.printf("%10d%10d    %s\n\n",STEP,MOD,gcd(STEP,MOD)==1?"Good Choice":"Bad Choice");

        }
    }
}
