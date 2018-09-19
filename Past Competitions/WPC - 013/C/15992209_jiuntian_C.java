// first java
// fuck forget firstline output
import java.util.*;
import java.math.BigInteger;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    	while(sc.hasNextInt()){
            int input = sc.nextInt();
            BigInteger ans = BigInteger.valueOf(1);
            for(int i=1; i<=input; i++){
                ans = ans.multiply(BigInteger.valueOf(i));
            }
            System.out.println(input+"!");
            System.out.println(ans);
        }
    }
}
