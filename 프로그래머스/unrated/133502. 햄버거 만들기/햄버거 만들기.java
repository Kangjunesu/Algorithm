import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        
        
        StringBuilder a = new StringBuilder(ingredient.length);

        for (int i : ingredient) {
            a.append(i);
            if(a.length()>3 && (a.substring(a.length()-4, a.length())).equals("1231")){
                a = new StringBuilder(a.toString().replace("1231", ""));
            }
        }

        int answer = (ingredient.length - a.length())/4;


        return answer;
        
        

//         StringBuilder a = new StringBuilder(ingredient.length*2);

//         for (int i : ingredient) {
//             a.append(i);
//         }


//         for (int i = 0; ; i++) {
//             if (a.toString().contains("1231")) {
//                 a = new StringBuilder(a.toString().replaceFirst("1231", ""));
//                 // a = new StringBuilder(a.toString().replaceAll("1231", ""));

//                 // answer ++;
//             }else{
//                 break;
//             }
//         }
//         answer =(ingredient.length -a.length())/4;
//         return answer;
    }
}