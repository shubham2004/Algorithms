//BUBBLE SORT ALGORITHM BASIC O(n^2) ALGORITHM FOR SORTING  A GIVEN DATASET;
#include<bits/stdc++.h>
typedef long long int ll;
#define for(i,a,b) for(ll i=a;i<b;i++)
using namespace std;
int main()
{
ios::sync_with_stdio(0);
//cin.tie(0);
ll no;
cout<<"ENTER NO. OF TERMS TO BE SORTED(BUBBLE SORT)"<<"\n";
cin>>no;
ll arr[no];
for(i,0,no)
cin>>arr[i];
for(i,0,no)
{
	for(j,0,no-1)
	{
		if(arr[j]>arr[j+1])
		{
			swap(arr[j],arr[j+1]);
			
		}
	}
	
}
cout<<"SORTED ARRAY IS (BUBBLE SORT)"<<"\n";
for(i,0,no)
cout<<arr[i]<<" ";
}

