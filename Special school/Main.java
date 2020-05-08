#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  //Type your code here.
  int len,co=0,n,i,j;
  char temp;
  string str1,str2;
  getline(cin,str1);
  getline(cin,str2);
  len = str1.length();
  n=len-1;
  for(i = 0; i <=(len/2); i++)
  {
    temp=str1[i];
    str1[i]=str1[n];
    str1[n]=temp;
    n--;
  }
  for(i=0;i<len;i++)
  {
    for(j=0;j<len;j++)
        {
          if(str1[i]==str2[j])
          {
            str2[j]=0;
           co++;
            break;
          }
        }
  }
  if(co==len)
    cout<<"It is correct";
  else
    cout<<"It is wrong";
}