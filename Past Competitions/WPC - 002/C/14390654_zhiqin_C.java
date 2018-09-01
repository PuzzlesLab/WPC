import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cases = Integer.parseInt(sc.nextLine());
        for(int i =1;i<=cases;i++){
            int s1 = Integer.parseInt(sc.nextLine(),2);
            int s2 = Integer.parseInt(sc.nextLine(),2);
            int gcd = gcd(s1,s2);
            if(gcd!=1){
                System.out.println("Pair #"+i+": All you need is love!");
            }
            else{
                System.out.println("Pair #"+i+": Love is not all you need!");
            }
        }

    }
    public static int gcd(int a,int b){
        if (b>a){
            return gcd(b,a);
        }
        if(b==0){
            return a;
        }
        else{
            return gcd(b,a%b);
        }
    }

}
