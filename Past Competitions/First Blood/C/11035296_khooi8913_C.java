import java.util.*;
import java.io.*;

//POJ_1007

public class Main {

	public static void main(String args[]) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pr = new PrintWriter(System.out);
		
		String [] _params = br.readLine().split(" ");
		//int _length = Integer.parseInt(_params[0]);
		int _numString = Integer.parseInt(_params[1]);
		
		Map <Integer, LinkedList<String>> _result = new TreeMap<Integer, LinkedList<String>>();
		
		for(int i=0; i<_numString; i++){
			String DNA = br.readLine();
			int result = bubbleSort(DNA);
			
			if(!_result.containsKey(result)){
				_result.put(result, new LinkedList<String>());
				_result.get(result).add(DNA);
			}
			else	_result.get(result).add(DNA);
		}
		
		for(LinkedList<String> a : _result.values())
			for(String b : a)	pr.println(b);
		
		pr.close();
	}
	
	public static int bubbleSort(String input){
		char [] a = input.toCharArray();
		int count=0;
		for(int i=0; i<input.length();i++){
			for(int j=0; j<input.length()-1;j++){
				if(a[j] >  a[j+1])	{
					count+=1;
					char temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		return count;
	}
	
}
