import java.util.*;
import java.lang.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String asw = "";
        
        for(int i = 0; i<a.length(); i++){
            if(97<=a.charAt(i) && a.charAt(i)<=122){ //소문자이면
                asw += Character.toUpperCase(a.charAt(i));
            }else{
                asw += Character.toLowerCase(a.charAt(i));
            }
        }
        System.out.println(asw);
    }
}