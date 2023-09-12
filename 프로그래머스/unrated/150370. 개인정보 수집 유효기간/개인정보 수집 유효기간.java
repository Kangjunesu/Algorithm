import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        
        String [] todayArr = today.split("\\.");
        Set<Integer> answerSet = new HashSet<>();

        for(int i =0; i< privacies.length; i++){
            String [] a = privacies[i].split(" ");

            for(int j=0; j<a.length; j++){
                if(a[j].length()==1){
                    for(int k=0; k< terms.length; k++){
                        String [] b= terms[k].split(" ");
                        if(Objects.equals(a[j], b[0])){
                            a[j]=b[1];
                        }
                    }
                }
            }
            // System.out.println("원래 날짜, 유효기간 : " + Arrays.toString(a));

            String [] c = a[0].split("\\.");
            int d = Integer.parseInt(c[1])+ Integer.parseInt(a[1]);  //유효기간 더하기

            if(d>12){
                if(d%12==0){
                    int k = (d/12)-1;
                    c[1]= (d-(12*k))+"";
                    c[0]=(Integer.parseInt(c[0])+k)+"";
                }else{
                    int k = d/12;
                    c[1]= (d-(12*k))+"";
                    c[0]=(Integer.parseInt(c[0])+k)+"";
                }
            }else{
                c[1] = d+"";
            }

            if(Objects.equals(c[2], "01")){ //일
                if(Objects.equals(c[1], "1")){ //월
                    c[0]=(Integer.parseInt(c[0])-1)+""; //연도 -1
                    c[1] ="12";
                    c[2]="28";
                }else{ // 월은 1월이 아니고 일만 1일일 경우
                    c[1]=(Integer.parseInt(c[1])-1)+"";
                    c[2] ="28";
                }

            }else{
                c[2]=(Integer.parseInt(c[2])-1)+"";
            }
            // System.out.println("유효기간 이날까지 : " + Arrays.toString(c)); // [2022, 5, 18]

            if(Integer.parseInt(todayArr[0]) > Integer.parseInt(c[0])){
                answerSet.add(i+1);
                continue;
            }else if(Integer.parseInt(todayArr[0]) < Integer.parseInt(c[0])){
                continue;
            }else if(Integer.parseInt(todayArr[1]) > Integer.parseInt(c[1])){  //연도는 같은 경우
                answerSet.add(i+1);
                continue;
            }else if(Integer.parseInt(todayArr[1]) < Integer.parseInt(c[1])){
                continue;
            }else if(Integer.parseInt(todayArr[2]) > Integer.parseInt(c[2])){  //연도와 월이 같은 경우
                answerSet.add(i+1);
            }
        }

        int[] answer = new int[answerSet.size()];

        int index = 0;
        for (int num : answerSet) {
            answer[index++] = num;
        }
        Arrays.sort(answer);

        return answer;
    }
}