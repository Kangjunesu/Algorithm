import java.util.*;

class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;

        do{
            int k = (n/a)*b;
            answer += k;
            n = (n-(n/a)*a)+k;
        }while (n>=a);
        
        return answer;
    }
}