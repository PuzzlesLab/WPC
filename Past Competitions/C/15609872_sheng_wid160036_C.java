import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) {
		LinkedList<StringBuilder> out;
		StringBuilder sb;
		int t;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			while(true) {
				sb = new StringBuilder();
				out = new LinkedList<>();
				out.add(sb);
				for (char c : br.readLine().toCharArray()) {
					if (c == '[') {
						sb = new StringBuilder();
						out.addFirst(sb);
					}
					else if (c == ']') {
						sb = new StringBuilder();
						out.addLast(sb);
					}
					else
						sb.append(c);
				}
				out.forEach((i) -> {
					System.out.print(i);
				});
				System.out.println();
			}
		} catch( Exception e ) {}
	}
}