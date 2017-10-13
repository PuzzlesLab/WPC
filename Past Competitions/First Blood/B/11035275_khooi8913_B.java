import java.util.*;
import java.io.*;

//POJ_1003

public class Main {

	public static void main(String args[]) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pr = new PrintWriter(System.out);
		
		String _input = "";
		while(!((_input = br.readLine()).equals("0.00"))){
			double _length = Double.parseDouble(_input);
			double length = 0;
			int cardCount = 0;
			
			for(int i=2; length<_length;i++){
				length += 1.0/i;
				cardCount++;
			}
			pr.println(cardCount + " card(s)");
		}
		
		pr.close();
	}
	
}
