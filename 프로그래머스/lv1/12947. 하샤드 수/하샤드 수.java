class Solution {
    public boolean solution(int x) {
        
        int y =0;
        int z = x;      

        while (x!=0){
            y += x%10;
            x= x/10;
        }
//        System.out.println(y); // x의 각자리의 수 합 =y

        if(z%y==0){
            return true;
        }else{
            return false;
        }
         
    }
}