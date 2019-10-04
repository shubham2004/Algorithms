#include<bits/stdc++.h>
typedef long long int ll;
#define for(i,a,b) for(ll i=a;i<b;i++)
using namespace std;
int main()
{
ios::sync_with_stdio(0);
//cin.tie(0);
ll no=0,k=0;
cout<<"ENTER NUMBER OF ELEMENTS IN AN ARRAY:"<<"\n";
cin>>no;
ll arr[no];
cout<<"ENTER NUMBERS IN ASCENDING ORDER:"<<"\n";
for(i,0,no)
cin>>arr[i];
cout<<"ENTER NUMBER to be search"<<"\n";
cin>>k;
ll l=0,u=no,mid,flag=0;
while(l<=u)
{ 
      mid=(u+l)/2;
	  if(arr[mid]<k)
	  l=mid+1;
	  else
	  {
		      
	         if(arr[mid]>k)
	          u=mid-1;
	        else
	            {
				
				if(arr[mid]==k)
            	  { flag=1;
	  	            cout<<"ELEMENT FOUND AT INDEX:"<<" "<<mid<<"\n";
	  	            break;
	              }     	
                }
       }
}

if(flag==0)
{
	cout<<"ELEMENT NOT FOUND"<<"\n";
}
}

