class Solution {
    public int solution(int number, int limit, int power) {
//         int answer = 0;

//         for(int i =1; i<=number; i++ ){
//             int count = 0;
//             for (int j =1; j<=i; j++){

//                 if(i%j==0){
//                     count++;
//                 }
                
//             }

//             if(count <= limit){
//                 answer += count;
//             }else{
//                 answer += power;
//             }
//         }
//         return answer;
        
          int answer = 0;

        for (int i = 1; i <= number; i++) {
            int count = 0;
            
            // i의 약수를 구할 때, 1부터 sqrt(i)까지만 검사하면 충분합니다.
            for (int j = 1; j * j <= i; j++) {
                if (i % j == 0) {
                    count++;

                    // i와 j/i가 같은 경우 중복을 피하기 위해 count를 하나만 증가시킵니다.
                    if (j != i / j) {
                        count++;
                    }
                }
            }

            if (count <= limit) {
                answer += count;
            } else {
                answer += power;
            }
        }
        
        return answer;
    }
}