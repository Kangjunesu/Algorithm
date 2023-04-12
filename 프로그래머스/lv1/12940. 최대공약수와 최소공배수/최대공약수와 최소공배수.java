import java.util.*;
class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        //각각 약수를 담을 리스트
        ArrayList<Integer> nYaksu = new ArrayList<>();
        ArrayList<Integer> mYaksu = new ArrayList<>();

        for(int i =1; i<=n; i++){
            if(n%i==0){
                nYaksu.add(i);
            }
        }
        for(int i =1; i<=m; i++){
            if(m%i==0){
                mYaksu.add(i);
            }
        }
        
        ArrayList<Integer> gongYaksu = new ArrayList<>(nYaksu);
        gongYaksu.retainAll(mYaksu);  //약수중 공약수만 리스트로
        Collections.sort(gongYaksu);

        //최대공약수
        answer[0] = gongYaksu.get(gongYaksu.size()-1);
        //최소공배수 : 최대공약수 * n/최대공약수 * m/최대공약수  = n*m/최대공약수
        answer[1] = n*m/answer[0];
        
        return answer;        
    }
}