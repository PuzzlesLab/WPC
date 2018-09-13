#include <iostream>
#include <string>
#include <stdlib.h>
#include <math.h>
using namespace std;
int stols(string binaryString);
int main ()
{
  int size;
  cin >> size;
  string data[9];
  int i;
  //char input[];
  for (i = 0; i < size; i++)
    {
      cin >> data[i];
    }
  for (i = 0; i < size; i++)
    {
      cout << stols (data[i].substr(0, 8)) << '.' << stols (data[i].substr(8, 8)) << '.' << stols (data[i].substr(16,8)) << '.' <<stols (data[i].substr(24, 8)) << '\n';
    }
  return 0;
}

int stols(string binaryString){
    int value = 0;
    int indexCounter = 0;
    for(int i=binaryString.length()-1;i>=0;i--){
    
        if(binaryString[i]=='1'){
            value += pow(2, indexCounter);
        }
        indexCounter++;
    }
    return value;
}