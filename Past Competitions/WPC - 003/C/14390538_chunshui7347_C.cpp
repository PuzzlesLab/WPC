#include <iostream>
#include <cmath>
#include <cstring>

using namespace std;

int binarytodecimal(char s[]){
	
	int decimal=0;
	int length= strlen(s);
	int power=0;
	for(int i=length-1;i>=0;i--){
		decimal = decimal + (s[i]-'0')*pow(2,power);
		power++;

	}
	return decimal;
}

int GCD(long num1,long num2){
	if(num2>num1)
		return GCD(num2,num1);
		
	if(num2==0)
		return num1;
		
	else{
		return GCD(num2,num1%num2);
	}
}


int main(){
	int num; 
    char num1[32],num2[32];
	scanf("%d\n", &num);

	int t=1;
	while(num--){
		gets(num1);
		gets(num2);
		
		int x=binarytodecimal(num1);
		int y=binarytodecimal(num2);
	

		int gcd = GCD(x,y);
		
	
        if(gcd != 1)
            printf("Pair #%d: All you need is love!\n", t);
        else
            printf("Pair #%d: Love is not all you need!\n", t);
            
        t++;
    }
	
		
	

}
