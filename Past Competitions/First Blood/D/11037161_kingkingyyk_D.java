import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

	public static void main (String [] lol) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			int n=Integer.parseInt(st.nextToken());
			int k=Integer.parseInt(st.nextToken());
			if (n==0 && k==0) break;
			else {
				ArrayList<Integer> ans=new ArrayList<>();
				
				LinkedList<Integer> queue=new LinkedList<>();
				for (int i=0;i<n;i++) queue.add(i);
				
				int [] studentAmount=new int [n];
				int currAmount=0;
				int loop=1;
				while (queue.size()>0) {
					if (currAmount==0) {
						currAmount=loop;
						loop++;
						if (loop>k) loop=1;
					}
					
					int currStudent=queue.removeFirst();
					if (studentAmount[currStudent]+currAmount<40) {
						studentAmount[currStudent]+=currAmount;
						currAmount=0;
						queue.addLast(currStudent);
					} else {
						currAmount=currAmount-(40-studentAmount[currStudent]);
						studentAmount[currStudent]=40;
						ans.add(currStudent+1);
					}

				}
				
				for (int i=0;i<ans.size();i++) System.out.printf("%3d",ans.get(i));
				System.out.println();
			}
		}
	}
	
}
