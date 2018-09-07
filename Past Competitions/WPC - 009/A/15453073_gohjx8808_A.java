
import java.util.Scanner;


public class Main {
    
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        for(int i=1;i<=a;i++){
            int r=s.nextInt();
            int e=s.nextInt();
            int c=s.nextInt();
            if(e-c>r)
                System.out.println("advertise");
            else if(e-c==r)
                System.out.println("does not matter");
            else
                System.out.println("do not advertise");
        }
    }
}
