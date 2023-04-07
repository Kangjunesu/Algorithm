class Solution {
    public long solution(int price, int money, int count) {
        long answer;
        long sum =0;
        
         for(int i =0; i<count; i++){
            sum += price*(i+1);
        }
        
         answer = money>sum ? 0 : sum-money;

        return answer;
    }
}