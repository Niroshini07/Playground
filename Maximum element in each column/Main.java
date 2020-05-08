#include<iostream>
#define MAX 10
using namespace std;

int main() 
{ 
	int n , m,i ,j;
  cin>>n>>m;
	int mat[n][m];
  for(i=0;i<n;i++)
  {
    for(j=0;j<m;j++)
    {
      cin>>mat[i][j];
    }
  }
     for (int i = 0; i < m; i++) {
      int max_col_element = mat[0][i];
   for (int j = 1; j < n; j++) {
      if (mat[j][i] > max_col_element)
         max_col_element = mat[j][i];
   }
   cout << max_col_element << endl;
   }
	return 0; 
} 
