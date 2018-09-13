
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ca = 1;
        while(true)
        {
            Set<Integer> set = new HashSet<>();
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();
            int d = input.nextInt();
            if(a == 0 && b == 0 && c == 0 && d == 0)
            {
                break;
            }
            int[] array = new int[c];
            int total = 0;
            int current = 0;
            int num = 0;
            int l = d;
            while(true)
            {
                if(set.contains(l))
                {
                    for(int i = 0; i < num-1; i++)
                    {
                        if(current == array[i])
                        {
                            total = num-i;
                            break;
                        }
                    }
                    break;
                }
                else
                {
                    set.add(l);
                    array[num] = l;
                    num++;
                }
                l = ((a * l) + b) % c;
                current = l;
            }
            System.out.println("Case " + ca + ": " + total);
            ca++;
        }
    }
}
