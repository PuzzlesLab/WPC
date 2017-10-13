import java.util.Scanner;
import java.util.Arrays;
public class Main {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int length = scan.nextInt();
int cases = scan.nextInt();
scan.nextLine();
int largest=0;

String[] input = new String[cases];
int[] measure = new int[cases];
String[] sorted = new String[cases];
int cases_copy = cases-1;
int cases_copy2 = cases;
for(int count=0;count<cases;count++) {
input[count]=scan.nextLine();
}

for(int count=0;count<cases;count++) {
measure[count]=compare(input[count],length);
//System.out.println(measure[count]);
}	

while(cases_copy>=0) {
largest=0;

for(int count=0;count<cases;count++) {
	if(measure[count]<measure[largest]) {
		largest=count;}
}

sorted[cases_copy]=input[largest];
cases_copy--;
measure[largest]=100000000;



}


for(int count=cases_copy2-1;count>=0;count--) {
	System.out.printf("%s\n",sorted[count]);	
}

}//End of Main Program

public static int compare(String input,int len) {
int measure=0;
String compare1="";
String compare2="";

	for(int count_len1=0;count_len1<len;count_len1++) {
		compare1 = input.substring(count_len1,count_len1+1);	
		
		for(int count_len2=count_len1+1;count_len2<len;count_len2++) {	
			compare2 = input.substring(count_len2,count_len2+1);
			//System.out.printf("\n%s / %s : %d",compare1,compare2,compare1.compareTo(compare2));
			if(compare1.compareTo(compare2)>=1)
				measure++;
		}	
	}	

return measure;
}

}//End of Class
