import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.MathContext;

public class Main {

	public static void main (String [] lol) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BigDecimal [] dp=new BigDecimal [277];
		dp[0]=BigDecimal.ZERO;
		MathContext mc=new MathContext(10);
		for (int i=1;i<dp.length;i++) {
			BigDecimal root=BigDecimal.ONE.divide(BigDecimal.ONE.add(BigDecimal.valueOf(i)),mc);
			dp[i]=dp[i-1].add(root);
		}

		while (true) {
			double d=Double.parseDouble(br.readLine());
			if (d==0) break;
			else {
				for (int i=0;i<dp.length;i++) if (dp[i].compareTo(BigDecimal.valueOf(d))>=0) {
					System.out.println(i+" card(s)");
					break;
				}
			}
		}
	}
	
}
