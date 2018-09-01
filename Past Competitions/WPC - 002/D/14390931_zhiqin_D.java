import java.util.Scanner;

public class Main {
    static long[][] C = new long[51][51];
    public static long C (int n, int r){
        if(n<0||r<0){
            return 0;
        }
        else if(r>n){
            return C[n][r]=0;
        }
        else if(C[n][r]!=0){
            return C[n][r];
        }
        else {
            return C[n][r]=C(n-1,r-1)+C(n-1,r);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        C[0][0]=1;
        int cases = Integer.parseInt(sc.nextLine());
        for(int i =1;i<=cases;i++){
            String input = sc.nextLine();
            String a = input.substring(input.indexOf('(')+1,input.indexOf('+'));
            String b = input.substring(input.indexOf('+')+1,input.indexOf(')'));
            int n = Integer.parseInt(input.substring(input.indexOf('^')+1,input.length()));
            StringBuilder out = new StringBuilder();
            out.append("Case "+i+": ");
            for(int k=0;k<=n;k++){
                int current = n-k;
                if(C(n,k)>1){
                    out.append(C(n,k));
                    if(current>=1){
                        out.append('*');
                    }
                }
                if(current>=1){
                    out.append(a);
                    if(current>1){
                        out.append("^"+current);
                    }
                    if(k>=1){
                        out.append('*');
                    }
                }
                if(k>=1){
                    out.append(b);
                    if(k>1){
                        out.append("^"+k);
                    }

                }
                if(k!=n){
                    out.append('+');
                }
            }
            System.out.println(out);
        }
    }
}
