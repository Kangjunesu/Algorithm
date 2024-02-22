import java.io.*;
import java.util.*;

public class Main {
    static int arr[], d[], N;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new int[N+1];
        d = new int[N+1];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        d[1]=1;
        int asw=1;

        for(int i=2; i<=N; i++){
            d[i]=1;
            for(int j=1; j<i; j++){
                if(arr[i]>arr[j] && d[i]<=d[j]){
                    d[i]=d[j]+1;
                }
            }
            asw =Math.max(asw,d[i]);

        }
        System.out.println(asw);

    }
    
}