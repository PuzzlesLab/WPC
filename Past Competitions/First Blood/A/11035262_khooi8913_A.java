import java.util.*;
import java.io.*;

//POJ_1000

public class Main {

	public static void main(String args[]) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pr = new PrintWriter(System.out);
		
		String [] _numbers = br.readLine().split(" ");
		pr.println(Integer.parseInt(_numbers[0]) + Integer.parseInt(_numbers[1]));
		
		pr.close();
	}
	
}
