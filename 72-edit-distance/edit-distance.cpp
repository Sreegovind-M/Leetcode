class Solution {

// private: 
//     float maxDist(int i, int j, string &word1, string &word2, int &n, int &m, vector<vector<float>>&dp)
//     {
//         if(i>=n || j>=m)
//         {
//             return 0;
//         }
//         if(word1[i] == word2[j])
//         {
//             return 1 + maxDist(i+1, j+1, word1, word2, n, m, dp);
//         }
//         if(dp[i][j]!=-1)
//         {
//             return dp[i][j];
//         }
//         float val1 = maxDist(i+1, j, word1, word2, n, m, dp);
//         float val2 = maxDist(i, j+1, word1, word2, n, m, dp);
//         float val3 = 0.5 + maxDist(i+1, j+1, word1, word2, n, m, dp);
//         return dp[i][j] = max({val1, val2, val3});
//     }


// Refer above memoized approach for better clarity how we got to tabulated approach.


public:
    int minDistance(string word1, string word2) {
        int n = word1.length();
        int m = word2.length();
        vector<vector<float>> dp(n+1, vector<float>(m+1, 0));

        for(int i=n-1; i>=0; i--)
        {
            for(int j=m-1; j>=0; j--)
            {
                if(word1[i] == word2[j])
                {
                    dp[i][j] = 1 + dp[i+1][j+1];
                }
                else
                {
                    dp[i][j] = max({dp[i][j+1], dp[i+1][j], float(0.5+dp[i+1][j+1])});
                }
            }
        }
        float k = dp[0][0];
        // here k represents maximum similarity we can option like we did in just insert or delete question
        int ans = (m+n) - k*2;
        return ans;
    }
};