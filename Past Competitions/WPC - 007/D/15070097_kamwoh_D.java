import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int[] f = new int[31];
		f[0] = 1;
		f[2] = 3;
		for (int i=4;i<=30;i+=2){
			f[i] = 4*f[i-2] - f[i-4];
		}

		Scanner scan = new Scanner(System.in);
		while(true){
			int n = scan.nextInt();
			if (n == -1)
				break;
			System.out.println(f[n]);
		}
	}
}