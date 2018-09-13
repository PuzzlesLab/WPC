import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (true) {
            boolean conflict = false;
            boolean[] timetable = new boolean[1000001];
            Arrays.fill(timetable,false);
            String[] input = sc.nextLine().split(" ");
            int n = Integer.parseInt(input[0]);
            int m = Integer.parseInt(input[1]);
            if (n==0 && m==0){
                break;
            }
            for (int i =0;i<n;i++){
                input = sc.nextLine().split(" ");
                int start = Integer.parseInt(input[0]);
                int end = Integer.parseInt(input[1]);
                for(int j = start;j<end;j++){
                    if(timetable[j]){
                        conflict = true;
                    }
                    else{
                        timetable[j] = true;
                    }
                }
            }
            for (int i =0;i<m;i++){
                input = sc.nextLine().split(" ");
                int start = Integer.parseInt(input[0]);
                int end = Integer.parseInt(input[1]);
                int interval = Integer.parseInt(input[2]);
                for (int j=start;j<timetable.length;j+=interval,end+=interval) {
                    for(int k = j;k<end && k<timetable.length;k++){
                        if(timetable[k]){
                            conflict = true;
                        }
                        else{
                            timetable[k] = true;
                        }
                    }
                }
            }
            if (conflict){
                System.out.println("CONFLICT");
            }
            else {
                System.out.println("NO CONFLICT");
            }
        }
    }
}
