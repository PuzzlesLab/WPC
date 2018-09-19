//#include <iostream>
//mother fucker 
#include <iostream>
#include <string.h>
#include <cstdio>
#include <stdio.h>
using namespace std;
int main()
{
    int value;
    char c[15];
    int v[] = { 0, 0, 64, 32, 16, 8, 0, 4, 2, 1, 0};
    gets(c);
    while(gets(c) && c[0]!='_'){
        value=0;
        for (int i =2; i<15; i++){
            if(c[i]=='o') value+=v[i];
        }
        char c1 = static_cast<char> (value);
        printf("%c", value);
    }
    
    
    return 0;
}