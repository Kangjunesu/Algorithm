import java.io.*;
import java.util.*;

public class Main {
    static long n;
    static int cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());

        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());

        n =B;
        cnt=0;

        while (n>A){
            process(n);
            cnt ++;
        }

        if(n==A){
            System.out.println(cnt+1);
        }else if(n<A){
            System.out.println("-1");
        }


    }
    private static void process(long i){
        String I = String.valueOf(i);

        if(I.charAt(I.length()-1) == '1'){ //맨 뒤 숫자가 1이면
            I = I.substring(0,I.length()-1);
            n = Long.parseLong(I);
        }else if(i%2==0) { //짝수일경우
            n = i / 2;
        }else{ //홀수인데 맨뒤 숫자가 1이 아니면 불가.
            n=0;
        }
    }

}
