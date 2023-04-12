import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        //n-1 의 약수를 List
        //n을 약수들로 나눈 것중 1이 되는 것중 가장 작은 것

        List<Integer> yaksu = new ArrayList<>();

        for(int i=1; i<n; i++){
            if((n-1)%i==0){
                yaksu.add(i);
            }
        }        

        for(int a : yaksu){
            if(n%a==1){
                answer = a;
                break;
            }
        }
        return answer;
    }
}