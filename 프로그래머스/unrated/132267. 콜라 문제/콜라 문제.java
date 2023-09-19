import java.util.*;

class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;

        while (n >= a) {
            int k = (n / a) * b;
            answer += k;
            n = (n % a) + k;
        }

        return answer;
    }
}
