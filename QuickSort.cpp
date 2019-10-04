//QUICK SORT ALGORITHM O(n*logn) ALGORITHM FOR SORTING  A GIVEN DATASET IT CAN GET WORST TIME TO O(n^2) TO REDUCE THIS WE USE RANDOMIZED ALGORITHM NOT STABLE BUT IN PLACE
#include<bits/stdc++.h>
typedef long long int ll;
#define for(i,a,b) for(ll i=a;i<b;i++)
using namespace std;
ll Partition ( ll arr[],ll start ,ll end) {
    ll i = start + 1;
    ll piv = arr[start] ;           //First Element as pivot
    for(j,start,end+1)  {
   

          if ( arr[ j ] < piv) {
                 swap (arr[ i ],arr[ j ]);
            i += 1;
        }
   }
   swap ( arr[ start ] ,arr[ i-1 ] ) ;  //put the pivot element in its proper place.
   return i-1;                      //return the position of the pivot
}
ll Rand_Partition ( ll arr[],ll start ,ll end ) {
    //choose pivot randomly 
  ll random = start + rand( )%(end-start +1 ) ;

      swap ( arr[random] , arr[start]) ;        //swap pivot with 1st element.
     return Partition(arr,start ,end) ;       //call the above partition function
}
void Quick_Sort(ll arr[], ll p, ll q)
{
	if(p<q)
	{
	ll j=Rand_Partition(arr,p,q-1);
	Quick_Sort(arr,p,j-1);
	Quick_Sort(arr,j+1,q-1);	
	}
}
int main()
{
ios::sync_with_stdio(0);
//cin.tie(0);
ll no;
cout<<"ENTER NO. OF TERMS TO BE SORTED(QUICK SORT)"<<"\n";
cin>>no;
ll arr[no];
for(i,0,no)
cin>>arr[i];
Quick_Sort(arr,0,no);
cout<<"SORTED ARRAY IS (QUICK SORT)"<<"\n";
for(i,0,no)
cout<<arr[i]<<" ";
}

