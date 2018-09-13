
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();
        for(int i = 2; i < 1000000; i++)
        {
            if(isPrime(i))
            {
                set.add(i);
            }
        }
        while(true)
        {
            boolean printed = false;
            int num = input.nextInt();
            if(num == 0)
            {
                break;
            }
            for(int i = 3; i <= num/2; i+=2)
            {
                if(set.contains(i))
                {
                    if(set.contains(num-i))
                    {
                        System.out.println(num + " = " + i + " + " + (num-i));
                        printed = true;
                        break;
                    }
                }
            }
            if(!printed)
            {
                System.out.println("Goldbach's conjecture is wrong.");
            }
        }
    }
    
    public static boolean isPrime(int number)
    {
        if(number % 2 == 0)
            return false;
        if(number == 3)
            return true;
        for(int i = 3; i <= Math.sqrt(number); i+=2)
        {
            if(number % i == 0)
            {
                return false;
            }
        }
        return true;
    }
}
