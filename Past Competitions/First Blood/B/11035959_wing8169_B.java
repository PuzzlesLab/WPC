import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.PrintWriter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chin Jia Xiong
 */
class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        String text;
        double min;
        while(! (text = br.readLine()).equals("0.00"))
        {
            int counter = 0;
            double sum = 0;
            min = Double.parseDouble(text);
            while(sum < min)
            {
                sum += (1.0 / (double)(counter + 2));
                counter += 1;
            }
            pw.printf("%d card(s)\n", counter);
        }
        pw.close();
    }
}
