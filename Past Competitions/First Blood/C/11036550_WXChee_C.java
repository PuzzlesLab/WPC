import java.io.*;
import java.util.*;

class Main {
 
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer I1 = new StringTokenizer(input.readLine());
        int n = Integer.parseInt(I1.nextToken());
        int m = Integer.parseInt(I1.nextToken());
        String[] Answer = new String[m];//hold Answer
        int[] counter = new int[m];
        for(int a = 0; a < m; a++)
        {
            int[][] letter = new int[m][n];
            StringTokenizer I2 = new StringTokenizer(input.readLine());
            Answer[a] = I2.nextToken();
            int i = 0;
            for(int b = 0; b < n; b++)            
                letter[a][b] = (int)Answer[a].charAt(b);                            
            for(int b = 0; b < n-1; b++)
                for(int c = 0; c < n-1; c++)
                {
                    if(letter[a][c] > letter[a][c+1])
                    {
                        int temp = letter[a][c];
                        letter[a][c] = letter[a][c+1];
                        letter[a][c+1] = temp;
                        i++;
                    }
                }
            counter[a] = i;            
        }
        for(int b = 0; b < m-1; b++)
                for(int c = 0; c < m-1; c++)
                {
                    if(counter[c] > counter[c+1])
                    {
                        int temp = counter[c+1];
                        counter[c+1] = counter[c];
                        counter[c] = temp;
                        String special = Answer[c+1];
                        Answer[c+1] = Answer[c];
                        Answer[c] = special;
                    }
                }
        for(int b = 0; b < m; b++)
            System.out.println(Answer[b]);
    }
    
}