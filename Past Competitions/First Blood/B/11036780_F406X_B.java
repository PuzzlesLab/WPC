import java.util.Scanner;
import java.util.Arrays;
public class Main {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
float[] input = new float[100];
int input_count=0;
String answer="";
float compare=0;
int round=1;
while(1==1) {
input[input_count]=scan.nextFloat();
scan.nextLine();
if(input[input_count]<0.01)
	break;
if(input[input_count]>5.20)
	break;
input_count++;
}

for(int count=0;count<input_count;count++) {
round=1;
compare=0;

while(compare<input[count]) {
compare += 1.0f/(round+1);	
round++;
}

System.out.printf("%d card(s)\n",round-1);
}

}//End of Main Program


}//End of Class
