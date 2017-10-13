#include<iostream>
using namespace std;


int main(){
	double length;
	
	cin>>length;
	while(length!=0){
	
	double sum=0,i=2;
	int c=0;
	while(sum<length){
		sum+=(1/i);
		i++;
		c++;
	}
	
	cout<<c<<" card(s)"<<endl;

	cin>>length;
}
	return 0;
}