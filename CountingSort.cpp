//COUNTING SORT ANLOGITHM SORT THE GIVEN DATASET IN O(n) TIME COMPLEXITY BUT IT CAN BE APPLICABLE FOR SMALLER DATA ENTRIES AS IT USES BOOKING TECHNIQUE
#include<bits/stdc++.h>
typedef long long int ll;
#define for(i,a,b) for(ll i=a;i<b;i++)
using namespace std;
int main()
{
ios::sync_with_stdio(0);
//cin.tie(0);
ll no,largest_number=0;
cout<<"ENTER NO. OF TERMS TO BE SORTED(COUNTING SORT)"<<"\n";
cin>>no;
ll arr[no];
for(i,0,no)
{
cin>>arr[i];
largest_number=max(arr[i],largest_number);
}
ll counting[largest_number+1]={0};       //BAGKEEPING ARRAY
for(i,0,no)
{
	counting[arr[i]]++;
}
cout<<"SORTED ARRAY(COUNTING SORT) "<<"\n";
for(i,0,largest_number+1)
{
	while(counting[i]>0)
	{
		cout<<i<<" ";
		counting[i]--; 
	}
}
}
 
