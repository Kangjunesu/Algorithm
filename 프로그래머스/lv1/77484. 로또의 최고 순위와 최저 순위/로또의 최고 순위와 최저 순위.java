import java.util.*;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
               int[] answer = new int[2];

      

//0. 0의 갯수를 먼저 확인 ( 다 맞거나, 다 틀리거나로 나누면 될듯)
        int zero = 0;
        for(int i =0; i< lottos.length; i++){
            if(lottos[i]==0){
                zero++;
            }
        }

        int cnt;
        if(zero==0){  //0인것이 한개도 없다면.
            ArrayList<Integer> lottosList = new ArrayList<>();
            for(int a : lottos){
                    lottosList.add(a);
            }
             cnt=0;
            for(int a : win_nums){
                if(lottosList.contains(a)){
                    cnt++;
                }
            }

//1. 0을 제외한 lottos의 값들과 <-> win_nums의 값을 비교.
        }else{  // 0이 포함되어 있다면.
            ArrayList<Integer> lottosList = new ArrayList<>();
            for(int a : lottos){
                if(a!=0){
                    lottosList.add(a);
                }
            }
            cnt =0;
            for(int a : win_nums){
                if(lottosList.contains(a)){
                    cnt++;
                }
            }
        }  // 0이 있든 없든 맞춘것의 갯수는 cnt로.
//2. 비교한 값중 맞는 것 + 0의 갯수 = 최고순위  // -0의 갯수 = 최저순위
        if(zero==0){  // 0이 하나도 없을 경우
            if(cnt>=2){
                answer[0] = 7-cnt;
                answer[1] = 7-cnt;
            }else{
                answer[0] = 6;
                answer[1] = 6;
            }
        }else{  //0인 것이 있을 경우
            if(cnt!=0){
                answer[0] = 7 - (cnt + zero);
                answer[1] = 7 - cnt;
            }else{  //맞은게 cnt가 0이라면
                answer[0] = 7 - zero;
                answer[1] = 6;
            }

        }
        return answer;
    }
}