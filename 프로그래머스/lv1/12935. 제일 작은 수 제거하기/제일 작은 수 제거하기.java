import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer;

        if(arr.length==1){
            answer = new int[]{-1};            
//            System.out.println(Arrays.toString(answer));  //-1 배열 확인
            return answer;
        }else{
            answer = new int[arr.length-1];

            List<String> arrList = new ArrayList<>();
            for(int i=0; i< arr.length; i++){
                arrList.add(arr[i]+"");
            }
            // System.out.println(arrList);  //List확인

            Arrays.sort(arr);
            // System.out.println("arr의 0번쨰 인덱스 :"+arr[0]);

            arrList.remove(arr[0]+"");
            // System.out.println("가장 작은수 지워진 arrList :"+arrList);  //가장작은 수 지워진 것 확인, 현재 arrList는 String List

            for(int i=0; i< answer.length; i++){
                answer[i] =Integer.parseInt(arrList.get(i));            
            }
            return answer;
        }
        
    }
}