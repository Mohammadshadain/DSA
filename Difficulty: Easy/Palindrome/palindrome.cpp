//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
// User function Template for C++

class Solution {
  public:
    bool isPalindrome(int n) {
        // Code here.
        int val = n ;
        int ans = 0;
        while(val > 0){
            int lastdigit = val%10;
            ans = ans*10 + lastdigit;
            val = val/10;
        }
        return ans == n;
    }
};


//{ Driver Code Starts.

int main() {
    int T;
    cin >> T;
    while (T--) {
        int n;
        cin >> n;
        Solution ob;
        bool ans = ob.isPalindrome(n);
        cout << (ans ? "true" : "false") << "\n~\n";
    }
    return 0;
}

// } Driver Code Ends