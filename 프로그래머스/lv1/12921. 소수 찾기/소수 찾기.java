import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        boolean[] primes = new boolean[n + 1]; // 소수를 저장할 배열
        Arrays.fill(primes, true); // 일단 모든 수를 소수로 가정하고 시작
        primes[0] = false;
        primes[1] = false;

        for (int i = 2; i <= Math.sqrt(n); i++) { // 2부터 n의 제곱근까지만 탐색
            if (primes[i]) { // i가 소수이면
                for (int j = i * i; j <= n; j += i) { // i의 배수들을 모두 제외시킴
                    primes[j] = false;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (primes[i]) { // 소수의 개수를 세기 위해 true인 원소의 개수를 센다
                answer++;
            }
        }

        return answer;
    }
}