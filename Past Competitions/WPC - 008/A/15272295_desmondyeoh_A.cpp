#include <iostream>

using namespace std;

int main() {
    int n; 
    char k;
    int b10;
    cin >> n;
    for (int kk = 0; kk < n; kk++ ){
        for (int jj = 0; jj < 4; jj ++ ){
            b10 = 0;
            for(int i = 0; i < 8; i++){
                cin >> k;
                b10 <<= 1;
                if(k=='1'){
                    b10 += 1;
                }
            }
            if (jj < 3) {

                cout << b10 << '.';
            } else {

                cout << b10 << endl;
            }
        }
    }

    
}