import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double c;
        do{
            c = s.nextDouble();
            int i=2;
            for(double l = 0; l < c; i++){
                l += (double)1/i;
            }
            if(c>0){
            System.out.println((i-2) + " card(s)");
            }
        }while(c > 0);
    }
    
}
