#include <iostream>
#include <string>
using namespace std;

int main()
{
    int L,N;
    char liness;
    cin >> L >> N ;
    string L_singular[L] ;
    string L_plurar[L] ;
	string N_list[N+1];
	for(int i=0; i<L;i++){
		cin >> L_singular[i] >> L_plurar[i] ;
	} 
	
	for(int i=0; i<=N; i++){
	    bool fuck = false;
		getline(cin,N_list[i]);
		for(int j=0; j<L;j++){
		        if(N_list[i]==L_singular[j]){
		            cout << L_plurar[j] <<endl;
		            fuck = true;
		        }
	   }
	   if (fuck ==false && N_list[i] != "") {   
	    if(N_list[i].back()=='y'&& N_list[i][N_list[i].length() - 2]!='e'&& N_list[i][N_list[i].length() - 2]!='a'&& N_list[i][N_list[i].length() - 2]!='i'&& N_list[i][N_list[i].length() - 2]!='o'&& N_list[i][N_list[i].length() - 2]!='u'){
	        N_list[i].pop_back();
	        N_list[i].push_back('i');
	        N_list[i].push_back('e');
	        N_list[i].push_back('s');
	        cout << N_list[i] <<endl;
	    }//case 2
	    else if(N_list[i].back()=='o'||N_list[i].back()=='s'||N_list[i].back()=='x'){
	        N_list[i].push_back('e');
	        N_list[i].push_back('s');
	        cout << N_list[i] <<endl;
	    }
	    else if(N_list[i].substr( N_list[i].length() - 2 ) == "ch"||N_list[i].substr( N_list[i].length() - 2 ) == "sh"){
	        N_list[i].push_back('e');
	        N_list[i].push_back('s');
	        cout << N_list[i] <<endl;
	    }//case 3
	    else {
	        N_list[i].push_back('s');//case 4
	        cout << N_list[i] <<endl;
	        
	    }
	   }
	}
    return 0;
}