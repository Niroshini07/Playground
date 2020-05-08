#include <bits/stdc++.h> 
using namespace std; 

// To count the no. of digits in a number 
void count_digits(int n) 
{ 
	// converting number to string using 
	// to_string in C++ 
	string num = to_string(n); 

	// calculate the size of string 
	cout << num.size() << endl; 
} 
// driver function 
int main() 
{ 
	// number 
	int n ;
  cin>>n;
	count_digits(n); 
	return 0; 
} 
// Code is contributed by <a href="https://auth.geeksforgeeks.org/user/Shashank_Pathak/profile">Shashank Pathak</a> 
