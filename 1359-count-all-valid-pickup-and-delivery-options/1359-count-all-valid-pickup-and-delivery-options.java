class Solution {
      public int countOrders(int n) {
        final int MOD = 1000000007;
        long result = 1;
        long current = 1;
        while(current < n) {
            long insertSize = current * 2 + 1;
            result *= insertSize + insertSize * (insertSize - 1) / 2;
            result %= MOD;
            current++;
        }
        
        return (int)result;
    }
}