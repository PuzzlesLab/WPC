#include <cstdio>

using namespace std;


int main(){
	int step, mod;
	
	while(scanf("%d %d",&step,&mod)!=EOF){
		bool selected[mod];
		int seed = 0;
		selected[seed]=true;
		
		for(int i=1;i<mod;i++){
			selected[i]=false;
		}
		
		bool good =true;
		for(int i=1;i<mod;i++){
			seed = (seed+step)%mod;
			if(selected[seed]){
				good =false;
				break;
			}
			selected[seed]=true;
		}
		
		if(good){
			printf("%10d%10d    Good Choice\n\n",step,mod);
		}
		else{
			printf("%10d%10d    Bad Choice\n\n",step,mod);
		}
		
		
	} 
}