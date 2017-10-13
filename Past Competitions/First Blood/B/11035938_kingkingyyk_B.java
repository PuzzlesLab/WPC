import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main (String [] lol) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		double [] dp=new double [277];
		dp[0]=0.0;
		for (int i=1;i<dp.length;i++) dp[i]=dp[i-1]+1.0/(i+1);

		while (true) {
			double d=Double.parseDouble(br.readLine());
			if (d==0) break;
			else {
				for (int i=0;i<dp.length;i++) if (dp[i]>=d) {
					System.out.println(i+" card(s)");
					break;
				}
			}
		}
	}
	
}