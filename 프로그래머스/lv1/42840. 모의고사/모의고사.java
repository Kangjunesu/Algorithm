import java.util.*;

class Solution {
    public int[] solution(int[] answers) {

        int[] oneArr = {1,2,3,4,5};
        int[] twoArr ={2, 1, 2, 3, 2, 4, 2, 5};
        int[] threeArr ={3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int [] oneAsw = new int[answers.length];
        int [] twoAsw = new int[answers.length];
        int [] threeAsw = new int[answers.length];
        
        //answer 의 크기만큼 정답의 배열 초기화 123451234512...
        for(int i =0; i< answers.length; i++){
            if(i> oneArr.length-1){
                oneAsw[i]=oneArr[i%oneArr.length];
            }else{
                oneAsw[i]=oneArr[i];
            }
            if(i> twoArr.length-1){
                twoAsw[i]=twoArr[i%twoArr.length];
            }else{
                twoAsw[i]=twoArr[i];
            }
            if(i> threeArr.length-1){
                threeAsw[i]=threeArr[i%threeArr.length];
            }else{
                threeAsw[i]=threeArr[i];
            }
        }

        // 수포자 123 순서대로 맞은 갯수 카운트
        int[] aswcnt = {0,0,0};
        int count = 0;

        for(int i=0; i< answers.length; i++){
            if(oneAsw[i]==answers[i]){
                count++;
            }
        }
        aswcnt[0]=count;
        count =0;

        for(int i=0; i< answers.length; i++){
            if(twoAsw[i]==answers[i]){
                count++;
            }
        }
        aswcnt[1]=count;
        count =0;

        for(int i=0; i< answers.length; i++){
            if(threeAsw[i]==answers[i]){
                count++;
            }
        }
        aswcnt[2]=count;
        

        int [] copySort = Arrays.copyOf(aswcnt,3);
        Arrays.sort(copySort);
        List<Integer> answrList = new ArrayList<>();
        
        if(copySort[2]==0){  //세명다 0개 맞췄을 경우
            // return {1,2,3};
        }else{
            for(int i=0; i<3; i++){
                if(copySort[2]==aswcnt[i]){
                    answrList.add(i+1);
                }
            }
        }

        int[] answer = new int[answrList.size()];
        for(int i=0; i< answer.length; i++){
            answer[i]=answrList.get(i);
        }
        return answer;
    }
}