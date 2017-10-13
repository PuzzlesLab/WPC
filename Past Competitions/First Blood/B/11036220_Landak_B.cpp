#include <stdio.h>
#include <iostream>
#include <vector>

using namespace std;

int main()
{
	float body[10000]={};
	int ans[10000]={};
	int cou=0;
	float x=1.00;
	while ( x!= 0.00)
	{
		scanf("%f", &x);
		if ( x == 0.00)
			break;
		body[cou]=x;
		cou++;
	}
	for ( int it=0; it<cou; it++ )
	{
		float temp=0.00;
		for( int i=2; temp<body[it]; i++ )
		{
			temp+= 1.00/i;
			ans[it]++;
		}
	}
	for( int i=0; i<cou; i++)
	{
		printf("%d card(s)\n", ans[i]);
	}
	
}