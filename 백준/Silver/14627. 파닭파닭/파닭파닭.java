import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int S = Integer.parseInt((st.nextToken()));
        int C = Integer.parseInt((st.nextToken()));

        long [] L = new long[S];

        long max = 0;
        long sum =0;
        for(int i=0; i<S; i++){
            L[i]= Long.parseLong((br.readLine()));
            sum+=L[i];
            if(max<L[i]){
                max = L[i];
            }
        }

        long l=1;
        long r =max+1;
        do{
            long mid = (l+r)/2;
            long cnt =0;
            for(long pa : L){
                cnt += pa/mid;
            }

            if(cnt<C){ //만든 개수가 요구량C보다 작다 -> 길이가 너무 길다.
                r=mid-1;
            }else{
                l=mid+1;
            }

        }while (l<=r);

        System.out.println(sum-r*C);
//        long answer =0;
////        for(long pa : L){
//            answer += pa%r;
//        }
//        System.out.println(answer);

    }
}