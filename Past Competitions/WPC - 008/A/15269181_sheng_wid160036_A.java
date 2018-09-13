import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		String s;
		StringBuilder sb;

		n = Integer.parseInt(sc.nextLine());
		while (n --> 0) {
			s = sc.nextLine();
			sb = new StringBuilder();
			for (int i = 0; i < 32; i += 8) {
				sb.append(Integer.parseInt(s.substring(i, i + 8), 2));
				if (i == 24)
					break;
				sb.append(".");
			}
			System.out.println(sb.toString());
		}
	}
}