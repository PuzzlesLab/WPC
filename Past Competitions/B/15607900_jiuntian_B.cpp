#include <iostream>
#include <string>
using namespace std;

int countofclick (string ayat){
    int count =0;
    for (int i = 0; i < ayat.size(); i++){
        switch(ayat[i]){
            case 'a':
            case 'd':
            case 'g':
            case 'm':
            case 'p':
            case 't':
            case 'w':
            case ' ':
            case 'j':
                count = count + 1;
                break;
            case 'b':
            case 'e':
            case 'h':
            case 'k':
            case 'n':
            case 'q':
            case 'u':
            case 'x':
                count = count + 2;
                break;
            case 'c':
            case 'f':
            case 'i':
            case 'l':
            case 'o':
            case 'r':
            case 'v':
            case 'y':
                count = count + 3;
                break;
            case 's':
            case 'z':
                count = count + 4;
                break;
        }
    }
    return count;
}

int main()
{
    string numberLines;
    int number;
    getline(cin,numberLines);
    number = stoi(numberLines);
    
    for(int i=0; i<number; i++){
        string ayat = "";
        getline(cin, ayat);        
        cout << "Case #" << (i+1) << ": "<<countofclick(ayat) << endl;
    }

    return 0;
}