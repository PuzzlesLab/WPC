
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
        final int max = 30001;
        int[] coin = {1, 5, 10, 25, 50};
        Scanner input = new Scanner(System.in);
        long[] array = new long[max];
        for(int i = 0; i < array.length; i++)
        {
            array[i] = 0;
        }
        array[0] = 1;
        for(int i = 0; i < coin.length; i++)
        {
            for(int j = coin[i]; j < max; j++)
            {
                array[j] += array[j-coin[i]];
            }
        }
        while(input.hasNextInt())
        {
            int num = input.nextInt();
            if(array[num] != 1)
                System.out.println("There are "+ array[num]+" ways to produce "+ num +" cents change.");
            else
                System.out.println("There is only 1 way to produce " + num + " cents change.");
        }
    }
}
