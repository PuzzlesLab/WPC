import java.util.Scanner;


public class Main {
    
    public static int max = 10001;
    public static void main(String[] args) {

        
        int[] cubeValue = new int[21];
        for(int i=0; i<cubeValue.length; i++){
            cubeValue[i] = (int)Math.pow((i+1), 3);
        }
        long[] arr = new long[max];
        

        arr[0] = 1;
        for(int i=0; i<cubeValue.length; i++){
            for(int j=cubeValue[i]; j<max; j++){
                arr[j] += arr[j-cubeValue[i]];
            }
            
        }
        
        Scanner sc = new Scanner(System.in);
        int input;
        
        while(sc.hasNextInt()){
            input = sc.nextInt();
            
            //Output
            System.out.println(arr[input]);
            
        }
        
    }
}
