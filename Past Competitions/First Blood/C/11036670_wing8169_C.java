import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.PrintWriter;
import java.util.Arrays;

class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        String text;
        StringTokenizer st = new StringTokenizer(br.readLine());
        int length = Integer.parseInt(st.nextToken());
        int num = Integer.parseInt(st.nextToken());
        int temp;
        String temp2;
        String[] arr = new String[num];
        int[] chr = new int[length];
        int[] counter = new int[num];
        for(int i=0; i<num; i++)
        {
            text = br.readLine();
            arr[i] = text;
            for(int j=0; j<length; j++)
            {
                chr[j] = (int)text.charAt(j);
            }
            // swap and counts
            for(int m=0; m<length; m++)
            {
                for(int k=0; k<chr.length-1; k++)
                {
                    if(chr[k] > chr[k+1])
                    {
                        temp = chr[k];
                        chr[k] = chr[k+1];
                        chr[k+1] = temp;
                        counter[i] += 1;
                    }
                }
            }
        }
        for(int n=0; n<num; n++)
            {
                for(int p=0; p<num-1; p++)
                {
                    if(counter[p] > counter[p+1])
                    {
                        temp2 = arr[p];
                        arr[p] = arr[p+1];
                        arr[p+1] = temp2;
                        temp = counter[p];
                        counter[p] = counter[p+1];
                        counter[p+1] = temp;
                    }
                }
            }
        for(String str: arr)
        {
            pw.println(str);
        }
        pw.close();
    }
}
