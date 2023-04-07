class Solution {
    public String solution(String phone_number) {
                String lastFour = phone_number.substring(phone_number.length()-4);//마지막 4개 출력
        String theOthers = phone_number.substring(0,phone_number.length()-4);//뒤에 4개 빼고 앞에 출력
        String star="";
        
        for(int i =0; i<theOthers.length(); i++){
            star += "*";
        }

        String answer = star+lastFour;
        return answer;
    }
}