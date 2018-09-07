import java.util.Scanner;

public class Main{

    public static void main(String[] args)  {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        for(int i=0;i<x;i++){
            int r = in.nextInt();
            int e = in.nextInt();
            int c = in.nextInt();

            if(e-c>r)
                System.out.println("advertise");
            else if(e-c == r)
                System.out.println("does not matter");
            else
                System.out.println("do not advertise");
        }
    }
}
