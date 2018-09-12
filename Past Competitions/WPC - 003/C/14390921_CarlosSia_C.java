
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tCase = input.nextInt();
        input.nextLine();
        for(int i = 1; i <= tCase; i++)
        {
            boolean check = false;
            String first = input.nextLine();
            String second = input.nextLine();
            long fi = Long.parseLong(first, 2);
            long se = Long.parseLong(second, 2);
            if(GCD(fi, se)==1)
            {
                System.out.println("Pair #" + i + ": Love is not all you need!");
            }
            else
            {
                System.out.println("Pair #" + i + ": All you need is love!");
            }
        }
    }
    
    public static long GCD(long first, long second)
    {
        if(second == 0)
        {
            return first;
        }
        return GCD(second, first%second);
    }
}
