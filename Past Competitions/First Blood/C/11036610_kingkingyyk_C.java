import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static class Data implements Comparable<Data> {
		String value;
		int sorted;
		int order;
		
		public Data (String s, int o) {
			this.value=s;
			for (int i=0;i<s.length()-1;i++) for (int i2=i+1;i2<s.length();i2++) if (s.charAt(i)>s.charAt(i2)) this.sorted++;
			
			this.order=o;
		}
		
		@Override
		public int compareTo(Data arg0) { 
			if (this.sorted!=arg0.sorted) return this.sorted-arg0.sorted;
			else return this.order-arg0.order;
		}
		
	}
	public static void main (String [] lol) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int length=Integer.parseInt(st.nextToken()); //Not used.
		int dataCount=Integer.parseInt(st.nextToken());
		
		Data [] d=new Data[dataCount];
		for (int i=0;i<dataCount;i++) d[i]=new Data(br.readLine(),i);
		
		Arrays.sort(d);
		
		for (int i=0;i<dataCount;i++) System.out.println(d[i].value);
	}
	
}