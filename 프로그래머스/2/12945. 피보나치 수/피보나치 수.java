import java.util.*;

class Solution {
    
    static final long[] mem = new long[100001];
    
    static long fibonacci(int n){
        if(n==0 || n ==1) return n;
        if(mem[n]!=-1) return mem[n];
        
        return mem[n] = (fibonacci(n-1) + fibonacci(n-2))%1234567;
        
    }
    public long solution(int n) {
        Arrays.fill(mem,-1);
        
        return fibonacci(n);
    }
}