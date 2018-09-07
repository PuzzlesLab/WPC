import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BigInteger n;
        while(true) {
            n = s.nextBigInteger();
            if(n.equals(BigInteger.valueOf(0))) break;
            n = n.subtract(BigInteger.valueOf(1));
            String binaryString = n.toString(2);
            char[] binary = new char[binaryString.length()];
            int l = binaryString.length();
            for(int i = 0; i < l; i++) {
                binary[l - 1 - i] = binaryString.charAt(i);
            }
            System.out.print("{");
            for (int i = 0; i < l - 1; i++){
                if(binary[i] == '1') {
                    System.out.print(" " + BigInteger.valueOf(3).pow(i).toString() + ",");
                }
            }
            if(binary[l-1] == '1') System.out.print(" " + BigInteger.valueOf(3).pow(l-1).toString());
            System.out.println(" }");
        }
    }
}