class Solution {
    public long solution(long n) {
        
        double root = Math.sqrt(n);
        System.out.println(root);

        if(root%1==0){
            return (long)((root+1)*(root+1));
        }else{
            return -1;
        }     
        
      
    }
}