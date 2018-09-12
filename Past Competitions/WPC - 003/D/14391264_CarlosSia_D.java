
import java.math.BigInteger;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tCase = input.nextInt();
        input.nextLine();
        for(int i = 1; i <= tCase; i++)
        {
            String first = "", second = "", power = "";
            int pow = 0, plus = 0;
            String line = input.nextLine();
            for(int j = 0; j < line.length(); j++)
            {
                if(line.charAt(j) == '+')
                {
                    first = line.substring(1, j);
                    plus = j;
                }
                else if(line.charAt(j) == ')')
                {
                    second = line.substring(plus+1, j);
                    power = line.substring(j+2, line.length());
                    pow = Integer.parseInt(power);
                }
            }
            System.out.println("Case " + i + ": " + binomialPower(first, second, pow));
        }
    }
    
    public static String binomialPower(String a, String b, int pow)
    {
        String str = "";
        if(pow == 1)
        {
            str = a;
        }
        else
        {
            str = a + "^" + pow;
        }
        for(int i = 1; i <= pow; i++)
        {
            if(i == pow)
            {
                if(pow == 1)
                {
                    str = str + "+" + b;
                }
                else
                    str = str + "+" + b + "^" + pow;
            }
            else
            {
                if(binomial(pow, i) == BigInteger.ONE)
                {
                    str = str + "+";
                }
                else
                {
                    str = str + "+" + binomial(pow, i) + "*";
                }
                if(pow - i == 0)
                {
                    str = str;
                }
                else if(pow - i == 1)
                {
                    str = str + a;
                }
                else
                    str = str + a + "^" + (pow-i);
                if(i == 1)
                {
                    str = str + "*" + b;
                }
                else
                    str = str + "*" + b + "^" + i;
            }
        }
        return str;
    }
    
    public static BigInteger binomial(int power, int number)
    {
        BigInteger result = BigInteger.ONE;
        for(int i = power; i >= 1; i--)
        {
            result = result.multiply(BigInteger.valueOf(i));
            if(i <= power-number)
            {
                result = result.divide(BigInteger.valueOf(i));
            }
            if(i <= number)
            {
                result = result.divide(BigInteger.valueOf(i));
            }
        }
        return result;
    }
}
