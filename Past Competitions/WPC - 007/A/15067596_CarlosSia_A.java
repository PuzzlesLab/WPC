
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
        final int max = 10001;
        int[] coin = new int[21];
        for(int i = 0; i < coin.length; i++)
        {
            int j = i + 1;
            coin[i] = (int)Math.pow(j, 3);
        }
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
            System.out.println(array[num]);
        }
    }
}
