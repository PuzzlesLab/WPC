import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float c, s, k;
		while (true) {
			c = sc.nextFloat();
			if (c == 0.00)
				break;
			s = 0;
			k = 1;
			while (s < c) {
				k++;
				s += 1 / k;
			}
			System.out.println((int) k - 1 + " card(s)");
		}
	}
}