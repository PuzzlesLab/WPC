import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        for(int i =0;i<t;i++){
            sc.nextLine();
            String[] input = sc.nextLine().split(" ");
            int[] arr = new int[input.length];
            for(int j =0;j<input.length;j++){
                arr[j] = Integer.parseInt(input[j]);
            }
            maxSubarray(arr);
        }
    }
    public static void maxSubarray(int[] arr){
        int max = arr[0];
        int temp = arr[0];
        int subsequenceNegative = arr[0];
        int subsequencePositive = Math.max(arr[0],0);
        for(int i =1;i<arr.length;i++){
            temp = Math.max(arr[i],temp+arr[i]);
            max = Math.max(temp,max);
            subsequencePositive += Math.max(arr[i],0);
            subsequenceNegative = Math.max(arr[i],subsequenceNegative);
        }
        if (subsequencePositive==0){
            subsequencePositive = subsequenceNegative;
        }
        System.out.println(max+" "+subsequencePositive);
    }
}
