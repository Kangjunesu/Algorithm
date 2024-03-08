import java.io.*;
import java.util.*;

public class Main {

    static int [] cables;
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int K = Integer.parseInt((st.nextToken()));
        N = Integer.parseInt((st.nextToken()));
        cables = new int[K];
        long max=0;

        for(int i=0; i<K; i++){
            cables[i]= Integer.parseInt(br.readLine());
            if(max<cables[i]){
                max=cables[i];
            }
        }

        bs(1,++max);
    }


    static void bs(long l, long r){

        if(l>r){
            System.out.println((l+r)/2);
        }else{
            long cnt = 0;
            long mid = (l+r)/2;

            for(int cable : cables){
                cnt += (cable/mid);
                if(cnt>N) break;
            }

            if(cnt<N){ // 만들어야 할 수에 못미친다 -> mid 길이가 길다
                bs(l,mid-1);
            }else{
                bs(mid+1,r);
            }

        }

    }

}