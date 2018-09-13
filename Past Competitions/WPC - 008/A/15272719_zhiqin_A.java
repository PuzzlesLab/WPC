import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        for (int i =0;i<N;i++){
            String input = sc.nextLine();
            int A = Integer.parseInt(input.substring(0,8),2);
            int B = Integer.parseInt(input.substring(8,16),2);
            int C = Integer.parseInt(input.substring(16,24),2);
            int D = Integer.parseInt(input.substring(24,32),2);
            System.out.println(A+"."+B+"."+C+"."+D);
        }
    }
}
