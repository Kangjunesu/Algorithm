import java.util.*;


class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        int [][] targetNumber = new int[targets.length][100];;


        for(int i =0; i< keymap.length; i++){  
            for(int j =0; j< keymap[i].length(); j++){ 
                for(int k =0; k< targets.length; k++){
                    for(int o=0; o<targets[k].length(); o++){             
                        if(keymap[i].charAt(j)==targets[k].charAt(o)){
                            if(targetNumber[k][o]==0 || targetNumber[k][o]>j+1){
                                targetNumber[k][o]=j+1;
                            }
                        }
                    }
                }
            }
        }

        for(int k =0; k< targets.length; k++) {
            for (int o = 0; o < targets[k].length(); o++) {
                if(targetNumber[k][o]==0){
                    answer[k] =-1;
                    break;
                }else{
                    answer[k] += targetNumber[k][o];
                }

            }
        }

        return answer;

    }
}