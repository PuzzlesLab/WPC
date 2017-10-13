#include <iostream>
using namespace std;

int main(){
    double num;
    while(cin >> num){
        if(num == 0.00){
            break;
        }
        int i = 2;
        double ans = 0;
        if(num < 0.5){
             cout<<"1 card(s)"<<endl;
             continue;
        }
        while(ans <= num){
            ans = ans + (1 / (double)i);
            i++;
        }
        cout<<i - 2<<" card(s)"<<endl;
    }
    return 0;
}
