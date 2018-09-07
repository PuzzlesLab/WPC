import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while(n > 0) {
            n--;
            int r, e, c;
            r = s.nextInt();
            e = s.nextInt();
            c = s.nextInt();
            int p = e - c;
            if(p > r) {
                System.out.println("advertise");
            }
            else if(p < r) {
                System.out.println("do not advertise");
            }
            else {
                System.out.println("does not matter");
            }
        }
        
    }
    
}