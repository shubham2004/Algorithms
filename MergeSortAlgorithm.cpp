//MERGE SORT ALGORITHM O(n*logn) ALGORITHM FOR SORTING  A GIVEN DATASET. BASICALLY NOT IN PLACE BUT STABLE
#include<bits/stdc++.h>
typedef long long int ll;
#define for(i,a,b) for(ll i=a;i<b;i++)
using namespace std;
void Merge(ll arr[], ll p,ll r,ll q)
{
	ll n1=r-p+1;
	ll n2=q-r;
	ll l[n1],ri[n2];
	for(i,0,n1)
	{
		l[i]=arr[p+i];
	}
	for(i,0,n2)
	{
		ri[i]=arr[r+i+1];
	}
	ll i=0,j=0,k=p;
	while(i<n1&&j<n2)
	{
		if(l[i]<=ri[j])
		{
		arr[k]=l[i];
        i++;	
	}
	else
	{
		arr[k]=ri[j];
		j++;
	}
	k++;
}
while(i<n1)
{
	arr[k]=l[i];
	i++;
	k++;
}
while(j<n2)
{
	arr[k]=ri[j];
	j++;
	k++;
}
}
void Merge_sort(ll arr[], ll p , ll q)
{
	if(p<q)
	{ ll r=(p+q)/2;
		Merge_sort(arr,p,r);
		Merge_sort(arr,r+1,q);
		Merge(arr,p,r,q);
	}
}



int main()
{
ios::sync_with_stdio(0);
//cin.tie(0);
cout<<"ENTER NO. OF TERMS TO BE SORTED(MERGE SORT)"<<"\n";
ll no;
cin>>no;
ll arr[no];
for(i,0,no)
cin>>arr[i];
Merge_sort(arr,0,no-1);

cout<<"SORTED ARRAY IS (MERGE SORT)"<<"\n";
for(i,0,no)
cout<<arr[i]<<" ";
}

