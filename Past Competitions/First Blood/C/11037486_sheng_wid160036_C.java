import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		class Pair implements Comparable<Pair> {
			int val;
			String dna;

			public Pair(int val, String dna) {
				this.val = val;
				this.dna = dna;
			}

			@Override
			public int compareTo(Pair p) {
				return val - p.val;
			}

		}

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		Pair[] pairs = new Pair[m];
		sc.nextLine();
		while (m --> 0) {
			String str = sc.nextLine();
			char[] input = str.toCharArray();
			int s = 0;
			for (int i = 0; i < input.length - 1; i++) {
				for (int j = i + 1; j < input.length; j++) {
					if (input[i] > input[j])
						s++;
				}
			}
			pairs[m] = new Pair(s, str);
		}
		Arrays.sort(pairs);
		for (Pair p : pairs) {
			System.out.println(p.dna);
		}
	}
}