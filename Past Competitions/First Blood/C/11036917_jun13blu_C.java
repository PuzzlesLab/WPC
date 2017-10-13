import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int l = s.nextInt(), n = s.nextInt();
        int[] a = new int[n];
        String[] dna = new String[n];
        for(int i = 0; i < n; i++) {
            dna[i] = s.next();
            int count = 0;
            for(int j = 0; j < l; j++) {
                for(int k = j + 1; k < l; k++) {
                    if(dna[i].charAt(j) > dna[i].charAt(k)) {
                        count++;
                    }
                }
            }
            a[i] = count;
        }
        for(int i = 0; i< a.length; i++) {
            for(int j = 0; j< a.length; j++) {
                if(a[i] < a[j]) {
                    int tmp = a[i];
                    String t = dna[i];
                    a[i] = a[j];
                    a[j] = tmp;
                    dna[i] = dna[j];
                    dna[j] = t;
                }
            }
        }
        for(int i = 0; i < a.length; i++) {
            System.out.println(dna[i]);
        }
        
    }
    
}