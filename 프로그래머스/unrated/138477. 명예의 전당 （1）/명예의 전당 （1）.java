import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] result = new int[score.length];  

        List<Integer> honors = new ArrayList<>();

        if (k > score.length) {  // ex) k =9, score.length = 7 : i

            for (int i = 0; i < k; i++) {

                if (i < score.length) {     //i가 7까지
                    honors.add(score[i]);
                    Collections.sort(honors);
                    result[i] = honors.get(0);
                } else {  //i가 score.length ~k까지
                    if (i < score.length) {
                        result[i] = 0;
                    }
                }
                
            }

        } else {  //ex ) k:4 <=  score.length:10
            
            for (int i = 0; i < score.length; i++) {  // k = 4  score.length = 10 : i

                if (i < k) {
                    honors.add(score[i]);
                    Collections.sort(honors);
                    result[i] = honors.get(0);
                } else {
                    honors.add(score[i]);
                    Collections.sort(honors);
                    result[i] = honors.get(i - k + 1);
                }
            }
        }
        return result;
    }
}