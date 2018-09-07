import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double b,n;
        while(true) {
            b = s.nextInt();
            n = s.nextInt();
            if(b == 0 && n == 0) break;
            int i = (int)Math.floor(Math.pow(b, (1/n)));
            int j = Math.abs(Math.pow(i,n) - b) > Math.abs(Math.pow(i+1,n) - b) ? i+1 : i;
            System.out.println(j);
        }
    }
}