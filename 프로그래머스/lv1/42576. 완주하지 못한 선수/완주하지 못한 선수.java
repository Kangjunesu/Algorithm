import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer;

        Map<String, Integer> partMap = new HashMap<String, Integer>();
        Map<String, Integer> compleMap = new HashMap<String, Integer>();

        for (String s : participant) {
            if (partMap.containsKey(s)) {
                partMap.put(s, partMap.get(s) + 1);
            } else {
                partMap.put(s, 1);
            }
        }

        for (String s : completion) {
            if (compleMap.containsKey(s)) {
                compleMap.put(s, compleMap.get(s) + 1);
            } else {
                compleMap.put(s, 1);
            }
        }  //participant, completion을 HashMap

        // 안겹치는 부분 확인
        List<String> differ = new ArrayList<String>();
        for (String key : partMap.keySet()) {  // 참석자Map에서 String을 key로 for문 돌림.
            int value = partMap.get(key);  //key마다 중복되는 갯수
            if (!compleMap.containsKey(key) || compleMap.get(key) < value) { 
                //참석자의 key(string)을 완주자와 비교.
                differ.add(key);
            }
        }
        answer = differ.get(0);
        
        return answer;
    }
}