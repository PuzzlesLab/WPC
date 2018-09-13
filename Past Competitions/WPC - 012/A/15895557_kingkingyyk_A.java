import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

class Main {


    public static void main(String[] args) throws Exception {
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	int T=Integer.parseInt(br.readLine());
    	for (int t=0;t<T;t++) {
    		StringTokenizer st=new StringTokenizer(br.readLine(), " / ");
    		BigInteger n=new BigInteger(st.nextToken());
    		BigInteger d=new BigInteger(st.nextToken());
    		
    		BigInteger gcd=n.gcd(d);
    		
    		System.out.println(n.divide(gcd).toString()+" / "+d.divide(gcd).toString());
    	}
    }

}