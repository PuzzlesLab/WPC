import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n, k;
        do {
            n = s.nextInt();
            k = s.nextInt();
            int m = 1;
            int c = 0;
            int r = 0;
            int[] students = new int[n];
            String ans = "";
            while(c < n) {
                for(int i = 0; i < n; i++) {
                    if(students[i] < 40) {
                        if(r > 0) {
                            if(students[i] + r > 40) {
                                r = r - (40 - students[i]);
                                students[i] = 40;
                                String tmp = Integer.toString(i + 1);
                                while(tmp.length() < 3) {
                                    tmp = " " + tmp;
                                }
                                ans = ans + tmp;
                                c++;
                            }
                            else {
                                students[i] += r;
                                r = 0;
                                if(students[i] == 40) {
                                    String tmp = Integer.toString(i + 1);
                                    while(tmp.length() < 3) {
                                        tmp = " " + tmp;
                                    }
                                    ans = ans + tmp;
                                    c++;
                                }
                                if(m < k) {
                                    m++;
                                }
                                else {
                                    m = 1;
                                }
                            }
                        }
                        else {
                            if(students[i] + m > 40) {
                                r = m - (40 - students[i]);
                                students[i] = 40;
                                String tmp = Integer.toString(i + 1);
                                while(tmp.length() < 3) {
                                    tmp = " " + tmp;
                                }
                                ans = ans + tmp;
                                c++;
                            }
                            else {
                                students[i] += m;
                                if(students[i] == 40) {
                                    String tmp = Integer.toString(i + 1);
                                    while(tmp.length() < 3) {
                                        tmp = " " + tmp;
                                    }
                                    ans = ans + tmp;
                                    c++;
                                }
                                if(m < k) {
                                    m++;
                                }
                                else {
                                    m = 1;
                                }
                            }
                        }
                        
                        
                    }
                }
            }
            if(n>0 || k>0) {
                System.out.println(ans);
            }
        }while(n > 0 || k > 0);
        
    }
    
}