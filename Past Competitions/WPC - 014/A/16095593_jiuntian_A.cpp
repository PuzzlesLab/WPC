#include <iostream>
#include <math.h>
#include <iomanip>
#include <cstdio>
#define EPS 1e-8
using namespace std;
// algorithm from https://en.wikipedia.org/wiki/Newton's_method
int p, q, r, s, t, u;

double f(double x){ // function of x
    return p*exp(-x) + q*sin(x) + r*cos(x) + s*tan(x) + t*x*x + u;
}
double fd(double x){ // //this is derivative of the equation, fuck i forget my matrik math
    return -p*exp(-x) + q*cos(x) - r*sin(x) + s/(cos(x)*cos(x)) + 2*t*x;
}
double newton(){ // jom play newton-rapson method
    if (f(0)==0) return 0;
    for (double x=0.5; ;){             // initial x = 0.5
        double x1 = x - f(x)/fd(x);      // x1 = next guess
        if (fabs(x1-x) < EPS) return x;  // the guess is accurate enough with loss less than 1e-7
        x = x1;
    }
}
int main()
{
    while(cin>>p>>q>>r>>s>>t>>u){
        if (f(0) * f(1) > 0){ //for x range 0 to 1
            cout << "No solution"<< endl;
        } else { // set float precision to 4 decimal point
            printf("%.4f\n", newton());
        }
    }
    return 0;
}