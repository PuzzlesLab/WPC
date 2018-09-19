//i love BigInteger but forget to eat.. gg
//too hungry ... gg
import java.math.BigInteger;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    String input1_s, input2_s;
	    BigInteger input1, input2, ans;
	    ans = BigInteger.valueOf(0);
	    char sign ;
	    Scanner sc = new Scanner(System.in);
	    while(sc.hasNext()){
	        input1_s = sc.next();
	        sign = sc.next().charAt(0);
	        input2_s = sc.next();
	        input1 = new BigInteger(input1_s);
	        input2 = new BigInteger(input2_s);
	        System.out.println(input1_s + " "+ sign+" " + input2_s);
	        if(input1.compareTo(BigInteger.valueOf(2147483647))==1){
	            System.out.println("first number too big");
	        }
	        if(input2.compareTo(BigInteger.valueOf(2147483647))==1){
	            System.out.println("second number too big");
	        }
	        
	        if(sign == '+'){
	            ans = input1.add(input2);
	        }else if(sign == '*'){
	            ans = input1.multiply(input2);
	        }
	        
	        if(ans.compareTo(BigInteger.valueOf(2147483647))==1){
	            System.out.println("result too big");
	        }
	    }
		//System.out.println("Hello World");
	}
}