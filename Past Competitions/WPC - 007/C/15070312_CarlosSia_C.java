
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tCase = input.nextInt();
        for(int i = 0; i < tCase; i++)
        {
            int n = input.nextInt();
            int[] array = new int[n];
            for(int j = 0; j < n; j++)
            {
                array[j] = input.nextInt();
            }
            long cMax = 0, nNMax = Long.MIN_VALUE, max = Long.MIN_VALUE;
            
            for(int j = 0; j < n; j++)
            {
                cMax = Math.max(cMax + array[j], array[j]);
                max = Math.max(cMax, max);
                if(array[j] > nNMax && nNMax < 0)
                {
                    nNMax = array[j];
                }
                else if(array[j] > 0 && nNMax >= 0)
                {
                    nNMax += array[j];
                }
            }
            System.out.println(max + " " + nNMax);
        }
    }
}
