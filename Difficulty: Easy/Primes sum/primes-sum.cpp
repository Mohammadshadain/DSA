//{ Driver Code Starts
// Initial Template for C++
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
// User function Template for C++
class Solution {
public:
  bool prime(int N){
      if(N < 2) return false;
      for(int i =2;i*i<=N;i++){
          if(N%i==0) return false;
      }
      return true;
  }
    string isSumOfTwo(int N){
        int temp1 =N;
        int temp2=0;
        
        
        while(temp1 > 0 && temp2 <= N){
            if(prime(temp1) && prime(temp2)){
                return "Yes";
            }
            temp1--;
            temp2++;
            
        }
        return "No";
    }
};

//{ Driver Code Starts.
int main() {
    int t;
    cin >> t;
    while (t--) {
        int N;
        cin >> N;
        Solution ob;
        cout << ob.isSumOfTwo(N) << endl;
    
cout << "~" << "\n";
}
    return 0;
}

// } Driver Code Ends