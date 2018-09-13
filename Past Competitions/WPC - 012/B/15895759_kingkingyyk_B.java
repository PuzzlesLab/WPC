import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {


    public static void main(String[] args) throws Exception {
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	String s;
    	int t=1;
    	while (!(s=br.readLine()).equals("0 0 0 0")) {
    		StringTokenizer st=new StringTokenizer(s);
    		int Z=Integer.parseInt(st.nextToken());
    		int I=Integer.parseInt(st.nextToken());
    		int M=Integer.parseInt(st.nextToken());
    		int L=Integer.parseInt(st.nextToken());
    		
    		int ans=0;
    		int [] loop=new int [M];
    		loop[L%M]=1;
    		for (int i=2;true;i++) {
    			int currL=(Z*L+I)%M;
    			if (loop[currL]!=0) {
    				ans=i-loop[currL];
    				break;
    			} else {
    				loop[currL]=i;
    				L=currL;
    			}
    		}
    		
    		System.out.printf("Case %d: %d\n", t++, ans);
    	}
    }

}