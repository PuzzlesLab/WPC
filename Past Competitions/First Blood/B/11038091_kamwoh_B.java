import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        while (true) {
            float c = read.nextFloat();

            if (c == 0)
                break;

            int count = 1;
            int n = 2;
            float harmonic_sum = 1 / (float) n;
            while (harmonic_sum < c) {
                n += 1;
                harmonic_sum += 1 / (float) n;
                count += 1;
            }
            System.out.printf("%d card(s)\n", count);
        }
    }

}
