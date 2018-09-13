
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        int testCase = input.nextInt();
        input.nextLine();
        for(int i = 0; i < testCase; i++)
        {
            String line = input.nextLine();
            if(line.charAt(line.length()-1) == ' ')
            {
                line = line.substring(0, line.length()-1);
            }
            String first = line.substring(0, 8);
            String second = line.substring(8, 16);
            String third = line.substring(16, 24);
            String fourth = line.substring(24, line.length());
            int n1 = Integer.parseInt(first, 2);
            int n2 = Integer.parseInt(second, 2);
            int n3 = Integer.parseInt(third, 2);
            int n4 = Integer.parseInt(fourth, 2);
            System.out.println(n1 + "." + n2 + "." + n3 + "." + n4);
        }
    }
}
