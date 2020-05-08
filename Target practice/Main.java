#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
   int num, sum=0, count, n;
    cin>>num;
    for(count=0;sum<num;count++)
    {
         cin>>n;
        sum=sum+n; 
    }
    cout<<"The number of turns is "<<count;
    return 0;
}