import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int coconut = s.nextInt();
        while (coconut != -1) {
            if (coconut > 0) {
                calculate(coconut);
            } else {
                System.out.println(coconut + " coconuts, no solution");
            }
            coconut = s.nextInt();
        }

    }

    private static void calculate(int n) {

        int people = (int) Math.sqrt(n);
        people = people + 1;
        boolean noSolution = true;

        while (people >= 2) {
            int coconut = n;
            int count = 0;
            while (count < people && (coconut % people) == 1) {
                coconut = coconut - (coconut / people) - 1;
                count++;
            }
            if ((coconut % people) == 0 && count == people) {
                noSolution = false;
                break;
            }
            people--;
        }

        if (noSolution) {
            System.out.println(n + " coconuts, no solution");
        } else {
            System.out.println(n + " coconuts, " + people + " people and 1 monkey");
        }

    }

}