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
			int [] v=new int [128];
			v['A']=0;
			v['C']=1;
			v['G']=2;
			v['T']=3;
			
			this.value=s;
			char [] sAry=s.toCharArray();
			for (int i=0;i<sAry.length-1;i++) for (int i2=i+1;i2<sAry.length;i2++) {
				int zz=v[sAry[i]]-v[sAry[i2]];
				if (zz>0) this.sorted++;
			}
			
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