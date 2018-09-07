
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tCase = input.nextInt();
        for(int i = 0; i < tCase; i++)
        {
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();
            if(b-c > a)
            {
                System.out.println("advertise");
            }
            else if(b-c == a)
            {
                System.out.println("does not matter");
            }
            else
            {
                System.out.println("do not advertise");
            }
        }
    }
}
