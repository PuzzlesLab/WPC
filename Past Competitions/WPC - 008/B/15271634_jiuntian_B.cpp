#include <iostream>
#include<bits/stdc++.h>
using namespace std;
const int MAX = 1000000;
vector <int> primes;
using namespace std;

void findPrimes(int n)
{
    if (n<=2 || n%2 != 0)
    {
        cout << "Invalid Input \n";
        return;
    }
    for (int i=0 ; primes[i] <= n/2; i++)
    {
        int diff = n - primes[i];
        if (binary_search(primes.begin(), primes.end(), diff))
        {
            // Express as a sum of primes
            cout << n << " = " << primes[i] << " + "
                 << diff << endl;
            return;
        }
    }
}
void gg()
{
    bool marked[MAX/2 + 100] = {0};
    for (int i=1; i<=(sqrt(MAX)-1)/2; i++)
        for (int j=(i*(i+1))<<1; j<=MAX/2; j=j+2*i+1)
            marked[j] = true;
    primes.push_back(2);
    for (int i=1; i<=MAX/2; i++)
        if (marked[i] == false)
            primes.push_back(2*i + 1);
}

int main()
{
    gg();
    int a=0;
    while(a==0){
        int input;
        cin >> input;
        if(input == 0){
            a=1;
        }
        else {
            findPrimes(input);
        }
    }
   return 0;
}