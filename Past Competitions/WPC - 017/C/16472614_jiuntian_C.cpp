#include <iostream>
#include <cmath>
#include <iomanip>
using namespace std;
//why want to do so hard .... only able to understand one nia
//gg second try done udebug
//Haversine formula
//https://www.movable-type.co.uk/scripts/latlong.html
double dist(double lat1, double lon1, double lat2, double lon2){
    double R = 6371e3; // k_metres
    const double PI = 3.14159265;
    double p1 = lat1*PI/180;
    double p2 = lat2*PI/180;
    double dp = (lat2-lat1)*PI/180;
    double ds = (lon2-lon1)*PI/180;
    
    double a = sin(dp/2) * sin(dp/2) +
            cos(p1) * cos(p2) *
            sin(ds/2) * sin(ds/2);
    double c = 2 * atan2(sqrt(a), sqrt(1-a));
    
    double d = R * c;
    
    return d;
}

int main()
{
    int n;
    while(cin>>n){
        double lat[n], lon[n];
        double dis[n][n];
        for(int i=0; i<n;i++) cin>>lat[i]>>lon[i];
        
        for(int i=0; i<n; i++)
            for(int j=0; j<n;j++)
                dis[i][j] = dis[j][i] = dist(lat[i], lon[i], lat[j], lon[j]);
                
        double min = 1e20;//a randon fucking big possible number in earth distance
        int index = 0;
        for(int i=0; i<n; i++){
            double max = 0;
            for(int j=0; j<n; j++){
                if(dis[i][j]>=max+1e-16){ //find the max in each j component
                    max= dis[i][j];
                }
            }
            if(max<=min){//if the max from j is still less than min in i, then it confirm lowest le
                min = max;
                index = i;
            }
        }
        
        cout << setprecision(2) << fixed << lat[index] << " " << lon [index] <<endl;
    }
    return 0;
}