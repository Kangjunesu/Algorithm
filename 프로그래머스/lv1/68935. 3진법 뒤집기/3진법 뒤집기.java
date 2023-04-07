class Solution {
    public int solution(int n) {
        int answer ;
        String three = Integer.toString(n, 3); // 10진법 -> 3진법으로
        // System.out.println(three);  // 3진법의 문자열 확인

        String reverse ="";

        for (int i=0; i<three.length(); i++){
            reverse += three.charAt(three.length()-i-1);
        }
        // System.out.println(reverse);  //3진법 문자열 반전한 문자열 확인

        answer = Integer.parseInt(reverse, 3);  
        // 3진법으로 표현된 문자열을 10진법 숫자로
        // System.out.println(answer);
        return answer;
    }
}