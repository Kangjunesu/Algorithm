class Solution {
    public int solution(int left, int right) {
        int answer = 0;
                for(int a=left; a<=right; a++){
            int cnt =0;
            for(int b=1; b<=a; b++){
                if(a%b==0){ //약수라면
                    cnt++;
                }
            }
            answer += cnt%2==0 ? a : -a;
        }
        return answer;
    }
}