#include <iostream>
#include <math.h>
#include <iomanip> 
#define pi 3.14159  /* pi */
using namespace std;
// Algorithm from reference: https://github.com/morris821028/UVa/blob/master/volume111/11130%20-%20Billiard%20bounces.cpp
int main()
{   
    double a, b, v, ang, s;
    while(cin>> a>>b>>v>>ang>>s){
        if (a==0 && b==0 && v==0 && ang==0 && s==0) break;
        double L = s*v/2;
        double H = L*cos(ang/180*pi);
        double V = L*sin(ang/180*pi);
        cout << setprecision(0) <<fixed;
        cout << H/a << " "<< V/b<<endl;
    }
    return 0;
}