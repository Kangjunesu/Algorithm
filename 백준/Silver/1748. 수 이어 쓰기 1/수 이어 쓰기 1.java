import java.io.*;

public class Main { 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int length = input.length();
        long asw = 0;

        for(long i=1; i<=length; i++ ){
            if(i<length){
                asw += i*9*Math.pow(10,i-1);
            }else{ //i == length
                long nums = Long.parseLong(input)-(long)Math.pow(10,i-1)+1;
                asw +=i*nums;
            }
        }
        System.out.println(asw);
    }
}
