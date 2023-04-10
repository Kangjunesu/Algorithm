class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[ ] sChar = s.toCharArray();  //s를 char배열로
        
        for(int i=0; i<s.length(); i++){
            if(sChar[i]==' '){
                answer +=' ';
            }else{  //2. 대소문자 판별후 -> 각각의 인덱스가 넘어가면 오버플로우되도록
                if('a'<=sChar[i] && sChar[i]<='z'){  //소문자 a~z = 97~ 122
                        if (sChar[i] <= 122 - n) {  // n만큼 더해도 z를 넘지 않는다면,
                            answer += (char)(sChar[i] + n);
                        } else {  //n만큼 더했을때 z(122)를 넘는다면 (= sChar[i]>122-n)
                            // 만약 sChar가 118이고 n이 25일때, 4를 더하면 z(122), 5를 더했을때 a(97)로 오버플로우.
                            sChar[i] = (char)('a' + (n - (122 - sChar[i] + 1)));  //sout으로 sChar 더해지는 거 확인.  문자로 출력.
                            answer += sChar[i];
                        }
                }else if('A'<=sChar[i] && sChar[i]<='Z'){ // 대문자 A ~Z =65~90
                        if (sChar[i] <= 90 - n) {  // n만큼 더해도 z를 넘지 않는다면,
                            answer += (char)(sChar[i] + n);
                        } else {  //n만큼 더했을때 z(122)를 넘는다면 (= sChar[i]>122-n)
                            // 만약 sChar가 118이고 n이 25일때, 4를 더하면 z(122), 5를 더했을때 a(97)로 오버플로우.
                            sChar[i] = (char)('A' + (n - (90 - sChar[i] + 1)));  //sout으로 sChar 더해지는 거 확인.  문자로 출력.
                            answer += sChar[i];
                        }
                }  
            } // 밖 else문 끝
        }  //밖 for문 끝
        
        return answer;
    }
}