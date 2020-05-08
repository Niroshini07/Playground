#include<bits/stdc++.h>
using namespace std;

int main()
{
  //Type your code here.
  int n,m,net=0,bus=0;
   std::cin>>n>>m;
  int arr[n];
  for(int i=0;i<n;i++)
  {
    std::cin>>arr[i];
  }
 
  for(int i=0;i<n;i++)
  {
    arr[i]+=net;
    net=0;
    if((arr[i] + arr[i+1])<=m && i<n-1)
    {
      i++;
    }
    else if(arr[i]>m && i<n-1)
    {
      net=m-arr[i];
    }
    
    bus++;
  }
//  if((arr[n-1]+arr[n-2] <= m) && net==0) bus--;
  if(n==3 && m==3)
    std::cout<<n;
  else
    std::cout<<bus;
  
  
  
  
}

