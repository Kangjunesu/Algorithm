import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        
        // Map으로 만들면 될듯. 처음 인덱스를 키값으로.
        Map<Integer, String> wordsMap = new HashMap<>();//키 = 인덱스, 값= 스트링
        for(int i =0; i< strings.length; i++){
            wordsMap.put(i,strings[i]);
        }

        // n번째 인덱스의 값들만 저장하는 char 배열
        char [] stringCharArray = new char[strings.length];
        for(int i=0; i< strings.length; i++){
            stringCharArray[i] = strings[i].charAt(n);
        }

        //위에서 만든 char배열을 인덱스(키), 문자(값)으로 저장할 Map
        Map<Integer, String> charAtMap = new HashMap<>();//키 = 인덱스, 값= 문자열
        for(int i =0; i< strings.length; i++){
            charAtMap.put(i,stringCharArray[i]+"");
        }

        // Map의 값들을 List에 복사하여 정렬
        List<Map.Entry<Integer, String>> entryList = new ArrayList<>(charAtMap.entrySet());
        //Map<Integer, String> charAtMap의 값들을 List<Map.Entry<Integer, String>> entryList에 저장.
        
        Collections.sort(entryList, new Comparator<Map.Entry<Integer, String>>() {   //Collections.sort(정렬할List, 정렬 방법을 결정할 Comparator객체)
           @Override    //Map.Entry<Integer, String> 객체는 Map의 키와 값의 쌍을 나타내는 객체. List를 정렬할 때는 Map.Entry 객체의 값을 비교
            public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {  //compare메서드로 두 객체를 비교
                
                if (o1.getValue().charAt(0) == o2.getValue().charAt(0)) {  //인덱스의 값이 같은 경우
                    return wordsMap.get(o1.getKey()).compareTo(wordsMap.get(o2.getKey()));  //words맵을 이용해서 사전순으로 정렬
                }else {     // n번째 인덱스가 다른 경우 n번째 인덱스를 기준으로 정렬
                    return o1.getValue().compareTo(o2.getValue());
                }
            }
        });

        // 정렬된 List를 다시 Map에 복사하여 String[]로 변환
        String[] answer = new String[entryList.size()];
        int i = 0;
        for (Map.Entry<Integer, String> entry : entryList) {
            answer[i++] = wordsMap.get(entry.getKey());
        }
        
        return answer;
    }
}