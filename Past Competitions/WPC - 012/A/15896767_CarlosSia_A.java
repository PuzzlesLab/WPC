
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tCase = input.nextInt();
        input.nextLine();
        for(int i = 0; i < tCase; i++)
        {
            String[] word = input.nextLine().split(" ");
            BigInteger a = new BigInteger(word[0]);
            BigInteger b = new BigInteger(word[2]);
            BigInteger gcd = a.gcd(b);
            a = a.divide(gcd);
            b = b.divide(gcd);
            System.out.println(a + " / " + b);
        }
    }
}
