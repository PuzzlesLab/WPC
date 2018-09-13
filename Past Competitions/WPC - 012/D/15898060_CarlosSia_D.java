
import java.util.Scanner;

public class Main {
    private static final int first = 1;
    private static final int second = 2;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tCase = input.nextInt();
        input.nextLine();
        for(int i = 1; i <= tCase; i++)
        {
            String line = input.nextLine();
            String s = line;
            int sum = 0;
            for(int j = 0; j < line.length(); j++)
            {
                sum += Integer.parseInt(Character.toString(line.charAt(j)));
            }
            int current = first;
            while(true)
            {
                boolean moved = false;
                for(int j = 0; j < s.length(); j++)
                {
                    int t = Integer.parseInt(Character.toString(s.charAt(j)));
                    if((sum-t)%3==0)
                    {
                        sum -= t;
                        s = s.substring(0, j) + s.substring(j+1);
                        moved = true;
                        current = (current == first)? second : first;
                        break;
                    }
                }
                if(!moved)
                {
                    break;
                }
            }
            if(current == first)
            {
                System.out.println("Case " + i + ": T");
            }
            else
                System.out.println("Case " + i + ": S");
        }
    }
}
