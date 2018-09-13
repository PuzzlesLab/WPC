import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static boolean prime[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> primes = sieve(1000000);
        while (true){
            int n = Integer.parseInt(br.readLine());
            boolean solved = false;
            if (n==0){
                break;
            }
            for(int i =0;i<primes.size();i++){
                Integer temp = primes.get(i);
                if(prime[n-temp]){
                    System.out.println(n+ " = "+temp+" + "+(n-temp));
                    solved=true;
                    break;
                }
            }
            if(!solved){
                System.out.println("Goldbach's conjecture is wrong.");
            }

        }
    }
    public static List<Integer> sieve(int n) {
        prime = new boolean[n + 1];
        Arrays.fill(prime, true);
        for (int p = 2; p * p <= n; p++) {
            if (prime[p]) {
                for (int i = p * 2; i <= n; i += p) {
                    prime[i] = false;
                }
            }
        }
        List<Integer> primeNumbers = new LinkedList<>();
        for (int i = 2; i <= n; i++) {
            if (prime[i]) {
                primeNumbers.add(i);
            }
        }
        return primeNumbers;
    }
}
