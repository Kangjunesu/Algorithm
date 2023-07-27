class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String a = my_string.substring(0,s);  // s앞까지의 단어
        String b = my_string.substring(s+overwrite_string.length());

        StringBuffer sb = new StringBuffer(my_string.length());
        if(b.length()==0){
            sb.append(a).append(overwrite_string);
        }else{
            sb.append(a).append(overwrite_string).append(b);
        }
        
        return sb.toString();
    }
}