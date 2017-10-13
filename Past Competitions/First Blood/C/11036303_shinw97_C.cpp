#include <iostream>
#include <vector>
#include <string>
#include <algorithm>
#include <stdio.h>

using namespace std;

int num_Swap(string str){
    int counter = 0;
    for(int i = 0; i < str.length(); i++){
        for(int j = 0; j < str.length() - 1; j++){
            if(str.at(j) > str.at(j + 1)){
                char temp = str.at(j);
                str.at(j) = str.at(j + 1);
                str.at(j + 1) = temp;
                counter++;
            }
        }
    }
    return counter;
}

int main(){
    vector<string> results;
    vector<string> s;
    vector<int> origin;
    vector<int> sorted;
    int numchar, lines;
    scanf("%d %d", &numchar, &lines);
    for(int j = 0; j < lines; j++){
        string str;
        cin>>str;
        s.push_back(str);
        origin.push_back(num_Swap(str));
        sorted.push_back(num_Swap(str));
    }
    sort(sorted.begin(), sorted.end());
    for(int j = 0; j < sorted.size(); j++){
        int refer = sorted[j];
        for(int k = 0; k < origin.size(); k++){
            if(refer == origin[k]){
                cout<<s[k]<<endl;
                origin.erase(origin.begin() + k);
                s.erase(s.begin() + k);
                break;
            }
        }
    }
}
