import java.util.*;
import java.io.*;

public class Main{

	public static void main(String args[]) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		s=br.readLine();
		int n = Integer.parseInt(s);

		
		for(int i=0;i<n;i++){
			s=br.readLine();
			StringTokenizer st = new StringTokenizer(s);
			int r = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			int ad = e - c;

			if (r > ad) {
				System.out.println("do not advertise");
			} else if (r == ad) {
				System.out.println("does not matter");
			} else {
				System.out.println("advertise");
			}
			
		}
		
	}

}