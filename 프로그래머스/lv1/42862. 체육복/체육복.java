import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        for(int i =0; i< lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                if(lost[i]==reserve[j]){
                    lost[i]=1000;
                    reserve[j]=1000;
                    break;
                }
            }
        }
        
        Arrays.sort(lost);
        List<Integer> lostList = new ArrayList<>();
        for(int a: lost){
            if(a!=1000) {
                lostList.add(a);
            }
        }
        
        int count =0;
        for(int i =0; i<reserve.length; i++){
            if(reserve[i]!=1000){
                count++;
            }
        }
        
        Arrays.sort(reserve);
        int[][] renderPossible = new int[count][3];
        for(int i=0; i<reserve.length; i++) {
           if(reserve[i]!=1000){
                for (int j = 0; j < 3; j++) {
                    renderPossible[i][j] = reserve[i] + j - 1;
                }
            }
        }

        for(int i=0; i< renderPossible.length; i++) {
            for (int j = 0; j < lostList.size(); j++) {
                for(int k =0; k<3; k++){

                    if(Objects.equals(renderPossible[i][k], lostList.get(j))){
                        renderPossible[i][k]=0;
                        lostList.remove(j);
                        break;
                    }

                }
            }
        }

        answer = n - lostList.size();
        return answer;
    }
}