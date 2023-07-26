import java.util.*;

class Solution {
    public int solution(int[] array) {

        Arrays.sort(array);

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : array) {
            if (map.containsKey(num)) { //이미 넣은 거면
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        List<Integer> valuesList = new ArrayList<>(map.values());
        Collections.sort(valuesList);

        if(map.size()==1){ // 값이 1개 이거나, 똑같은 숫자만 나왔을 경우
            return array[0];
        }else if(valuesList.get(valuesList.size()-1) == valuesList.get(valuesList.size()-2)){  // 최빈값이 같은게 여러개
            return -1;
        }else{
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue().equals(valuesList.get(valuesList.size()-1))) {
                    return entry.getKey();
                }
            }
        }
        return -1;
        
    }
}